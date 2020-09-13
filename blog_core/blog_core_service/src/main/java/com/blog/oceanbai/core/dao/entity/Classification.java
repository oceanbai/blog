package com.blog.oceanbai.core.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.blog.oceanbai.core.dao.BaseEntry;
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
@TableName("blog_classification")
@ApiModel(value="Classification对象", description="分类表")
public class Classification extends BaseEntry {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "分类名称")
    private String classificationName;

    @ApiModelProperty(value = "分类别名")
    private String classificationAlias;

    @ApiModelProperty(value = "父分类ID")
    private Long parentId;

    @ApiModelProperty(value = "排序序号")
    private Integer sortNumber;

    public Classification(){
    }
    public Classification(long id){
        super(id);
    }
}
