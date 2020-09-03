package com.blog.oceanbai.core.api.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author ocean.bai
 * @date 2020年09月03日 10:29 下午
 */
@Data
@ApiModel(value="Sort对象", description="分类表")
public class SortDTO {

    @ApiModelProperty(value = "分类主键")
    private String sortId;

    @ApiModelProperty(value = "分类名称")
    private String sortName;

    @ApiModelProperty(value = "分类别名")
    private String sortAlias;

    @ApiModelProperty(value = "父分类ID")
    private Long parentSortId;

    @ApiModelProperty(value = "排序序号")
    private Integer sortNumber;
}
