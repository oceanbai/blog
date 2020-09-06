package com.blog.oceanbai.core.api.model;

import com.blog.oceanbai.core.api.model.page.BasePager;
import lombok.Data;

/**
 * @author ocean.bai
 * @date 2020年09月06日 5:51 下午
 */
@Data
public class TagCondition extends BasePager {
    /**
     * 标签名称
     */
    private String tagName;
}
