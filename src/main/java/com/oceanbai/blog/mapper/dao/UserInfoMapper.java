package com.oceanbai.blog.mapper.dao;

import com.oceanbai.blog.mapper.entity.UserInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户信息mapper映射
 *
 * @author longzhang.wang
 * @date 2019年11月5日
 */
@Repository
public interface UserInfoMapper {

    UserInfo getUserInfoById(Long id);

    List<UserInfo> getUserInfoList(UserInfo userInfo);

    int insertUserInfo(UserInfo userInfo);

    int insertUserInfoCondition(UserInfo userInfo);
}
