package com.blog.oceanbai.core.api.model.page;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author ocean.bai
 * @date 2020年09月06日 6:02 下午
 */
@Data
public class BasePager implements Serializable {
    /**
     * 当前页数
     */
    @ApiModelProperty(value = "当前页数")
    private int page;

    /**
     * 每页数量
     */
    @ApiModelProperty(value = "每页数量")
    private int pageSize;
}
