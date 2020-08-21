package com.szb.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.szb.entity.FcEstate;
import com.szb.entity.TblCompany;
import com.szb.mapper.FcEstateMapper;
import com.szb.mapper.TblCompanyMapper;
import com.szb.service.IEstateService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Wrapper;
import java.util.List;

@Service
public class EstateServiceImpl implements IEstateService {

    @Resource
    private TblCompanyMapper tblCompanyMapper;
    @Resource
    private FcEstateMapper fcEstateMapper;


    @Override
    public List<TblCompany> selecCompany() {
        List<TblCompany> tblCompanies = tblCompanyMapper.selectByCompany();
        return tblCompanies;
    }

    @Override
    public Integer insertEstate(FcEstate fcEstate) {
        QueryWrapper<FcEstate> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("estate_code", fcEstate.getEstateCode());
        FcEstate fcResult = fcEstateMapper.selectOne(queryWrapper);
        int result = 0;
        if (fcResult != null) {
            return result;
        } else {
            result = fcEstateMapper.insert(fcEstate);
            return result;
        }
    }
}
