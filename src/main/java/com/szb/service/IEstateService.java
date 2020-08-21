package com.szb.service;

import com.szb.entity.FcEstate;
import com.szb.entity.TblCompany;

import java.util.List;

public interface IEstateService {

    /**
     * 查询公司
     * @return
     */
    public List<TblCompany> selecCompany();


    /**
     * 新增住房信息
     * @param fcEstate
     * @return
     */
    public Integer insertEstate(FcEstate fcEstate);
}
