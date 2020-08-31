package com.oceanbai.blog.service.impl;

import com.oceanbai.blog.mapper.dao.UserMapper;
import com.oceanbai.blog.mapper.entity.User;
import com.oceanbai.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户信息业务实现类
 *
 * @author longzhang.wang
 * @Date 2019年11月5日
 */
@Service()
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserInfoById(Long id) throws Exception {

        return null;
    }
}
