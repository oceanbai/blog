package com.blog.oceanbai.core.dao;

import com.baomidou.mybatisplus.annotation.TableId;
import com.blog.oceanbai.common.constant.CommonConstant;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.time.LocalDateTime;

/**
 * @author bby15929
 * @date 2020年09月01日14:07:24
 */
@Data
public class BaseEntry {
    @TableId
    @Column(name = "id")
    private Long id;

    /**
     * 是否删除（0未删除，1已删除）
     */
    @Column(name = "is_deleted")
    private String isDeleted;

    /**
     * 创建人
     */
    @Column(name = "created_by_id")
    private String createdById;

    /**
     * 创建日期
     */
    @Column(name = "created_time")
    private LocalDateTime createdTime;

    /**
     * 最后更新人
     */
    @Column(name = "lastmodified_by_id")
    private String lastmodifiedById;

    /**
     * 最后更新日期
     */
    @Column(name = "lastmodified_time")
    private LocalDateTime lastmodifiedTime;

    public BaseEntry(){
    }

    public BaseEntry(long id){
        this.id = id;
        this.isDeleted = CommonConstant.DELETE_TAG_NO;
        this.createdById = CommonConstant.CREATE_ID;
        this.createdTime = LocalDateTime.now();
        this.lastmodifiedById = CommonConstant.UPDATE_ID;
        this.lastmodifiedTime = LocalDateTime.now();
    }
}
