package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 费用台账明细
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="FyStandingBookDetail对象", description="费用台账明细")
public class FyStandingBookDetail implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "台账明细编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "所属台账编号")
    private Integer standingBookId;

    @ApiModelProperty(value = "所属房间编码")
    private Integer cellId;

    @ApiModelProperty(value = "业主姓名")
    private String customerName;

    @ApiModelProperty(value = "表编号")
    private String boxId;

    @ApiModelProperty(value = "计费单位")
    private Double chargeUnit;

    @ApiModelProperty(value = "单位价格")
    private Double priceUnit;

    @ApiModelProperty(value = "上次读数")
    private Double lastReadNumber;

    @ApiModelProperty(value = "本次读数")
    private Double currentReadNumber;

    @ApiModelProperty(value = "本次用量")
    private Double currentUseNumber;

    @ApiModelProperty(value = "应缴费用")
    private Double shouldPay;

    @ApiModelProperty(value = "上次费用止期")
    private LocalDateTime lastPayStopDate;

    @ApiModelProperty(value = "上次费用起期")
    private LocalDateTime lastPayStartDate;

    @ApiModelProperty(value = "本次费用止期")
    private LocalDateTime currentPayStopDate;

    @ApiModelProperty(value = "本次费用限期")
    private LocalDateTime currentPayLimitDate;

    @ApiModelProperty(value = "费用标识")
    private String costIdentify;

    @ApiModelProperty(value = "收费标识")
    private String receiveIdentify;

    @ApiModelProperty(value = "收费单号")
    private String receiveId;

    @ApiModelProperty(value = "退款次数")
    private Integer refundNumber;

    @ApiModelProperty(value = "收费周期")
    private Integer receiveCycle;

    @ApiModelProperty(value = "减免费用")
    private Double derateMoney;

    @ApiModelProperty(value = "应收费用")
    private Double shouldReceive;

    @ApiModelProperty(value = "作废次数")
    private Integer invalidNumber;

    @ApiModelProperty(value = "楼层系数")
    private Double floorFactor;

    @ApiModelProperty(value = "减免滞纳金")
    private Double derateDelayMoney;

    @ApiModelProperty(value = "费用倍数")
    private Integer payMult;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStandingBookId() {
        return standingBookId;
    }

    public void setStandingBookId(Integer standingBookId) {
        this.standingBookId = standingBookId;
    }

    public Integer getCellId() {
        return cellId;
    }

    public void setCellId(Integer cellId) {
        this.cellId = cellId;
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

    public Double getChargeUnit() {
        return chargeUnit;
    }

    public void setChargeUnit(Double chargeUnit) {
        this.chargeUnit = chargeUnit;
    }

    public Double getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(Double priceUnit) {
        this.priceUnit = priceUnit;
    }

    public Double getLastReadNumber() {
        return lastReadNumber;
    }

    public void setLastReadNumber(Double lastReadNumber) {
        this.lastReadNumber = lastReadNumber;
    }

    public Double getCurrentReadNumber() {
        return currentReadNumber;
    }

    public void setCurrentReadNumber(Double currentReadNumber) {
        this.currentReadNumber = currentReadNumber;
    }

    public Double getCurrentUseNumber() {
        return currentUseNumber;
    }

    public void setCurrentUseNumber(Double currentUseNumber) {
        this.currentUseNumber = currentUseNumber;
    }

    public Double getShouldPay() {
        return shouldPay;
    }

    public void setShouldPay(Double shouldPay) {
        this.shouldPay = shouldPay;
    }

    public LocalDateTime getLastPayStopDate() {
        return lastPayStopDate;
    }

    public void setLastPayStopDate(LocalDateTime lastPayStopDate) {
        this.lastPayStopDate = lastPayStopDate;
    }

    public LocalDateTime getLastPayStartDate() {
        return lastPayStartDate;
    }

    public void setLastPayStartDate(LocalDateTime lastPayStartDate) {
        this.lastPayStartDate = lastPayStartDate;
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

    public String getCostIdentify() {
        return costIdentify;
    }

    public void setCostIdentify(String costIdentify) {
        this.costIdentify = costIdentify;
    }

    public String getReceiveIdentify() {
        return receiveIdentify;
    }

    public void setReceiveIdentify(String receiveIdentify) {
        this.receiveIdentify = receiveIdentify;
    }

    public String getReceiveId() {
        return receiveId;
    }

    public void setReceiveId(String receiveId) {
        this.receiveId = receiveId;
    }

    public Integer getRefundNumber() {
        return refundNumber;
    }

    public void setRefundNumber(Integer refundNumber) {
        this.refundNumber = refundNumber;
    }

    public Integer getReceiveCycle() {
        return receiveCycle;
    }

    public void setReceiveCycle(Integer receiveCycle) {
        this.receiveCycle = receiveCycle;
    }

    public Double getDerateMoney() {
        return derateMoney;
    }

    public void setDerateMoney(Double derateMoney) {
        this.derateMoney = derateMoney;
    }

    public Double getShouldReceive() {
        return shouldReceive;
    }

    public void setShouldReceive(Double shouldReceive) {
        this.shouldReceive = shouldReceive;
    }

    public Integer getInvalidNumber() {
        return invalidNumber;
    }

    public void setInvalidNumber(Integer invalidNumber) {
        this.invalidNumber = invalidNumber;
    }

    public Double getFloorFactor() {
        return floorFactor;
    }

    public void setFloorFactor(Double floorFactor) {
        this.floorFactor = floorFactor;
    }

    public Double getDerateDelayMoney() {
        return derateDelayMoney;
    }

    public void setDerateDelayMoney(Double derateDelayMoney) {
        this.derateDelayMoney = derateDelayMoney;
    }

    public Integer getPayMult() {
        return payMult;
    }

    public void setPayMult(Integer payMult) {
        this.payMult = payMult;
    }

    @Override
    public String toString() {
        return "FyStandingBookDetail{" +
        "id=" + id +
        ", standingBookId=" + standingBookId +
        ", cellId=" + cellId +
        ", customerName=" + customerName +
        ", boxId=" + boxId +
        ", chargeUnit=" + chargeUnit +
        ", priceUnit=" + priceUnit +
        ", lastReadNumber=" + lastReadNumber +
        ", currentReadNumber=" + currentReadNumber +
        ", currentUseNumber=" + currentUseNumber +
        ", shouldPay=" + shouldPay +
        ", lastPayStopDate=" + lastPayStopDate +
        ", lastPayStartDate=" + lastPayStartDate +
        ", currentPayStopDate=" + currentPayStopDate +
        ", currentPayLimitDate=" + currentPayLimitDate +
        ", costIdentify=" + costIdentify +
        ", receiveIdentify=" + receiveIdentify +
        ", receiveId=" + receiveId +
        ", refundNumber=" + refundNumber +
        ", receiveCycle=" + receiveCycle +
        ", derateMoney=" + derateMoney +
        ", shouldReceive=" + shouldReceive +
        ", invalidNumber=" + invalidNumber +
        ", floorFactor=" + floorFactor +
        ", derateDelayMoney=" + derateDelayMoney +
        ", payMult=" + payMult +
        "}";
    }
}
