package com.oceanbai.blog.service.impl;

import com.oceanbai.blog.dao.entity.Sort;
import com.oceanbai.blog.dao.mapper.SortMapper;
import com.oceanbai.blog.service.ISortService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 分类表 服务实现类
 * </p>
 *
 * @author ocean.bai
 * @since 2020-08-31
 */
@Service
public class SortServiceImpl extends ServiceImpl<SortMapper, Sort> implements ISortService {

}
