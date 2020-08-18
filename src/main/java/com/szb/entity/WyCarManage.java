package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 车辆管理
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="WyCarManage对象", description="车辆管理")
public class WyCarManage implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自动编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "车牌号")
    private String carLicnece;

    @ApiModelProperty(value = "停车牌号")
    private String stopCarLicence;

    @ApiModelProperty(value = "车主姓名")
    private String carOwnerName;

    @ApiModelProperty(value = "车位")
    private String carport;

    @ApiModelProperty(value = "入场时间")
    private LocalDateTime inDate;

    @ApiModelProperty(value = "出场时间")
    private LocalDateTime outDate;

    @ApiModelProperty(value = "值班人")
    private String agent;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "所属公司")
    private String company;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCarLicnece() {
        return carLicnece;
    }

    public void setCarLicnece(String carLicnece) {
        this.carLicnece = carLicnece;
    }

    public String getStopCarLicence() {
        return stopCarLicence;
    }

    public void setStopCarLicence(String stopCarLicence) {
        this.stopCarLicence = stopCarLicence;
    }

    public String getCarOwnerName() {
        return carOwnerName;
    }

    public void setCarOwnerName(String carOwnerName) {
        this.carOwnerName = carOwnerName;
    }

    public String getCarport() {
        return carport;
    }

    public void setCarport(String carport) {
        this.carport = carport;
    }

    public LocalDateTime getInDate() {
        return inDate;
    }

    public void setInDate(LocalDateTime inDate) {
        this.inDate = inDate;
    }

    public LocalDateTime getOutDate() {
        return outDate;
    }

    public void setOutDate(LocalDateTime outDate) {
        this.outDate = outDate;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "WyCarManage{" +
        "id=" + id +
        ", carLicnece=" + carLicnece +
        ", stopCarLicence=" + stopCarLicence +
        ", carOwnerName=" + carOwnerName +
        ", carport=" + carport +
        ", inDate=" + inDate +
        ", outDate=" + outDate +
        ", agent=" + agent +
        ", remark=" + remark +
        ", company=" + company +
        "}";
    }
}
