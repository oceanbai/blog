package com.oceanbai.blog.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author bby15929
 * @date 2020年09月01日16:08:57
 */
@Data
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class BlogResultDataResponse<T> extends RestfulResponse {
    private static final long serialVersionUID = -1;

    @JsonProperty("data")
    @ApiModelProperty(value = "泛型对象", example = "{'id':'', 'name':''}")
    private T data;

    public BlogResultDataResponse(T data) {
        this.data = data;
    }
}
