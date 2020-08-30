package com.oceanbai.blog.mapper.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户信息表entity
 *
 * @author ocean.bai
 * @date 2020/8/30
 */
@Data
@TableName("bl_user")
public class UserInfo implements Serializable {

    /**
     * id
     */
    private String id;

    /**
     * Ip
     */
    private String userIp;
}
