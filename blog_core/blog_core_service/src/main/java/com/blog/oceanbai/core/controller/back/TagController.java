package com.blog.oceanbai.core.controller.back;


import com.blog.oceanbai.common.model.response.BlogApiResponse;
import com.blog.oceanbai.core.api.dto.TagDTO;
import com.blog.oceanbai.core.api.model.TagCondition;
import com.blog.oceanbai.core.api.model.page.ResultPageData;
import com.blog.oceanbai.core.api.vo.TagVO;
import com.blog.oceanbai.core.service.ITagService;
import com.github.pagehelper.Page;
import com.sun.org.glassfish.gmbal.ParameterNames;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
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
@Api(tags = "标签管理接口")
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
    @ApiImplicitParams(
            @ApiImplicitParam(name = "tagId", value = "标签Id", required = true, paramType = "String", dataType = "String"))
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public BlogApiResponse<Boolean> getDeleteTagResult(String tagId) {
        return iTagService.deleteTag(tagId);
    }

    @ApiOperation("修改标签")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public BlogApiResponse<TagDTO> updateTag(@RequestBody TagDTO tagDTO) {
        BlogApiResponse<TagDTO> blogApiResponse = BlogApiResponse.ok(iTagService.updateTag(tagDTO));
        return blogApiResponse;
    }

    @ApiOperation("获取标签列表")
    @ApiImplicitParams({@ApiImplicitParam(name = "tagName", value = "标签名称", paramType = "String", dataType = "String"),
            @ApiImplicitParam(name = "page", value = "当前页数", required = true, paramType = "int", dataType = "int"),
            @ApiImplicitParam(name = "pageSize", value = "每页数量", required = true, paramType = "int", dataType = "int")})
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public BlogApiResponse<ResultPageData<TagVO>> getTagList(@ApiIgnore TagCondition tagCondition) {
        Page<TagVO> page = iTagService.getTagList(tagCondition);
        ResultPageData<TagVO> resultPageData = new ResultPageData<>();
        resultPageData.setList(page.getResult());
        resultPageData.setPage(page.getPageNum());
        resultPageData.setPageSize(page.getPageSize());
        resultPageData.setPage(page.getTotal());
        return BlogApiResponse.ok(resultPageData);
    }


}
