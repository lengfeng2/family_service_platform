package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 历史费用临时表
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="FyHistoryMoneyTemp对象", description="历史费用临时表")
public class FyHistoryMoneyTemp implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "房间id")
    private Integer cellId;

    @ApiModelProperty(value = "房产名称")
    private String cellName;

    @ApiModelProperty(value = "建筑面积")
    private Double buildArea;

    @ApiModelProperty(value = "单价")
    private Double priceUnit;

    @ApiModelProperty(value = "金额")
    private Double money;

    @ApiModelProperty(value = "费用起期")
    private LocalDateTime moneyStartDate;

    @ApiModelProperty(value = "费用止期")
    private LocalDateTime moneyStopDate;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "操作人编码")
    private String operatePerson;


    public Integer getCellId() {
        return cellId;
    }

    public void setCellId(Integer cellId) {
        this.cellId = cellId;
    }

    public String getCellName() {
        return cellName;
    }

    public void setCellName(String cellName) {
        this.cellName = cellName;
    }

    public Double getBuildArea() {
        return buildArea;
    }

    public void setBuildArea(Double buildArea) {
        this.buildArea = buildArea;
    }

    public Double getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(Double priceUnit) {
        this.priceUnit = priceUnit;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public LocalDateTime getMoneyStartDate() {
        return moneyStartDate;
    }

    public void setMoneyStartDate(LocalDateTime moneyStartDate) {
        this.moneyStartDate = moneyStartDate;
    }

    public LocalDateTime getMoneyStopDate() {
        return moneyStopDate;
    }

    public void setMoneyStopDate(LocalDateTime moneyStopDate) {
        this.moneyStopDate = moneyStopDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOperatePerson() {
        return operatePerson;
    }

    public void setOperatePerson(String operatePerson) {
        this.operatePerson = operatePerson;
    }

    @Override
    public String toString() {
        return "FyHistoryMoneyTemp{" +
        "cellId=" + cellId +
        ", cellName=" + cellName +
        ", buildArea=" + buildArea +
        ", priceUnit=" + priceUnit +
        ", money=" + money +
        ", moneyStartDate=" + moneyStartDate +
        ", moneyStopDate=" + moneyStopDate +
        ", remark=" + remark +
        ", operatePerson=" + operatePerson +
        "}";
    }
}
