package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 发送日志表
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="TblSendLog对象", description="发送日志表")
public class TblSendLog implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "记录编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "发送者名称")
    private String sendName;

    @ApiModelProperty(value = "请求时间")
    private LocalDateTime requestDate;

    @ApiModelProperty(value = "定时标志")
    private Integer sendTag;

    @ApiModelProperty(value = "定时时间")
    private LocalDateTime timingDate;

    @ApiModelProperty(value = "短信类型")
    private Integer messageType;

    @ApiModelProperty(value = "拓展号码")
    private String extendPhone;

    @ApiModelProperty(value = "接受手机号码")
    private String receivePhone;

    @ApiModelProperty(value = "短信内容")
    private String messageContent;

    @ApiModelProperty(value = "是否发送")
    private Integer isSend;

    @ApiModelProperty(value = "接收人标识")
    private String receiveIdentify;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSendName() {
        return sendName;
    }

    public void setSendName(String sendName) {
        this.sendName = sendName;
    }

    public LocalDateTime getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(LocalDateTime requestDate) {
        this.requestDate = requestDate;
    }

    public Integer getSendTag() {
        return sendTag;
    }

    public void setSendTag(Integer sendTag) {
        this.sendTag = sendTag;
    }

    public LocalDateTime getTimingDate() {
        return timingDate;
    }

    public void setTimingDate(LocalDateTime timingDate) {
        this.timingDate = timingDate;
    }

    public Integer getMessageType() {
        return messageType;
    }

    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }

    public String getExtendPhone() {
        return extendPhone;
    }

    public void setExtendPhone(String extendPhone) {
        this.extendPhone = extendPhone;
    }

    public String getReceivePhone() {
        return receivePhone;
    }

    public void setReceivePhone(String receivePhone) {
        this.receivePhone = receivePhone;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public Integer getIsSend() {
        return isSend;
    }

    public void setIsSend(Integer isSend) {
        this.isSend = isSend;
    }

    public String getReceiveIdentify() {
        return receiveIdentify;
    }

    public void setReceiveIdentify(String receiveIdentify) {
        this.receiveIdentify = receiveIdentify;
    }

    @Override
    public String toString() {
        return "TblSendLog{" +
        "id=" + id +
        ", sendName=" + sendName +
        ", requestDate=" + requestDate +
        ", sendTag=" + sendTag +
        ", timingDate=" + timingDate +
        ", messageType=" + messageType +
        ", extendPhone=" + extendPhone +
        ", receivePhone=" + receivePhone +
        ", messageContent=" + messageContent +
        ", isSend=" + isSend +
        ", receiveIdentify=" + receiveIdentify +
        "}";
    }
}
