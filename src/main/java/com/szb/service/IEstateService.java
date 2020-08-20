package com.szb.service;

import com.szb.entity.TblCompany;

import java.util.List;

public interface IEstateService {

    /**
     * 查询公司
     * @return
     */
    public List<TblCompany> selecCompany();
}
