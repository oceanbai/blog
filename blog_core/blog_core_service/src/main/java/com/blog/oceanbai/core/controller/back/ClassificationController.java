package com.blog.oceanbai.core.controller.back;


import com.blog.oceanbai.common.model.response.BlogApiResponse;
import com.blog.oceanbai.core.api.dto.ArticleDTO;
import com.blog.oceanbai.core.api.dto.ClassificationDTO;
import com.blog.oceanbai.core.api.vo.SortVO;
import com.blog.oceanbai.core.service.IClassificationService;
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
@RequestMapping("/blog/classification")
public class ClassificationController {

    @Resource
    private IClassificationService iClassificationService;
    @ApiOperation("增加分类")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public BlogApiResponse<ClassificationDTO> addSort(@RequestBody ClassificationDTO classificationDTO) {
        BlogApiResponse<ClassificationDTO> blogApiResponse = BlogApiResponse.ok(iClassificationService.addClassification(classificationDTO));
        return blogApiResponse;
    }

    @ApiOperation("删除分类")
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public BlogApiResponse<Void> deleteSort(String articleId) {
        return new BlogApiResponse<>();
    }

    @ApiOperation("修改分类")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public BlogApiResponse<ClassificationDTO> updateSort(@RequestBody ClassificationDTO classificationDTO) {
        BlogApiResponse<ClassificationDTO> blogApiResponse = BlogApiResponse.ok(iClassificationService.updateClassification(classificationDTO));
        return blogApiResponse;
    }

    @ApiOperation("获取分类列表")
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public BlogApiResponse<List<SortVO>> getSortList() {
        return new BlogApiResponse<>();
    }


}
