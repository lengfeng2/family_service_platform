package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 费用临时表4
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="FyMoneyTemporary04对象", description="费用临时表4")
public class FyMoneyTemporary04 implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自动编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "费项编码")
    private Integer moneySettingCode;

    @ApiModelProperty(value = "房间编号")
    private Integer cellId;

    @ApiModelProperty(value = "房产名称")
    private String estateName;

    @ApiModelProperty(value = "楼宇名称")
    private String buildingName;

    @ApiModelProperty(value = "单元名称")
    private String unitName;

    @ApiModelProperty(value = "房间名称")
    private String cellName;

    @ApiModelProperty(value = "业主姓名")
    private String customerName;

    @ApiModelProperty(value = "表编号")
    private String boxId;

    @ApiModelProperty(value = "分摊金额")
    private Double shareMoney;

    @ApiModelProperty(value = "本次分摊量")
    private Double currentShareNumber;

    @ApiModelProperty(value = "单位价格")
    private Double priceUnit;

    @ApiModelProperty(value = "本次费用起期")
    private LocalDateTime currentPayStartDate;

    @ApiModelProperty(value = "本次费用止期")
    private LocalDateTime currentPayStopDate;

    @ApiModelProperty(value = "本次缴费限期")
    private LocalDateTime currentPayLimitDate;

    @ApiModelProperty(value = "收费周期")
    private Integer receiveCycle;

    @ApiModelProperty(value = "主键标识")
    private String primaryIdentify;

    @ApiModelProperty(value = "操作人编码")
    private String operatePerson;

    @ApiModelProperty(value = "操作时间")
    private LocalDateTime operateDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMoneySettingCode() {
        return moneySettingCode;
    }

    public void setMoneySettingCode(Integer moneySettingCode) {
        this.moneySettingCode = moneySettingCode;
    }

    public Integer getCellId() {
        return cellId;
    }

    public void setCellId(Integer cellId) {
        this.cellId = cellId;
    }

    public String getEstateName() {
        return estateName;
    }

    public void setEstateName(String estateName) {
        this.estateName = estateName;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getCellName() {
        return cellName;
    }

    public void setCellName(String cellName) {
        this.cellName = cellName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getBoxId() {
        return boxId;
    }

    public void setBoxId(String boxId) {
        this.boxId = boxId;
    }

    public Double getShareMoney() {
        return shareMoney;
    }

    public void setShareMoney(Double shareMoney) {
        this.shareMoney = shareMoney;
    }

    public Double getCurrentShareNumber() {
        return currentShareNumber;
    }

    public void setCurrentShareNumber(Double currentShareNumber) {
        this.currentShareNumber = currentShareNumber;
    }

    public Double getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(Double priceUnit) {
        this.priceUnit = priceUnit;
    }

    public LocalDateTime getCurrentPayStartDate() {
        return currentPayStartDate;
    }

    public void setCurrentPayStartDate(LocalDateTime currentPayStartDate) {
        this.currentPayStartDate = currentPayStartDate;
    }

    public LocalDateTime getCurrentPayStopDate() {
        return currentPayStopDate;
    }

    public void setCurrentPayStopDate(LocalDateTime currentPayStopDate) {
        this.currentPayStopDate = currentPayStopDate;
    }

    public LocalDateTime getCurrentPayLimitDate() {
        return currentPayLimitDate;
    }

    public void setCurrentPayLimitDate(LocalDateTime currentPayLimitDate) {
        this.currentPayLimitDate = currentPayLimitDate;
    }

    public Integer getReceiveCycle() {
        return receiveCycle;
    }

    public void setReceiveCycle(Integer receiveCycle) {
        this.receiveCycle = receiveCycle;
    }

    public String getPrimaryIdentify() {
        return primaryIdentify;
    }

    public void setPrimaryIdentify(String primaryIdentify) {
        this.primaryIdentify = primaryIdentify;
    }

    public String getOperatePerson() {
        return operatePerson;
    }

    public void setOperatePerson(String operatePerson) {
        this.operatePerson = operatePerson;
    }

    public LocalDateTime getOperateDate() {
        return operateDate;
    }

    public void setOperateDate(LocalDateTime operateDate) {
        this.operateDate = operateDate;
    }

    @Override
    public String toString() {
        return "FyMoneyTemporary04{" +
        "id=" + id +
        ", moneySettingCode=" + moneySettingCode +
        ", cellId=" + cellId +
        ", estateName=" + estateName +
        ", buildingName=" + buildingName +
        ", unitName=" + unitName +
        ", cellName=" + cellName +
        ", customerName=" + customerName +
        ", boxId=" + boxId +
        ", shareMoney=" + shareMoney +
        ", currentShareNumber=" + currentShareNumber +
        ", priceUnit=" + priceUnit +
        ", currentPayStartDate=" + currentPayStartDate +
        ", currentPayStopDate=" + currentPayStopDate +
        ", currentPayLimitDate=" + currentPayLimitDate +
        ", receiveCycle=" + receiveCycle +
        ", primaryIdentify=" + primaryIdentify +
        ", operatePerson=" + operatePerson +
        ", operateDate=" + operateDate +
        "}";
    }
}
