package com.example.drug.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 *
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("t_upload_file")
public class UploadFile implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 原文件名
     */
    private String oldName;

    /**
     * 新文件名
     */
    private String newName;

    /**
     * 上传路径
     */
    private String urlPath;

    /**
     * 文件大小
     */
    private String size;

    /**
     * 文件类型
     */
    private String fileType;

    /**
     * 上传时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createdDate;


}
