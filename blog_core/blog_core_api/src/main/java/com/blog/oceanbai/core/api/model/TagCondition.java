package com.blog.oceanbai.core.api.model;

import com.blog.oceanbai.core.api.model.page.BasePager;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author ocean.bai
 * @date 2020年09月06日 5:51 下午
 */

@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value="标签查询分页对象", description="标签查询分页")
public class TagCondition extends BasePager {
    /**
     * 标签名称
     */
    @ApiModelProperty(value = "标签名称")
    private String tagName;
}
