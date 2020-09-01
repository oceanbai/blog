package com.oceanbai.blog.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author bby15929
 * @date 2020年09月01日16:10:51
 */
@Data
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RestfulResponse implements Response{
    /**
     * 返回状态码
     */
    @JsonProperty("code")
    @ApiModelProperty(value = "返回状态码", example = "666666", required = true)
    private String code = GlobalResponseEnum.SUCCESS.getCode();

    @JsonProperty("message")
    @ApiModelProperty(value = "返回消息", example = "成功", required = true)
    private String message;
}
