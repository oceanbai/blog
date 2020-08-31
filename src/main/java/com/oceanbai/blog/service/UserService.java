package com.oceanbai.blog.service;

import com.oceanbai.blog.mapper.entity.User;

/**
 * 用户信息接口
 *
 * @author longzhang.wang
 * @Date 2019年11月5日
 */
public interface UserService {

    /**
     * 根据id查询用户
     * @param id
     * @return
     * @throws Exception
     */
    User getUserInfoById(Long id) throws Exception;

}
