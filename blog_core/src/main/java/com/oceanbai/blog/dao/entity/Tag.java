package com.oceanbai.blog.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.oceanbai.blog.dao.BaseEntry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 标签表
 * </p>
 *
 * @author ocean.bai
 * @since 2020-08-31
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("blog_tag")
@ApiModel(value="Tag对象", description="标签表")
public class Tag extends BaseEntry {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "标签名")
    private String tagName;

    @ApiModelProperty(value = "关联的文章数量")
    private Integer linkArticleCount;


}
