package com.szb.controller;

import com.alibaba.fastjson.JSONObject;
import com.szb.entity.FcBuilding;
import com.szb.entity.FcEstate;
import com.szb.entity.TblCompany;
import com.szb.result.ReturnObject;
import com.szb.service.impl.EstateServiceImpl;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class EstateController {

    @Resource
    private EstateServiceImpl estateService;

    /**
     * 查询公司
     *
     * @return
     */
    @RequestMapping("/estate/selectCompany")
    public String selectByCompany() {
        List<TblCompany> tblCompanies = estateService.selecCompany();
        return JSONObject.toJSONString(new ReturnObject(tblCompanies));
    }

    /**
     * 新增楼房信息
     *
     * @param fcEstate
     * @return
     */
    @RequestMapping("/estate/insertEstate")
    public String insertEstate(FcEstate fcEstate) {
        Integer result = estateService.insertEstate(fcEstate);
        System.out.println("result = " + result);
        if (result == 0) {
            return JSONObject.toJSONString(new ReturnObject("0", "房产编码已经存在"));
        } else {
            return JSONObject.toJSONString(new ReturnObject("1","新增房产信息成功"));
        }
    }

    @RequestMapping("/estate/selectBuilding")
    public String selectBuiding(@Validated Integer buildingNumber, String estateCode){
        List<FcBuilding> fcBuildings = estateService.selectBuiding(buildingNumber, estateCode);
        return JSONObject.toJSONString(new ReturnObject(fcBuildings));
    }

    @RequestMapping("estate/updateBuilding")
    public String updateBuilding(FcBuilding fcBuilding){
        Integer result = estateService.updateBuilding(fcBuilding);
        if (result == 0){
            return JSONObject.toJSONString(new ReturnObject("更新失败"));
        }else {
            return JSONObject.toJSONString(new ReturnObject("更新成功"));
        }
    }
}
