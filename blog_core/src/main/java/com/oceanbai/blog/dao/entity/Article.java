package com.oceanbai.blog.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.oceanbai.blog.dao.BaseEntry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 文章管理表
 * </p>
 *
 * @author ocean.bai
 * @since 2020-08-31
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("blog_article")
@ApiModel(value="Article对象", description="文章管理表")
public class Article extends BaseEntry {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "发表用户ID")
    private Long adminId;

    @ApiModelProperty(value = "博文标题")
    private String articleTitle;

    @ApiModelProperty(value = "博文内容")
    private String articleContent;


}
