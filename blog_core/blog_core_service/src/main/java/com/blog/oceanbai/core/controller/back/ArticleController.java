package com.blog.oceanbai.core.controller.back;


import com.blog.oceanbai.core.api.dto.ArticleDTO;
import com.blog.oceanbai.core.api.model.ArticleCondition;
import com.blog.oceanbai.core.service.IArticleService;
import com.blog.oceanbai.common.model.response.BlogApiResponse;
import io.swagger.annotations.Api;
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
@Api(tags = "文章管理接口")
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
    public BlogApiResponse<Void> getArticleList(ArticleCondition articleCondition) {
        return new BlogApiResponse<>();
    }

}
