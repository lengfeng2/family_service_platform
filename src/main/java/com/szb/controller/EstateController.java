package com.szb.controller;

import com.alibaba.fastjson.JSONObject;
import com.szb.entity.TblCompany;
import com.szb.result.ReturnObject;
import com.szb.service.impl.EstateServiceImpl;
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
     * @return
     */
    @RequestMapping("/estate/selectCompany")
    public String selectByCompany(){
        List<TblCompany> tblCompanies = estateService.selecCompany();
        return JSONObject.toJSONString(new ReturnObject(tblCompanies));
    }

//    @RequestMapping("/estate/insertEstate")

}
