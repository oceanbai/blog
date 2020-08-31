package com.oceanbai.blog.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import BaseEntry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 朋友链接
 * </p>
 *
 * @author ocean.bai
 * @since 2020-08-31
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("blog_friend_link")
@ApiModel(value="FriendLink对象", description="朋友链接")
public class FriendLink extends BaseEntry {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户ID")
    private String userId;

    @ApiModelProperty(value = "朋友链接")
    private String friendLink;

    @ApiModelProperty(value = "朋友头像地址")
    private String friendAvatarUrl;


}
