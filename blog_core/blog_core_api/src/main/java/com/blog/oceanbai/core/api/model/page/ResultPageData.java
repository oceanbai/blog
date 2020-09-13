package com.blog.oceanbai.core.api.model.page;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author ocean.bai
 * @date 2020年09月06日 8:38 下午
 */
@Data
@ApiModel(value="分页响应", description="分页响应对象")
public class ResultPageData<T> {
    /**
     * 返回数据
     */
    @ApiModelProperty(value = "响应数据")
    private List<T> list;

    /**
     * 数量总量
     */
    @ApiModelProperty(value = "数量总量")
    private long total;

    /**
     * 当前页数
     */
    @ApiModelProperty(value = "当前页数")
    private long page;

    /**
     * 每页数量
     */
    @ApiModelProperty(value = "每页数量")
    private int pageSize;
}
