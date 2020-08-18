package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 物品出入
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="WyGoodsInout对象", description="物品出入")
public class WyGoodsInout implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自动编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "出入时间")
    private LocalDateTime inoutDate;

    @ApiModelProperty(value = "携带人")
    private String carryPerson;

    @ApiModelProperty(value = "身份证号")
    private String idCard;

    @ApiModelProperty(value = "出入类型")
    private String inputType;

    @ApiModelProperty(value = "居住地址")
    private String liveAddr;

    @ApiModelProperty(value = "出入单元")
    private String inoutUnit;

    @ApiModelProperty(value = "户主姓名")
    private String customerName;

    @ApiModelProperty(value = "出入物品")
    private String inoutGoods;

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

    public LocalDateTime getInoutDate() {
        return inoutDate;
    }

    public void setInoutDate(LocalDateTime inoutDate) {
        this.inoutDate = inoutDate;
    }

    public String getCarryPerson() {
        return carryPerson;
    }

    public void setCarryPerson(String carryPerson) {
        this.carryPerson = carryPerson;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getInputType() {
        return inputType;
    }

    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    public String getLiveAddr() {
        return liveAddr;
    }

    public void setLiveAddr(String liveAddr) {
        this.liveAddr = liveAddr;
    }

    public String getInoutUnit() {
        return inoutUnit;
    }

    public void setInoutUnit(String inoutUnit) {
        this.inoutUnit = inoutUnit;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getInoutGoods() {
        return inoutGoods;
    }

    public void setInoutGoods(String inoutGoods) {
        this.inoutGoods = inoutGoods;
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
        return "WyGoodsInout{" +
        "id=" + id +
        ", inoutDate=" + inoutDate +
        ", carryPerson=" + carryPerson +
        ", idCard=" + idCard +
        ", inputType=" + inputType +
        ", liveAddr=" + liveAddr +
        ", inoutUnit=" + inoutUnit +
        ", customerName=" + customerName +
        ", inoutGoods=" + inoutGoods +
        ", agent=" + agent +
        ", remark=" + remark +
        ", company=" + company +
        "}";
    }
}
