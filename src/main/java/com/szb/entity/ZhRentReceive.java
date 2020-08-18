package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 租金收取
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="ZhRentReceive对象", description="租金收取")
public class ZhRentReceive implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自动编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "所属合同编号")
    private Integer contractId;

    @ApiModelProperty(value = "所属租户id")
    private Integer rentId;

    @ApiModelProperty(value = "租户名称")
    private String rentName;

    @ApiModelProperty(value = "租金开始日期")
    private LocalDateTime rentStartDate;

    @ApiModelProperty(value = "租金截止日期")
    private LocalDateTime rentStopDate;

    @ApiModelProperty(value = "租金金额")
    private Double rentMoney;

    @ApiModelProperty(value = "说明")
    private String desc;

    @ApiModelProperty(value = "收款人id")
    private String receiveId;

    @ApiModelProperty(value = "收款人名称")
    private String receivePerson;

    @ApiModelProperty(value = "收款时间")
    private LocalDateTime receiveDate;

    @ApiModelProperty(value = "收取状态")
    private String receiveStatus;

    @ApiModelProperty(value = "作废人id")
    private String invalidId;

    @ApiModelProperty(value = "作废人名称")
    private String invalidPersonName;

    @ApiModelProperty(value = "作废原因")
    private String invalidReason;

    @ApiModelProperty(value = "作废时间")
    private LocalDateTime invalidDate;

    @ApiModelProperty(value = "原收款方式")
    private String pastReceiveMethod;

    @ApiModelProperty(value = "单据审核状态")
    private String receiptCheckStatus;

    @ApiModelProperty(value = "单据审核人")
    private String receiptCheckPerson;

    @ApiModelProperty(value = "单据审核时间")
    private LocalDateTime receiptCheckTime;

    @ApiModelProperty(value = "单据审核意见")
    private String receiptCheckAdvice;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public Integer getRentId() {
        return rentId;
    }

    public void setRentId(Integer rentId) {
        this.rentId = rentId;
    }

    public String getRentName() {
        return rentName;
    }

    public void setRentName(String rentName) {
        this.rentName = rentName;
    }

    public LocalDateTime getRentStartDate() {
        return rentStartDate;
    }

    public void setRentStartDate(LocalDateTime rentStartDate) {
        this.rentStartDate = rentStartDate;
    }

    public LocalDateTime getRentStopDate() {
        return rentStopDate;
    }

    public void setRentStopDate(LocalDateTime rentStopDate) {
        this.rentStopDate = rentStopDate;
    }

    public Double getRentMoney() {
        return rentMoney;
    }

    public void setRentMoney(Double rentMoney) {
        this.rentMoney = rentMoney;
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

    public String getReceivePerson() {
        return receivePerson;
    }

    public void setReceivePerson(String receivePerson) {
        this.receivePerson = receivePerson;
    }

    public LocalDateTime getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(LocalDateTime receiveDate) {
        this.receiveDate = receiveDate;
    }

    public String getReceiveStatus() {
        return receiveStatus;
    }

    public void setReceiveStatus(String receiveStatus) {
        this.receiveStatus = receiveStatus;
    }

    public String getInvalidId() {
        return invalidId;
    }

    public void setInvalidId(String invalidId) {
        this.invalidId = invalidId;
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

    public String getPastReceiveMethod() {
        return pastReceiveMethod;
    }

    public void setPastReceiveMethod(String pastReceiveMethod) {
        this.pastReceiveMethod = pastReceiveMethod;
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

    @Override
    public String toString() {
        return "ZhRentReceive{" +
        "id=" + id +
        ", contractId=" + contractId +
        ", rentId=" + rentId +
        ", rentName=" + rentName +
        ", rentStartDate=" + rentStartDate +
        ", rentStopDate=" + rentStopDate +
        ", rentMoney=" + rentMoney +
        ", desc=" + desc +
        ", receiveId=" + receiveId +
        ", receivePerson=" + receivePerson +
        ", receiveDate=" + receiveDate +
        ", receiveStatus=" + receiveStatus +
        ", invalidId=" + invalidId +
        ", invalidPersonName=" + invalidPersonName +
        ", invalidReason=" + invalidReason +
        ", invalidDate=" + invalidDate +
        ", pastReceiveMethod=" + pastReceiveMethod +
        ", receiptCheckStatus=" + receiptCheckStatus +
        ", receiptCheckPerson=" + receiptCheckPerson +
        ", receiptCheckTime=" + receiptCheckTime +
        ", receiptCheckAdvice=" + receiptCheckAdvice +
        "}";
    }
}
