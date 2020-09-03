package com.blog.oceanbai.core.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author ocean.bai
 * @date 2020/9/1
 */
@Data
@ApiModel(value="Article对象", description="文章管理表")
public class ArticleDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "发表用户ID")
    private Long adminId;

    @ApiModelProperty(value = "博文标题")
    private String articleTitle;

    @ApiModelProperty(value = "博文内容")
    private String articleContent;

}
