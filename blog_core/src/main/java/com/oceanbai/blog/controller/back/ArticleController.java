package com.oceanbai.blog.controller.back;


import com.oceanbai.blog.model.dto.ArticleDTO;
import com.oceanbai.common.blog.model.response.BlogApiResponse;
import com.oceanbai.blog.service.IArticleService;
import com.oceanbai.blog.service.impl.ArticleServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 * 文章管理表 前端控制器
 * </p>
 *
 * @author ocean.bai
 * @since 2020-08-31
 */
@RestController
@RequestMapping("/blog/article")
public class ArticleController {

    @Resource
    private IArticleService articleService;

    @ApiOperation("增加文章")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public BlogApiResponse<ArticleDTO> addArticle(@RequestBody ArticleDTO articleDTO) {
        BlogApiResponse<ArticleDTO> blogApiResponse = BlogApiResponse.ok(articleService.addArticle(articleDTO));
        return blogApiResponse;
    }

    @ApiOperation("删除文章")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public BlogApiResponse<Void> deleteArticle(String articleId) {
        return new BlogApiResponse<>();
    }

    @ApiOperation("修改文章")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public BlogApiResponse<Void> updateArticle(ArticleDTO articleDTO) {
        return new BlogApiResponse<>();
    }

    @ApiOperation("获取文章列表")
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public BlogApiResponse<Void> getArticleList(ArticleDTO articleDTO) {
        return new BlogApiResponse<>();
    }

}
