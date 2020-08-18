package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 信件收取
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="WyEmailReceive对象", description="信件收取")
public class WyEmailReceive implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自动编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "收件日期")
    private LocalDateTime receiveDate;

    @ApiModelProperty(value = "领件日期")
    private LocalDateTime getDate;

    @ApiModelProperty(value = "邮件类别")
    private String emailType;

    @ApiModelProperty(value = "收件单位")
    private String receiveUnit;

    @ApiModelProperty(value = "数量")
    private Integer number;

    @ApiModelProperty(value = "领件人")
    private String getPerson;

    @ApiModelProperty(value = "证件类型")
    private String cardType;

    @ApiModelProperty(value = "证件")
    private String card;

    @ApiModelProperty(value = "经手人")
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

    public LocalDateTime getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(LocalDateTime receiveDate) {
        this.receiveDate = receiveDate;
    }

    public LocalDateTime getGetDate() {
        return getDate;
    }

    public void setGetDate(LocalDateTime getDate) {
        this.getDate = getDate;
    }

    public String getEmailType() {
        return emailType;
    }

    public void setEmailType(String emailType) {
        this.emailType = emailType;
    }

    public String getReceiveUnit() {
        return receiveUnit;
    }

    public void setReceiveUnit(String receiveUnit) {
        this.receiveUnit = receiveUnit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getGetPerson() {
        return getPerson;
    }

    public void setGetPerson(String getPerson) {
        this.getPerson = getPerson;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
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
        return "WyEmailReceive{" +
        "id=" + id +
        ", receiveDate=" + receiveDate +
        ", getDate=" + getDate +
        ", emailType=" + emailType +
        ", receiveUnit=" + receiveUnit +
        ", number=" + number +
        ", getPerson=" + getPerson +
        ", cardType=" + cardType +
        ", card=" + card +
        ", agent=" + agent +
        ", remark=" + remark +
        ", company=" + company +
        "}";
    }
}
