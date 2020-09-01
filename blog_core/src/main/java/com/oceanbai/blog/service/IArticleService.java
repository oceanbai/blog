package com.oceanbai.blog.service;

import com.oceanbai.blog.dao.entity.Article;
import com.baomidou.mybatisplus.extension.service.IService;
import com.oceanbai.blog.model.dto.ArticleDTO;
import com.oceanbai.blog.model.response.BlogApiResponse;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
