package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 邮件接受
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="TblEmailReceive对象", description="邮件接受")
public class TblEmailReceive implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "接受id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "所属邮件id")
    private Long emailSendId;

    @ApiModelProperty(value = "单个接收人id")
    private String receiveId;

    @ApiModelProperty(value = "接受人群编码")
    private String receivePersonCode;

    @ApiModelProperty(value = "接受人群名称")
    private String receivePersonName;

    @ApiModelProperty(value = "邮件标题")
    private String emailTitle;

    @ApiModelProperty(value = "邮件内容")
    private String emailContent;

    @ApiModelProperty(value = "重要级别")
    private String importantGrade;

    @ApiModelProperty(value = "状态")
    private String status;

    @ApiModelProperty(value = "删除标志")
    private String isDelete;

    @ApiModelProperty(value = "密送标志")
    private String isSecretSend;

    @ApiModelProperty(value = "邮件附件")
    private String emailAttach;

    @ApiModelProperty(value = "接受类型")
    private String receiveType;

    @ApiModelProperty(value = "发送人id")
    private String sendPersonId;

    @ApiModelProperty(value = "发送人姓名")
    private String sendPersonName;

    @ApiModelProperty(value = "发送时间")
    private LocalDateTime sendDate;

    @ApiModelProperty(value = "接受时间")
    private LocalDateTime receiveDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getEmailSendId() {
        return emailSendId;
    }

    public void setEmailSendId(Long emailSendId) {
        this.emailSendId = emailSendId;
    }

    public String getReceiveId() {
        return receiveId;
    }

    public void setReceiveId(String receiveId) {
        this.receiveId = receiveId;
    }

    public String getReceivePersonCode() {
        return receivePersonCode;
    }

    public void setReceivePersonCode(String receivePersonCode) {
        this.receivePersonCode = receivePersonCode;
    }

    public String getReceivePersonName() {
        return receivePersonName;
    }

    public void setReceivePersonName(String receivePersonName) {
        this.receivePersonName = receivePersonName;
    }

    public String getEmailTitle() {
        return emailTitle;
    }

    public void setEmailTitle(String emailTitle) {
        this.emailTitle = emailTitle;
    }

    public String getEmailContent() {
        return emailContent;
    }

    public void setEmailContent(String emailContent) {
        this.emailContent = emailContent;
    }

    public String getImportantGrade() {
        return importantGrade;
    }

    public void setImportantGrade(String importantGrade) {
        this.importantGrade = importantGrade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    public String getIsSecretSend() {
        return isSecretSend;
    }

    public void setIsSecretSend(String isSecretSend) {
        this.isSecretSend = isSecretSend;
    }

    public String getEmailAttach() {
        return emailAttach;
    }

    public void setEmailAttach(String emailAttach) {
        this.emailAttach = emailAttach;
    }

    public String getReceiveType() {
        return receiveType;
    }

    public void setReceiveType(String receiveType) {
        this.receiveType = receiveType;
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

    public LocalDateTime getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(LocalDateTime receiveDate) {
        this.receiveDate = receiveDate;
    }

    @Override
    public String toString() {
        return "TblEmailReceive{" +
        "id=" + id +
        ", emailSendId=" + emailSendId +
        ", receiveId=" + receiveId +
        ", receivePersonCode=" + receivePersonCode +
        ", receivePersonName=" + receivePersonName +
        ", emailTitle=" + emailTitle +
        ", emailContent=" + emailContent +
        ", importantGrade=" + importantGrade +
        ", status=" + status +
        ", isDelete=" + isDelete +
        ", isSecretSend=" + isSecretSend +
        ", emailAttach=" + emailAttach +
        ", receiveType=" + receiveType +
        ", sendPersonId=" + sendPersonId +
        ", sendPersonName=" + sendPersonName +
        ", sendDate=" + sendDate +
        ", receiveDate=" + receiveDate +
        "}";
    }
}
