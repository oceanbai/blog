package com.blog.oceanbai.common.model.response;

/**
 * @author bby15929
 * @date 2020年09月01日16:12:44
 */
public enum GlobalResponseEnum implements Response{
    /**
     * 成功
     */
    SUCCESS("666666","success"),
    /**
     * 失败
     */
    FAIL("888888","fail");

    private String code;

    private String message;

    GlobalResponseEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
