package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 短信充值单
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="TblMessageCharge对象", description="短信充值单")
public class TblMessageCharge implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "充值单号")
    private String chargeNumber;

    @ApiModelProperty(value = "充值账户")
    private String chargeAccount;

    @ApiModelProperty(value = "充值金额")
    private Double chargeMoney;

    @ApiModelProperty(value = "充值说明")
    private String chargeDesc;

    @ApiModelProperty(value = "充值人")
    private String chargePerson;

    @ApiModelProperty(value = "充值日期")
    private LocalDateTime chargeDate;


    public String getChargeNumber() {
        return chargeNumber;
    }

    public void setChargeNumber(String chargeNumber) {
        this.chargeNumber = chargeNumber;
    }

    public String getChargeAccount() {
        return chargeAccount;
    }

    public void setChargeAccount(String chargeAccount) {
        this.chargeAccount = chargeAccount;
    }

    public Double getChargeMoney() {
        return chargeMoney;
    }

    public void setChargeMoney(Double chargeMoney) {
        this.chargeMoney = chargeMoney;
    }

    public String getChargeDesc() {
        return chargeDesc;
    }

    public void setChargeDesc(String chargeDesc) {
        this.chargeDesc = chargeDesc;
    }

    public String getChargePerson() {
        return chargePerson;
    }

    public void setChargePerson(String chargePerson) {
        this.chargePerson = chargePerson;
    }

    public LocalDateTime getChargeDate() {
        return chargeDate;
    }

    public void setChargeDate(LocalDateTime chargeDate) {
        this.chargeDate = chargeDate;
    }

    @Override
    public String toString() {
        return "TblMessageCharge{" +
        "chargeNumber=" + chargeNumber +
        ", chargeAccount=" + chargeAccount +
        ", chargeMoney=" + chargeMoney +
        ", chargeDesc=" + chargeDesc +
        ", chargePerson=" + chargePerson +
        ", chargeDate=" + chargeDate +
        "}";
    }
}
