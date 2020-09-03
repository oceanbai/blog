package com.blog.oceanbai.core.service.impl;

import com.blog.oceanbai.core.dao.entity.TagLinks;
import com.blog.oceanbai.core.dao.mapper.TagLinksMapper;
import com.blog.oceanbai.core.service.ITagLinksService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章与标签表的关系表 服务实现类
 * </p>
 *
 * @author ocean.bai
 * @since 2020-08-31
 */
@Service
public class TagLinksServiceImpl extends ServiceImpl<TagLinksMapper, TagLinks> implements ITagLinksService {

}
