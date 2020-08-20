package com.szb.controller;

import com.alibaba.fastjson.JSONObject;
import com.szb.entity.TblUserRecord;
import com.szb.result.Permission;
import com.szb.result.Permissions;
import com.szb.result.ReturnObject;
import com.szb.result.UserInfo;
import com.szb.service.impl.LoginServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@RestController
public class LoginController {

    @Resource
    private LoginServiceImpl loginService ;

    /**
     * 登录验证
     *
     * @return
     */
    @RequestMapping("/auth/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, HttpSession session) {
        System.out.println(username + "---" + password);
        TblUserRecord tblUserRecord = loginService.login(username, password);
        tblUserRecord.setToken(tblUserRecord.getUserName());
        session.setAttribute("userRecord",tblUserRecord);
        //设置前端返回对象
        ReturnObject returnObject = new ReturnObject(tblUserRecord);
        //从下面sessionID看见session不是同一个，后端跨域设置了同一session,现在需要前端设置同一session
        System.out.println(session.getId());
        //设置返回格式JSON
        return JSONObject.toJSONString(returnObject);
    }

    @RequestMapping("/auth/2step-code")
    public boolean defaultValidate() {
        System.out.println("ant-design自带的前端验证，写不写无所谓");
        return true;
    }

    /**
     * 登录后会发送user/info请求，跳转页面
     * @param session
     * @return
     */
    @RequestMapping("/user/info")
    public String getInfo(HttpSession session){
        //获取sessiond对象
        TblUserRecord tblUserRecord = (TblUserRecord) session.getAttribute("userRecord");
        String[] split = tblUserRecord.getTblRole().getRolePrivileges().split("-");
        //拼接返回前台对象
        List<Permission> permissionList = new ArrayList<>();
        Permissions permissions = new Permissions();
        //设置权限对象
        for (String s : split) {
            permissionList.add(new Permission(s));
        }
        permissions.setPermissions(permissionList);
        //设置返回UserInfo对象
        UserInfo userInfo = new UserInfo(tblUserRecord.getUserName(), permissions);
        return JSONObject.toJSONString(new ReturnObject(userInfo));
    }

    @RequestMapping("/auth/logout")
    public String logOut(HttpSession session){
        System.out.println("logOut");
        session.invalidate();
        return "";
    }

}

