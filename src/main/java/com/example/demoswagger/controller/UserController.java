package com.example.demoswagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Api(description = "用户操作接口")
@Controller("user")
public class UserController {
    @ApiOperation(value = "回显", notes="通过手机号获取OTP验证码")
    @PostMapping("/user/echo")
    @ResponseBody
    public CommonReturnType<OptResource> echo(@RequestBody OptResource optResource) {
        return CommonReturnType.create(optResource);
    }
}
