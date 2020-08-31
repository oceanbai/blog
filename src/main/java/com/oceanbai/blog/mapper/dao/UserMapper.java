package com.oceanbai.blog.mapper.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.oceanbai.blog.mapper.entity.User;
import org.springframework.stereotype.Repository;

/**
 * 用户信息mapper映射
 *
 * @author ocean.bai
 * @date 2020/8/30
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

}
