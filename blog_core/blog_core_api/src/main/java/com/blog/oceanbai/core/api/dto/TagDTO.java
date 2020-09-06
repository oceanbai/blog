package com.blog.oceanbai.core.api.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 标签表
 * </p>
 *
 * @author ocean.bai
 * @since 2020-08-31
 */
@Data
@ApiModel(value="TagDTO对象", description="标签")
public class TagDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "标签名")
    private String tagName;

    @ApiModelProperty(value = "关联的文章数量")
    private Integer linkArticleCount;

    @ApiModelProperty(value = "排序序号")
    private Integer sortNumber;


}
