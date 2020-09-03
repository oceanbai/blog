package com.blog.oceanbai.core.api.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ocean.bai
 * @date 2020年09月03日 10:23 下午
 */
@Data
public class ArticleCondition implements Serializable {

    /**
     * 分类
     */
    private String sort;

    /**
     * 标签
     */
    private String tag;

    /**
     * 是否删除
     */
    private String isDelete;

    /**
     * 是否展示
     */
    private String isShow;

    /**
     * 文章标题
     */
    private String articleTitle;

    /**
     * 文章内容
     */
    private String articleContent;
}
