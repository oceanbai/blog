package com.blog.oceanbai.core.service.impl;

import com.blog.oceanbai.core.dao.entity.Tag;
import com.blog.oceanbai.core.dao.mapper.TagMapper;
import com.blog.oceanbai.core.service.ITagService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 标签表 服务实现类
 * </p>
 *
 * @author ocean.bai
 * @since 2020-08-31
 */
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements ITagService {

}
