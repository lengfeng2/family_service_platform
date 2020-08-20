package com.szb.service.impl;

import com.szb.entity.TblCompany;
import com.szb.mapper.TblCompanyMapper;
import com.szb.service.IEstateService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EstateServiceImpl implements IEstateService {

    @Resource
    private TblCompanyMapper tblCompanyMapper;


    @Override
    public List<TblCompany> selecCompany() {
        List<TblCompany> tblCompanies = tblCompanyMapper.selectByCompany();
        return tblCompanies;
    }
}
