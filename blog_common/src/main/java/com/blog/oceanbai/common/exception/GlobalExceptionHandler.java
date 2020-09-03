package com.blog.oceanbai.common.exception;

import com.blog.oceanbai.common.constant.ReturnCode;
import com.blog.oceanbai.common.model.response.BlogApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author bby15929
 * @date 2020年09月01日16:01:38
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public BlogApiResponse<String> handleMethodArgumentNotValidException(Exception e) {
        log.error("系统出现异常",e);
        BlogApiResponse<String> result = new BlogApiResponse<>();
        result.setCode(ReturnCode.FAILURE.getCode());
        result.setMessage(ReturnCode.FAILURE.getMessage());
        return result;
    }

}
