package com.blog.oceanbai.core.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.blog.oceanbai.core.dao.BaseEntry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 文章与标签表的关系表
 * </p>
 *
 * @author ocean.bai
 * @since 2020-08-31
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("blog_tag_links")
@ApiModel(value="TagLinks对象", description="文章与标签表的关系表")
public class TagLinks extends BaseEntry {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "标签ID")
    private Long tagId;

    @ApiModelProperty(value = "文章ID")
    private Long articleId;

    public TagLinks(){
    }
    public TagLinks(long id){
        super(id);
    }
}
