package com.szb.controller;

import com.szb.entity.TblUserRecord;
import com.szb.service.ILoginService;
import com.szb.service.impl.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class LoginController {

    @Resource
    private LoginServiceImpl loginService;


    /**
     * 登录验证
     *
     * @return
     */
    @RequestMapping("/auth/login")
    public TblUserRecord login(@RequestParam("username") String username, @RequestParam("password") String password) {
        System.out.println(username + "---" + password);
        TblUserRecord tblUserRecord = loginService.login(username, password);
        System.out.println(tblUserRecord);
        return tblUserRecord;
    }

    @RequestMapping("/auth/2step-code")
    public boolean defaultValidate() {
        System.out.println("ant-design自带的前端验证，写不写无所谓");
        return true;
    }


}

