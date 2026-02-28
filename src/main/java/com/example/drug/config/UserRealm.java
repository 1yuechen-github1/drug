package com.example.drug.config;

import com.example.drug.entity.Admin;
import com.example.drug.entity.User;
import com.example.drug.service.IAdminService;
import com.example.drug.service.IUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 权限认证
 */
public class UserRealm extends AuthorizingRealm {
    @Autowired
    private IUserService userService;

    @Autowired
    private IAdminService adminService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    /**
     * 登录认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        if (authenticationToken instanceof UserToken) //普通用户的认证逻辑
        {
            UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
            String username = token.getUsername();
            User queryUser = new User();
            queryUser.setUsername(username);
            //根据用户名查询用户是否存在
            User user = userService.queryUserByUsername(queryUser);
            if (user == null) {
                return null;
            }
            return new SimpleAuthenticationInfo(user, user.getPassword(), getName());
        } else if (authenticationToken instanceof AdminToken) //管理员的认证逻辑
        {
            UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
            String username = token.getUsername();
            Admin queryAdmin = new Admin();
            queryAdmin.setAdminname(username);
            //根据用户名查询用户是否存在
            Admin admin = adminService.queryAdminByAdminname(queryAdmin);
            if (admin == null) {
                return null;
            }
            return new SimpleAuthenticationInfo(admin, admin.getPassword(), getName());
        } else
            return null;

/*        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String username = token.getUsername();
        User queryUser = new User();
        queryUser.setUsername(username);
        //根据用户名查询用户是否存在
        User user = userService.queryUserByUsername(queryUser);
        if(user==null){
            return null;
        }
        return new SimpleAuthenticationInfo(user,user.getPassword(),getName());
    }*/
    }
}
