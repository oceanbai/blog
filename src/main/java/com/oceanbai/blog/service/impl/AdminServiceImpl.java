package com.oceanbai.blog.service.impl;

import com.oceanbai.blog.entity.Admin;
import com.oceanbai.blog.mapper.AdminMapper;
import com.oceanbai.blog.service.IAdminService;
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
