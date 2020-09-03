package com.blog.oceanbai.core.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.blog.oceanbai.core.dao.BaseEntry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 管理员表
 * </p>
 *
 * @author ocean.bai
 * @since 2020-08-31
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("blog_admin")
@ApiModel(value="Admin对象", description="管理员表")
public class Admin extends BaseEntry {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "账号")
    private String account;

    @ApiModelProperty(value = "密码")
    private String passward;

    @ApiModelProperty(value = "头像地址")
    private String avatarUrl;

    @ApiModelProperty(value = "关于")
    private String about;

    @ApiModelProperty(value = "简言")
    private String simpleTalk;


}
