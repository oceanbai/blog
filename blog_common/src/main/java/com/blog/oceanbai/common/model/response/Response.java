package com.blog.oceanbai.common.model.response;

import java.io.Serializable;

/**
 * @author bby15929
 * @date 2020年09月01日16:10:09
 */
public interface Response extends Serializable {
    String getCode();

    String getMessage();
}
