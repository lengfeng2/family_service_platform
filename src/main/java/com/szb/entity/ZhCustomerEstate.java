package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 业主房产对照表
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="ZhCustomerEstate对象", description="业主房产对照表")
public class ZhCustomerEstate implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自动编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "业主id")
    private Integer customerId;

    @ApiModelProperty(value = "业主姓名")
    private String customerName;

    @ApiModelProperty(value = "房间id")
    private Integer cellId;

    @ApiModelProperty(value = "使用状态")
    private String useStatus;

    @ApiModelProperty(value = "入住日期")
    private LocalDateTime liveDate;

    @ApiModelProperty(value = "装修时间")
    private LocalDateTime decorateDate;

    @ApiModelProperty(value = "认购证号")
    private String subscriptionCardNumber;

    @ApiModelProperty(value = "房产证号")
    private String houseCode;

    @ApiModelProperty(value = "是否缴纳维修金")
    private String isPayDecorateMoney;

    @ApiModelProperty(value = "预缴维修金")
    private Double prePayDecorateMoney;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "排序号")
    private Integer orderid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getCellId() {
        return cellId;
    }

    public void setCellId(Integer cellId) {
        this.cellId = cellId;
    }

    public String getUseStatus() {
        return useStatus;
    }

    public void setUseStatus(String useStatus) {
        this.useStatus = useStatus;
    }

    public LocalDateTime getLiveDate() {
        return liveDate;
    }

    public void setLiveDate(LocalDateTime liveDate) {
        this.liveDate = liveDate;
    }

    public LocalDateTime getDecorateDate() {
        return decorateDate;
    }

    public void setDecorateDate(LocalDateTime decorateDate) {
        this.decorateDate = decorateDate;
    }

    public String getSubscriptionCardNumber() {
        return subscriptionCardNumber;
    }

    public void setSubscriptionCardNumber(String subscriptionCardNumber) {
        this.subscriptionCardNumber = subscriptionCardNumber;
    }

    public String getHouseCode() {
        return houseCode;
    }

    public void setHouseCode(String houseCode) {
        this.houseCode = houseCode;
    }

    public String getIsPayDecorateMoney() {
        return isPayDecorateMoney;
    }

    public void setIsPayDecorateMoney(String isPayDecorateMoney) {
        this.isPayDecorateMoney = isPayDecorateMoney;
    }

    public Double getPrePayDecorateMoney() {
        return prePayDecorateMoney;
    }

    public void setPrePayDecorateMoney(Double prePayDecorateMoney) {
        this.prePayDecorateMoney = prePayDecorateMoney;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    @Override
    public String toString() {
        return "ZhCustomerEstate{" +
        "id=" + id +
        ", customerId=" + customerId +
        ", customerName=" + customerName +
        ", cellId=" + cellId +
        ", useStatus=" + useStatus +
        ", liveDate=" + liveDate +
        ", decorateDate=" + decorateDate +
        ", subscriptionCardNumber=" + subscriptionCardNumber +
        ", houseCode=" + houseCode +
        ", isPayDecorateMoney=" + isPayDecorateMoney +
        ", prePayDecorateMoney=" + prePayDecorateMoney +
        ", remark=" + remark +
        ", orderid=" + orderid +
        "}";
    }
}
