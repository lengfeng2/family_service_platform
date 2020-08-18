package com.szb.service.impl;

import com.szb.entity.TblUserRecord;
import com.szb.mapper.TblUserRecordMapper;
import com.szb.service.ILoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginServiceImpl implements ILoginService {

    @Resource
    private TblUserRecordMapper tblUserRecordMapper;

    @Override
    public TblUserRecord login(String username, String password) {
        TblUserRecord tblUserRecord = tblUserRecordMapper.login(username, password);
        return tblUserRecord;
    }
}
