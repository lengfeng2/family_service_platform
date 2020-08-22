package com.szb.service;

import com.szb.entity.FcBuilding;
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


    /**
     * 先插入数据，再查询数据
     */
    public List<FcBuilding> selectBuiding(Integer buidingNumber,String estateCode);


    /**
     * 更新楼宇信息
     * @param fcBuilding
     * @return
     */
    public Integer updateBuilding(FcBuilding fcBuilding);

}
