package com.blog.oceanbai.core.api.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author ocean.bai
 * @date 2020年09月06日 5:53 下午
 */
@Data
@ApiModel(value="Tag展示对象", description="标签展示信息")
public class TagVO implements Serializable {

    @ApiModelProperty(value = "id")
    private String id;

    @ApiModelProperty(value = "标签名")
    private String tagName;

    @ApiModelProperty(value = "关联的文章数量")
    private Integer linkArticleCount;

    @ApiModelProperty(value = "排序序号")
    private Integer sortNumber;
}
