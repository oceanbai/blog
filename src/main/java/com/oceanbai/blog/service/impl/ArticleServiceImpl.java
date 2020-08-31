package com.oceanbai.blog.service.impl;

import com.oceanbai.blog.entity.Article;
import com.oceanbai.blog.mapper.ArticleMapper;
import com.oceanbai.blog.service.IArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章管理表 服务实现类
 * </p>
 *
 * @author ocean.bai
 * @since 2020-08-31
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService {

}
