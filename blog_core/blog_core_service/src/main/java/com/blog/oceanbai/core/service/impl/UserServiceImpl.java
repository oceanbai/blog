package com.blog.oceanbai.core.service.impl;

import com.blog.oceanbai.core.dao.entity.User;
import com.blog.oceanbai.core.dao.mapper.UserMapper;
import com.blog.oceanbai.core.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author ocean.bai
 * @since 2020-08-31
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
