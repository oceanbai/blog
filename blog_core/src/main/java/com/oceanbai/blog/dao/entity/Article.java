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
public class Article extends BaseEntry {

    private static final long serialVersionUID = 1L;

    /**
     * 发表用户ID
     */
    private Long adminId;

    /**
     * 博文标题
     */
    private String articleTitle;

    /**
     * 博文内容
     */
    private String articleContent;

    /**
     * 浏览量
     */
    private String articleViews;

    /**
     * 评论总数
     */
    private String articleCommentCount;

    /**
     * 是否展示(0展示 1不展示)
     */
    private String isShow;

    public Article(){
    }
    public Article(long id){
        super(id);
    }
}
