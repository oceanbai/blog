package com.blog.oceanbai.core.service.impl;

import com.blog.oceanbai.core.dao.entity.Admin;
import com.blog.oceanbai.core.dao.mapper.AdminMapper;
import com.blog.oceanbai.core.service.IAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 管理员表 服务实现类
 * </p>
 *
 * @author ocean.bai
 * @since 2020-08-31
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

}
