package com.blog.oceanbai.core.api.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ocean.bai
 * @date 2020年09月03日 10:29 下午
 */
@Data
@ApiModel(value="Classification对象", description="分类表")
public class ClassificationDTO {

    @ApiModelProperty(value = "父分类ID")
    private String id;

    @ApiModelProperty(value = "分类节点标志")
    private String classificationCode;

    @ApiModelProperty(value = "分类名称")
    private String classificationName;

    @ApiModelProperty(value = "分类别名")
    private String classificationAlias;

    @ApiModelProperty(value = "父分类ID")
    private String parentId;

    @ApiModelProperty(value = "排序序号")
    private Integer sortNumber;

    protected List<ClassificationDTO> children = new ArrayList<>();

    public void add(ClassificationDTO node) {
        children.add(node);
    }
}
