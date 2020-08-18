package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 作废单主单
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="FyInvalidMain对象", description="作废单主单")
public class FyInvalidMain implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "作废单号")
    @TableId(value = "invalid_id", type = IdType.AUTO)
    private String invalidId;

    @ApiModelProperty(value = "所属收款单号")
    private String receiveId;

    @ApiModelProperty(value = "房间号")
    private Integer cellId;

    @ApiModelProperty(value = "收费日期")
    private LocalDateTime receiveDate;

    @ApiModelProperty(value = "业主姓名")
    private String customerName;

    @ApiModelProperty(value = "费用金额")
    private Double money;

    @ApiModelProperty(value = "实收金额")
    private Double realReceiveMoney;

    @ApiModelProperty(value = "优惠金额")
    private Double discountMoney;

    @ApiModelProperty(value = "收款方式")
    private String receiveMethod;

    @ApiModelProperty(value = "是否业主")
    private String isCustomer;

    @ApiModelProperty(value = "收费金额")
    private Double receiveMoney;

    @ApiModelProperty(value = "费项id")
    private Long moneyId;

    @ApiModelProperty(value = "所属楼盘id")
    private Integer estateId;

    @ApiModelProperty(value = "本次欠缴")
    private Double currentDelayMoney;

    @ApiModelProperty(value = "上次欠缴")
    private Double lastDelayMoney;

    @ApiModelProperty(value = "作废类型")
    private String invalidType;

    @ApiModelProperty(value = "收据号")
    private String receiptNumber;

    @ApiModelProperty(value = "发票号")
    private String invoiceNumber;

    @ApiModelProperty(value = "收款人")
    private String receivePerson;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "所属公司")
    private String company;

    @ApiModelProperty(value = "作废原因")
    private String invalidReason;

    @ApiModelProperty(value = "作废时间")
    private LocalDateTime invalidDate;

    @ApiModelProperty(value = "作废人")
    private String invalidPerson;


    public String getInvalidId() {
        return invalidId;
    }

    public void setInvalidId(String invalidId) {
        this.invalidId = invalidId;
    }

    public String getReceiveId() {
        return receiveId;
    }

    public void setReceiveId(String receiveId) {
        this.receiveId = receiveId;
    }

    public Integer getCellId() {
        return cellId;
    }

    public void setCellId(Integer cellId) {
        this.cellId = cellId;
    }

    public LocalDateTime getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(LocalDateTime receiveDate) {
        this.receiveDate = receiveDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Double getRealReceiveMoney() {
        return realReceiveMoney;
    }

    public void setRealReceiveMoney(Double realReceiveMoney) {
        this.realReceiveMoney = realReceiveMoney;
    }

    public Double getDiscountMoney() {
        return discountMoney;
    }

    public void setDiscountMoney(Double discountMoney) {
        this.discountMoney = discountMoney;
    }

    public String getReceiveMethod() {
        return receiveMethod;
    }

    public void setReceiveMethod(String receiveMethod) {
        this.receiveMethod = receiveMethod;
    }

    public String getIsCustomer() {
        return isCustomer;
    }

    public void setIsCustomer(String isCustomer) {
        this.isCustomer = isCustomer;
    }

    public Double getReceiveMoney() {
        return receiveMoney;
    }

    public void setReceiveMoney(Double receiveMoney) {
        this.receiveMoney = receiveMoney;
    }

    public Long getMoneyId() {
        return moneyId;
    }

    public void setMoneyId(Long moneyId) {
        this.moneyId = moneyId;
    }

    public Integer getEstateId() {
        return estateId;
    }

    public void setEstateId(Integer estateId) {
        this.estateId = estateId;
    }

    public Double getCurrentDelayMoney() {
        return currentDelayMoney;
    }

    public void setCurrentDelayMoney(Double currentDelayMoney) {
        this.currentDelayMoney = currentDelayMoney;
    }

    public Double getLastDelayMoney() {
        return lastDelayMoney;
    }

    public void setLastDelayMoney(Double lastDelayMoney) {
        this.lastDelayMoney = lastDelayMoney;
    }

    public String getInvalidType() {
        return invalidType;
    }

    public void setInvalidType(String invalidType) {
        this.invalidType = invalidType;
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getReceivePerson() {
        return receivePerson;
    }

    public void setReceivePerson(String receivePerson) {
        this.receivePerson = receivePerson;
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

    public String getInvalidReason() {
        return invalidReason;
    }

    public void setInvalidReason(String invalidReason) {
        this.invalidReason = invalidReason;
    }

    public LocalDateTime getInvalidDate() {
        return invalidDate;
    }

    public void setInvalidDate(LocalDateTime invalidDate) {
        this.invalidDate = invalidDate;
    }

    public String getInvalidPerson() {
        return invalidPerson;
    }

    public void setInvalidPerson(String invalidPerson) {
        this.invalidPerson = invalidPerson;
    }

    @Override
    public String toString() {
        return "FyInvalidMain{" +
        "invalidId=" + invalidId +
        ", receiveId=" + receiveId +
        ", cellId=" + cellId +
        ", receiveDate=" + receiveDate +
        ", customerName=" + customerName +
        ", money=" + money +
        ", realReceiveMoney=" + realReceiveMoney +
        ", discountMoney=" + discountMoney +
        ", receiveMethod=" + receiveMethod +
        ", isCustomer=" + isCustomer +
        ", receiveMoney=" + receiveMoney +
        ", moneyId=" + moneyId +
        ", estateId=" + estateId +
        ", currentDelayMoney=" + currentDelayMoney +
        ", lastDelayMoney=" + lastDelayMoney +
        ", invalidType=" + invalidType +
        ", receiptNumber=" + receiptNumber +
        ", invoiceNumber=" + invoiceNumber +
        ", receivePerson=" + receivePerson +
        ", remark=" + remark +
        ", company=" + company +
        ", invalidReason=" + invalidReason +
        ", invalidDate=" + invalidDate +
        ", invalidPerson=" + invalidPerson +
        "}";
    }
}
