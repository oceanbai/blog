package com.blog.oceanbai.common.constant;

import com.google.common.collect.ImmutableMap;
import com.blog.oceanbai.common.model.response.Response;

/**
 * @author bby15929
 * @date 2020年09月01日16:19:37
 */
public enum ReturnCode implements Response {
    /**
     * 接口结果响应码
     */
    SUCCESS("0","请求成功"),
    FAILURE("-1","系统繁忙，请稍候重试");

    private final String code;

    private final String message;

    ReturnCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    private static final ImmutableMap<String, ReturnCode> CACHE;

    static {
        final ImmutableMap.Builder<String, ReturnCode> builder = ImmutableMap.builder();
        for (ReturnCode statusCode : values()) {
            builder.put(statusCode.getCode(), statusCode);
        }
        CACHE = builder.build();
    }

    public static ReturnCode valueOfCode(String code) {
        final ReturnCode status = CACHE.get(code);
        if (status == null) {
            // TODO 异常统一
            throw new IllegalArgumentException("No matching constant for [" + code + "]");
        }
        return status;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
