package com.blog.oceanbai.core.service;

import com.blog.oceanbai.core.dao.entity.Article;
import com.baomidou.mybatisplus.extension.service.IService;
import com.blog.oceanbai.core.model.dto.ArticleDTO;

import java.util.List;

/**
 * <p>
 * 文章管理表 服务类
 * </p>
 *
 * @author ocean.bai
 * @since 2020-08-31
 */
public interface IArticleService extends IService<Article> {
    ArticleDTO addArticle(ArticleDTO articleDTO);

    String deleteArticle(String articleId);

    ArticleDTO updateArticle(ArticleDTO articleDTO);

    List<ArticleDTO> getArticleList(ArticleDTO articleDTO);
}
