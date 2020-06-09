package com.example.demoswagger.controller;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(description = "用户信息")
public class OptResource implements Serializable {
    @ApiModelProperty(notes = "名字", name = "name")
    private String name;
    @ApiModelProperty(notes = "年龄", name = "age")
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
