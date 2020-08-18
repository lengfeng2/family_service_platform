package com.szb.service;

import com.szb.entity.TblUserRecord;

public interface ILoginService {

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    public TblUserRecord login(String username,String password);
}
