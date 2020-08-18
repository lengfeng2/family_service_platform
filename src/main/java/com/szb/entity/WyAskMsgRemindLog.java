package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 催缴短信提醒日志
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="WyAskMsgRemindLog对象", description="催缴短信提醒日志")
public class WyAskMsgRemindLog implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自动编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "房间id")
    private Integer cellId;

    @ApiModelProperty(value = "费项id")
    private Integer moneyId;

    @ApiModelProperty(value = "接受号码")
    private String receivePhone;

    @ApiModelProperty(value = "缴费限期")
    private LocalDateTime payLimitDay;

    @ApiModelProperty(value = "提醒天数")
    private Integer remindDays;

    @ApiModelProperty(value = "房产名称")
    private String cellName;

    @ApiModelProperty(value = "发送人id")
    private String sendPersonId;

    @ApiModelProperty(value = "发送人名称")
    private String sendPersonName;

    @ApiModelProperty(value = "发送时间")
    private LocalDateTime sendDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCellId() {
        return cellId;
    }

    public void setCellId(Integer cellId) {
        this.cellId = cellId;
    }

    public Integer getMoneyId() {
        return moneyId;
    }

    public void setMoneyId(Integer moneyId) {
        this.moneyId = moneyId;
    }

    public String getReceivePhone() {
        return receivePhone;
    }

    public void setReceivePhone(String receivePhone) {
        this.receivePhone = receivePhone;
    }

    public LocalDateTime getPayLimitDay() {
        return payLimitDay;
    }

    public void setPayLimitDay(LocalDateTime payLimitDay) {
        this.payLimitDay = payLimitDay;
    }

    public Integer getRemindDays() {
        return remindDays;
    }

    public void setRemindDays(Integer remindDays) {
        this.remindDays = remindDays;
    }

    public String getCellName() {
        return cellName;
    }

    public void setCellName(String cellName) {
        this.cellName = cellName;
    }

    public String getSendPersonId() {
        return sendPersonId;
    }

    public void setSendPersonId(String sendPersonId) {
        this.sendPersonId = sendPersonId;
    }

    public String getSendPersonName() {
        return sendPersonName;
    }

    public void setSendPersonName(String sendPersonName) {
        this.sendPersonName = sendPersonName;
    }

    public LocalDateTime getSendDate() {
        return sendDate;
    }

    public void setSendDate(LocalDateTime sendDate) {
        this.sendDate = sendDate;
    }

    @Override
    public String toString() {
        return "WyAskMsgRemindLog{" +
        "id=" + id +
        ", cellId=" + cellId +
        ", moneyId=" + moneyId +
        ", receivePhone=" + receivePhone +
        ", payLimitDay=" + payLimitDay +
        ", remindDays=" + remindDays +
        ", cellName=" + cellName +
        ", sendPersonId=" + sendPersonId +
        ", sendPersonName=" + sendPersonName +
        ", sendDate=" + sendDate +
        "}";
    }
}
