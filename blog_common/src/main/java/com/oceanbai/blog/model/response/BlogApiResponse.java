package com.oceanbai.blog.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.oceanbai.blog.constant.ReturnCode;
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
public class BlogApiResponse<T> extends RestfulResponse {
    private static final long serialVersionUID = -1;

    @JsonProperty("data")
    @ApiModelProperty(value = "泛型对象", example = "{'id':'', 'name':''}")
    private T data;

    public BlogApiResponse(T data) {
        this.data = data;
    }

    public static <T> BlogApiResponse<T> ok(){
        BlogApiResponse<T> blogApiResponse = new BlogApiResponse<>();
        blogApiResponse.setCodeAndMessage(ReturnCode.SUCCESS);
        return blogApiResponse;
    }

    public static <T> BlogApiResponse<T> fail(){
        BlogApiResponse<T> blogApiResponse = new BlogApiResponse<>();
        blogApiResponse.setCodeAndMessage(ReturnCode.FAILURE);
        return blogApiResponse;
    }

    public static <T> BlogApiResponse<T> ok(T data){
        BlogApiResponse<T> blogApiResponse = new BlogApiResponse<>();
        blogApiResponse.setData(data);
        blogApiResponse.setCodeAndMessage(ReturnCode.SUCCESS);
        return blogApiResponse;
    }

    public static <T> BlogApiResponse<T> fail(T data){
        BlogApiResponse<T> blogApiResponse = new BlogApiResponse<>();
        blogApiResponse.setData(data);
        blogApiResponse.setCodeAndMessage(ReturnCode.FAILURE);
        return blogApiResponse;
    }

    public void setCodeAndMessage(ReturnCode returnCode){
        setCode(returnCode.getCode());
        setMessage(returnCode.getMessage());
    }
}
