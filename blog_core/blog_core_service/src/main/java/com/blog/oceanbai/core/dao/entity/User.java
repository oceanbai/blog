package com.blog.oceanbai.core.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.blog.oceanbai.core.dao.BaseEntry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author ocean.bai
 * @since 2020-08-31
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("blog_user")
@ApiModel(value="User对象", description="用户表")
public class User extends BaseEntry {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户IP")
    private String userIp;

    @ApiModelProperty(value = "用户名备注")
    private String userNameRemark;

    @ApiModelProperty(value = "用户密码")
    private String userPassword;

    @ApiModelProperty(value = "用户昵称")
    private String userNickname;

    @ApiModelProperty(value = "用户邮箱")
    private String userEmail;

    @ApiModelProperty(value = "用户头像")
    private String userProfileUrl;

    @ApiModelProperty(value = "用户简介")
    private String userDescription;

    @ApiModelProperty(value = "用户生日")
    private LocalDateTime userBirthday;

    @ApiModelProperty(value = "用户年龄")
    private Integer userAge;

    @ApiModelProperty(value = "用户手机号")
    private String userTelephoneNumber;

    @ApiModelProperty(value = "注册时间")
    private LocalDateTime userRegistrationTime;

    public User(){
    }
    public User(long id){
        super(id);
    }
}
