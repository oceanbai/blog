package com.oceanbai.blog.dao;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author bby15929
 * @date 2020年09月01日14:07:24
 */
public class BaseEntry {
    @Id
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
}
