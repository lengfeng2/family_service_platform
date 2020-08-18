package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 车位租赁缴费明细
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="WyCarSpaceRentDetail对象", description="车位租赁缴费明细")
public class WyCarSpaceRentDetail implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自动编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "所属租赁id")
    private Long rentId;

    @ApiModelProperty(value = "缴费类型")
    private String payType;

    @ApiModelProperty(value = "缴费开始日")
    private LocalDateTime payStartDate;

    @ApiModelProperty(value = "缴费结束日")
    private LocalDateTime payStopDate;

    @ApiModelProperty(value = "应收金额")
    private Double shouldReceive;

    @ApiModelProperty(value = "优惠金额")
    private Double discountMoney;

    @ApiModelProperty(value = "滞纳金")
    private Double delayMoney;

    @ApiModelProperty(value = "实收金额")
    private Double realReceiveMoney;

    @ApiModelProperty(value = "说明")
    private String desc;

    @ApiModelProperty(value = "收款人id")
    private String receiveId;

    @ApiModelProperty(value = "收款人名称")
    private String receivePersonName;

    @ApiModelProperty(value = "收款时间")
    private LocalDateTime receiveDate;

    @ApiModelProperty(value = "发票号码")
    private String invoiceNumber;

    @ApiModelProperty(value = "收款状态")
    private String receiveStatus;

    @ApiModelProperty(value = "作废人id")
    private String invalidPersonId;

    @ApiModelProperty(value = "作废人名称")
    private String invalidPersonName;

    @ApiModelProperty(value = "作废原因")
    private String invalidReason;

    @ApiModelProperty(value = "作废时间")
    private LocalDateTime invalidDate;

    @ApiModelProperty(value = "单据审核状态")
    private String receiptCheckStatus;

    @ApiModelProperty(value = "单据审核人")
    private String receiptCheckPerson;

    @ApiModelProperty(value = "单据审核时间")
    private LocalDateTime receiptCheckTime;

    @ApiModelProperty(value = "单据审核意见")
    private String receiptCheckAdvice;

    @ApiModelProperty(value = "现金审核状态")
    private String moneyCheckStatus;

    @ApiModelProperty(value = "现金审核人")
    private String moneyCheckPerson;

    @ApiModelProperty(value = "现金审核时间")
    private LocalDateTime moneyCheckTime;

    @ApiModelProperty(value = "现金审核意见")
    private String moneyCheckAdvice;

    @ApiModelProperty(value = "作废审核状态")
    private String invalidCheckStatus;

    @ApiModelProperty(value = "作废审核人")
    private String invalidCheckPerson;

    @ApiModelProperty(value = "作废审核时间")
    private LocalDateTime invalidCheckTime;

    @ApiModelProperty(value = "作废审核意见")
    private String invalidCheckAdvice;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getRentId() {
        return rentId;
    }

    public void setRentId(Long rentId) {
        this.rentId = rentId;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public LocalDateTime getPayStartDate() {
        return payStartDate;
    }

    public void setPayStartDate(LocalDateTime payStartDate) {
        this.payStartDate = payStartDate;
    }

    public LocalDateTime getPayStopDate() {
        return payStopDate;
    }

    public void setPayStopDate(LocalDateTime payStopDate) {
        this.payStopDate = payStopDate;
    }

    public Double getShouldReceive() {
        return shouldReceive;
    }

    public void setShouldReceive(Double shouldReceive) {
        this.shouldReceive = shouldReceive;
    }

    public Double getDiscountMoney() {
        return discountMoney;
    }

    public void setDiscountMoney(Double discountMoney) {
        this.discountMoney = discountMoney;
    }

    public Double getDelayMoney() {
        return delayMoney;
    }

    public void setDelayMoney(Double delayMoney) {
        this.delayMoney = delayMoney;
    }

    public Double getRealReceiveMoney() {
        return realReceiveMoney;
    }

    public void setRealReceiveMoney(Double realReceiveMoney) {
        this.realReceiveMoney = realReceiveMoney;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getReceiveId() {
        return receiveId;
    }

    public void setReceiveId(String receiveId) {
        this.receiveId = receiveId;
    }

    public String getReceivePersonName() {
        return receivePersonName;
    }

    public void setReceivePersonName(String receivePersonName) {
        this.receivePersonName = receivePersonName;
    }

    public LocalDateTime getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(LocalDateTime receiveDate) {
        this.receiveDate = receiveDate;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getReceiveStatus() {
        return receiveStatus;
    }

    public void setReceiveStatus(String receiveStatus) {
        this.receiveStatus = receiveStatus;
    }

    public String getInvalidPersonId() {
        return invalidPersonId;
    }

    public void setInvalidPersonId(String invalidPersonId) {
        this.invalidPersonId = invalidPersonId;
    }

    public String getInvalidPersonName() {
        return invalidPersonName;
    }

    public void setInvalidPersonName(String invalidPersonName) {
        this.invalidPersonName = invalidPersonName;
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

    public String getReceiptCheckStatus() {
        return receiptCheckStatus;
    }

    public void setReceiptCheckStatus(String receiptCheckStatus) {
        this.receiptCheckStatus = receiptCheckStatus;
    }

    public String getReceiptCheckPerson() {
        return receiptCheckPerson;
    }

    public void setReceiptCheckPerson(String receiptCheckPerson) {
        this.receiptCheckPerson = receiptCheckPerson;
    }

    public LocalDateTime getReceiptCheckTime() {
        return receiptCheckTime;
    }

    public void setReceiptCheckTime(LocalDateTime receiptCheckTime) {
        this.receiptCheckTime = receiptCheckTime;
    }

    public String getReceiptCheckAdvice() {
        return receiptCheckAdvice;
    }

    public void setReceiptCheckAdvice(String receiptCheckAdvice) {
        this.receiptCheckAdvice = receiptCheckAdvice;
    }

    public String getMoneyCheckStatus() {
        return moneyCheckStatus;
    }

    public void setMoneyCheckStatus(String moneyCheckStatus) {
        this.moneyCheckStatus = moneyCheckStatus;
    }

    public String getMoneyCheckPerson() {
        return moneyCheckPerson;
    }

    public void setMoneyCheckPerson(String moneyCheckPerson) {
        this.moneyCheckPerson = moneyCheckPerson;
    }

    public LocalDateTime getMoneyCheckTime() {
        return moneyCheckTime;
    }

    public void setMoneyCheckTime(LocalDateTime moneyCheckTime) {
        this.moneyCheckTime = moneyCheckTime;
    }

    public String getMoneyCheckAdvice() {
        return moneyCheckAdvice;
    }

    public void setMoneyCheckAdvice(String moneyCheckAdvice) {
        this.moneyCheckAdvice = moneyCheckAdvice;
    }

    public String getInvalidCheckStatus() {
        return invalidCheckStatus;
    }

    public void setInvalidCheckStatus(String invalidCheckStatus) {
        this.invalidCheckStatus = invalidCheckStatus;
    }

    public String getInvalidCheckPerson() {
        return invalidCheckPerson;
    }

    public void setInvalidCheckPerson(String invalidCheckPerson) {
        this.invalidCheckPerson = invalidCheckPerson;
    }

    public LocalDateTime getInvalidCheckTime() {
        return invalidCheckTime;
    }

    public void setInvalidCheckTime(LocalDateTime invalidCheckTime) {
        this.invalidCheckTime = invalidCheckTime;
    }

    public String getInvalidCheckAdvice() {
        return invalidCheckAdvice;
    }

    public void setInvalidCheckAdvice(String invalidCheckAdvice) {
        this.invalidCheckAdvice = invalidCheckAdvice;
    }

    @Override
    public String toString() {
        return "WyCarSpaceRentDetail{" +
        "id=" + id +
        ", rentId=" + rentId +
        ", payType=" + payType +
        ", payStartDate=" + payStartDate +
        ", payStopDate=" + payStopDate +
        ", shouldReceive=" + shouldReceive +
        ", discountMoney=" + discountMoney +
        ", delayMoney=" + delayMoney +
        ", realReceiveMoney=" + realReceiveMoney +
        ", desc=" + desc +
        ", receiveId=" + receiveId +
        ", receivePersonName=" + receivePersonName +
        ", receiveDate=" + receiveDate +
        ", invoiceNumber=" + invoiceNumber +
        ", receiveStatus=" + receiveStatus +
        ", invalidPersonId=" + invalidPersonId +
        ", invalidPersonName=" + invalidPersonName +
        ", invalidReason=" + invalidReason +
        ", invalidDate=" + invalidDate +
        ", receiptCheckStatus=" + receiptCheckStatus +
        ", receiptCheckPerson=" + receiptCheckPerson +
        ", receiptCheckTime=" + receiptCheckTime +
        ", receiptCheckAdvice=" + receiptCheckAdvice +
        ", moneyCheckStatus=" + moneyCheckStatus +
        ", moneyCheckPerson=" + moneyCheckPerson +
        ", moneyCheckTime=" + moneyCheckTime +
        ", moneyCheckAdvice=" + moneyCheckAdvice +
        ", invalidCheckStatus=" + invalidCheckStatus +
        ", invalidCheckPerson=" + invalidCheckPerson +
        ", invalidCheckTime=" + invalidCheckTime +
        ", invalidCheckAdvice=" + invalidCheckAdvice +
        "}";
    }
}
