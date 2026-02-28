package com.example.drug.common;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.drug.entity.Patient;

import java.util.HashMap;
import java.util.List;

/**
* 给前端返回的json数据格式
*/
public class ResultMapUtil {

    /**
     * 登录返回结果
     */
    public static HashMap<String,Object> getHashMapLogin(String msg,String code){
        HashMap<String,Object> resultMap = new HashMap<>();
        resultMap.put("msg",msg);
        resultMap.put("code",code);
        if("1".equals(code)){
            resultMap.put("icon",1);
        }else {
            resultMap.put("icon",3);
        }
        resultMap.put("anim",4);
        return resultMap;
    }

    /**
     * 分页查询结果
     */
    public static HashMap<String,Object> getHashMapMysqlPage(IPage<?> object){
        HashMap<String,Object> resultMap = new HashMap<>();
        resultMap.put("code",0);
        resultMap.put("msg","");
        resultMap.put("count",object.getTotal());
        resultMap.put("data",object.getRecords());
        return resultMap;
    }

    /**
     * 返回不需要分页的结果
     */
    public static <T> HashMap<String, Object> getHashMapListResult(List<T> list) {
        HashMap<String, Object> resultMap = new HashMap<>();
        resultMap.put("code", 0);
        resultMap.put("msg", "");
        resultMap.put("count", list.size());
        resultMap.put("data", list);
        return resultMap;
    }



    /**
     * 异常结果统一处理
     */
    public static HashMap<String,Object> getHashMapException(Exception e){
        HashMap<String,Object> resultMap = new HashMap<>();
        resultMap.put("code",0);
        resultMap.put("msg","");
        return resultMap;
    }

    /**
     * 保存成功的统一返回形式
     */
    public static HashMap<String,Object> getHashMapSave(int i) {
        HashMap<String, Object> resultMap = new HashMap<>();
        if (i == 0) {
            resultMap.put("msg", "保存失败");
            resultMap.put("code", 1);
            resultMap.put("icon", 5);
            resultMap.put("anim", 6);
        } else {
            resultMap.put("msg", "保存成功");
            resultMap.put("code", 0);
            resultMap.put("icon", 1);
            resultMap.put("anim", 4);
        }
        return resultMap;
    }

    /**
     * 删除成功的统一返回格式
     */
    public static HashMap<String,Object> getHashMapDel(int i){
        HashMap<String,Object> resultMap = new HashMap<>();
        if(i == 0){
            resultMap.put("msg","删除失败");
            resultMap.put("code",1);
            resultMap.put("icon",5);
            resultMap.put("anim",6);
        }else {
            resultMap.put("msg","删除成功");
            resultMap.put("code",0);
            resultMap.put("icon",1);
            resultMap.put("anim",4);
        }
        return resultMap;
    }

}
