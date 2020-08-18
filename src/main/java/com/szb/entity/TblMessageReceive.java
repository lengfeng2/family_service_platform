package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 短信接受表
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="TblMessageReceive对象", description="短信接受表")
public class TblMessageReceive implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "记录编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "手机号码")
    private String phone;

    @ApiModelProperty(value = "拓展号码")
    private String extendPhone;

    @ApiModelProperty(value = "短信内容")
    private String messageContent;

    @ApiModelProperty(value = "回复时间")
    private LocalDateTime replyDate;

    @ApiModelProperty(value = "位置序号")
    private String positionOrder;

    @ApiModelProperty(value = "接受时间")
    private LocalDateTime receiveDate;

    @ApiModelProperty(value = "读取标记")
    private Integer readTag;

    @ApiModelProperty(value = "读取时间")
    private LocalDateTime readDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getExtendPhone() {
        return extendPhone;
    }

    public void setExtendPhone(String extendPhone) {
        this.extendPhone = extendPhone;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public LocalDateTime getReplyDate() {
        return replyDate;
    }

    public void setReplyDate(LocalDateTime replyDate) {
        this.replyDate = replyDate;
    }

    public String getPositionOrder() {
        return positionOrder;
    }

    public void setPositionOrder(String positionOrder) {
        this.positionOrder = positionOrder;
    }

    public LocalDateTime getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(LocalDateTime receiveDate) {
        this.receiveDate = receiveDate;
    }

    public Integer getReadTag() {
        return readTag;
    }

    public void setReadTag(Integer readTag) {
        this.readTag = readTag;
    }

    public LocalDateTime getReadDate() {
        return readDate;
    }

    public void setReadDate(LocalDateTime readDate) {
        this.readDate = readDate;
    }

    @Override
    public String toString() {
        return "TblMessageReceive{" +
        "id=" + id +
        ", phone=" + phone +
        ", extendPhone=" + extendPhone +
        ", messageContent=" + messageContent +
        ", replyDate=" + replyDate +
        ", positionOrder=" + positionOrder +
        ", receiveDate=" + receiveDate +
        ", readTag=" + readTag +
        ", readDate=" + readDate +
        "}";
    }
}
