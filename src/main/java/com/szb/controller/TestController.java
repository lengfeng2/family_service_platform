package com.szb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    /**
     * 登录验证
     * @return
     */
    @RequestMapping("/auth/login")
    public String testController(){
        System.out.println("test");
        return "";
    }


}

