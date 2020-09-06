package com.blog.oceanbai.core.api.model.page;

import lombok.Data;

/**
 * @author ocean.bai
 * @date 2020年09月06日 8:38 下午
 */
@Data
public class ResultPageData<T> {
    /**
     * 返回数据
     */
    private T data;

    /**
     * 数量总量
     */
    private int pageTotal;

    /**
     * 当前页数
     */
    private int page;

    /**
     * 每页数量
     */
    private int pageSize;
}
