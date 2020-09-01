package com.oceanbai.blog.controller.back;


import com.oceanbai.blog.model.response.BlogApiResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 管理员表 前端控制器
 * </p>
 *
 * @author ocean.bai
 * @since 2020-08-31
 */
@Api(tags = "管理员后端接口")
@RestController
@RequestMapping("/blog/admin")
public class AdminController {

    @ApiOperation("管理员登陆")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public BlogApiResponse<Void> validation() {
        return new BlogApiResponse<>();
    }
}
