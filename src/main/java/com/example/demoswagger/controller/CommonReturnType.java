package com.example.demoswagger.controller;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "标准返回")
public class CommonReturnType<T> {
    @ApiModelProperty("返回码")
    private String code;
    @ApiModelProperty("返回消息")
    private String msg;
    @ApiModelProperty("返回对象")
    private T obj;
    public static <T> CommonReturnType<T> create(T otpCode) {
        CommonReturnType<T> commonReturnType = new CommonReturnType<>();
        commonReturnType.setCode("200");
        commonReturnType.setMsg("SUCCESS");
        commonReturnType.setObj(otpCode);
        return commonReturnType;
    }
}
