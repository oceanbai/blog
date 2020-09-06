package com.blog.oceanbai.core.controller.back;


import com.blog.oceanbai.common.model.response.BlogApiResponse;
import com.blog.oceanbai.core.api.dto.ArticleDTO;
import com.blog.oceanbai.core.api.dto.TagDTO;
import com.blog.oceanbai.core.api.model.ArticleCondition;
import com.blog.oceanbai.core.api.model.TagCondition;
import com.blog.oceanbai.core.api.vo.TagVO;
import com.blog.oceanbai.core.service.ITagService;
import com.github.pagehelper.Page;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 标签表 前端控制器
 * </p>
 *
 * @author ocean.bai
 * @since 2020-08-31
 */
@RestController
@RequestMapping("/blog/tag")
public class TagController {

    @Resource
    private ITagService iTagService;

    @ApiOperation("增加标签")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public BlogApiResponse<TagDTO> addArticle(@RequestBody TagDTO tagDTO) {
        BlogApiResponse<TagDTO> blogApiResponse = BlogApiResponse.ok(iTagService.addTag(tagDTO));
        return blogApiResponse;
    }

    @ApiOperation("删除标签")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public BlogApiResponse<Boolean> deleteArticle(String tagId) {
        return iTagService.deleteTag(tagId);
    }

    @ApiOperation("修改标签")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public BlogApiResponse<Void> updateArticle(ArticleDTO articleDTO) {
        return new BlogApiResponse<>();
    }

    @ApiOperation("获取标签列表")
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public BlogApiResponse<Page<List<TagVO>>> getArticleList(TagCondition tagCondition) {
        Page<List<TagVO>> page = iTagService.getTagList(tagCondition);
        return BlogApiResponse.ok(page);
    }


}
