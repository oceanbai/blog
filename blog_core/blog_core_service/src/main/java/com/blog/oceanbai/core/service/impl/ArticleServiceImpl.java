package com.blog.oceanbai.core.service.impl;

import com.blog.oceanbai.core.dao.entity.Article;
import com.blog.oceanbai.core.dao.mapper.ArticleMapper;
import com.blog.oceanbai.core.api.dto.ArticleDTO;
import com.blog.oceanbai.core.service.IArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blog.oceanbai.core.utils.SnowFlakeIdUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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

    @Resource
    private SnowFlakeIdUtil snowFlakeIdUtil;

    @Override
    public ArticleDTO addArticle(ArticleDTO articleDTO) {
        Article article = new Article(snowFlakeIdUtil.nextId());
        BeanUtils.copyProperties(articleDTO,article);
        baseMapper.insert(article);
        return articleDTO;
    }

    @Override
    public String deleteArticle(String articleId) {
        return null;
    }

    @Override
    public ArticleDTO updateArticle(ArticleDTO articleDTO) {
        return null;
    }

    @Override
    public List<ArticleDTO> getArticleList(ArticleDTO articleDTO) {
        return null;
    }
}
