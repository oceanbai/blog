package com.blog.oceanbai.core.controller.back;


import com.blog.oceanbai.common.model.response.BlogApiResponse;
import com.blog.oceanbai.core.api.dto.ArticleDTO;
import com.blog.oceanbai.core.api.dto.SortDTO;
import com.blog.oceanbai.core.api.vo.SortVO;
import com.blog.oceanbai.core.service.ISortService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 分类表 前端控制器
 * </p>
 *
 * @author ocean.bai
 * @since 2020-08-31
 */
@RestController
@RequestMapping("/blog/sort")
public class SortController {

    @Resource
    private ISortService iSortService;
    @ApiOperation("增加分类")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public BlogApiResponse<SortDTO> addSort(@RequestBody SortDTO sortDTO) {
        BlogApiResponse<SortDTO> blogApiResponse = BlogApiResponse.ok(iSortService.addSort(sortDTO));
        return blogApiResponse;
    }

    @ApiOperation("删除分类")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public BlogApiResponse<Void> deleteSort(String articleId) {
        return new BlogApiResponse<>();
    }

    @ApiOperation("修改分类")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public BlogApiResponse<Void> updateSort(ArticleDTO articleDTO) {
        return new BlogApiResponse<>();
    }

    @ApiOperation("获取分类列表")
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public BlogApiResponse<List<SortVO>> getSortList() {
        return new BlogApiResponse<>();
    }


}
