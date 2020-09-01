package com.oceanbai.blog.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.oceanbai.blog.dao.BaseEntry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 分类表
 * </p>
 *
 * @author ocean.bai
 * @since 2020-08-31
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("blog_sort")
@ApiModel(value="Sort对象", description="分类表")
public class Sort extends BaseEntry {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "分类名称")
    private String sortName;

    @ApiModelProperty(value = "分类别名")
    private String sortAlias;

    @ApiModelProperty(value = "父分类ID")
    private Long parentSortId;


}
