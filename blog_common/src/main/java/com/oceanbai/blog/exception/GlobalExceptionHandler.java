package com.oceanbai.blog.exception;

import com.oceanbai.blog.constant.ReturnCode;
import com.oceanbai.blog.model.response.BlogResultDataResponse;
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
    public BlogResultDataResponse<String> handleMethodArgumentNotValidException(Exception e) {
        log.error("系统出现异常",e);
        BlogResultDataResponse<String> result = new BlogResultDataResponse<>();
        result.setCode(ReturnCode.FAILURE.getCode());
        result.setMessage(ReturnCode.FAILURE.getMessage());
        return result;
    }

}
