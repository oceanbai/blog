package com.blog.oceanbai.core.controller.back;


import com.blog.oceanbai.common.model.response.BlogApiResponse;
import com.blog.oceanbai.core.api.dto.TagDTO;
import com.blog.oceanbai.core.api.model.TagCondition;
import com.blog.oceanbai.core.api.vo.TagVO;
import com.blog.oceanbai.core.service.ITagService;
import com.github.pagehelper.Page;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import javax.annotation.Resource;

/**
 * <p>
 * 标签表 前端控制器
 * </p>
 *
 * @author ocean.bai
 * @since 2020-08-31
 */
@Slf4j
@RestController
@RequestMapping("/blog/tag")
public class TagController {

    @Resource
    private ITagService iTagService;

    @ApiOperation("增加标签")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public BlogApiResponse<TagDTO> addTag(@RequestBody TagDTO tagDTO) {
        BlogApiResponse<TagDTO> blogApiResponse = BlogApiResponse.ok(iTagService.addTag(tagDTO));
        return blogApiResponse;
    }

    @ApiOperation("删除标签")
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public BlogApiResponse<Boolean> getDeleteTagResult(String tagId) {
        return iTagService.deleteTag(tagId);
    }

    @ApiOperation("修改标签")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public BlogApiResponse<Void> updateTag(TagDTO tagDTO) {
        return new BlogApiResponse<>();
    }

    @ApiOperation("获取标签列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public BlogApiResponse<Page<TagVO>> getTagList(@ApiIgnore TagCondition tagCondition) {
        Page<TagVO> page = iTagService.getTagList(tagCondition);
        return BlogApiResponse.ok(page);
    }


}
