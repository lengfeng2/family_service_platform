package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 邮件发送
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="TblEmailSend对象", description="邮件发送")
public class TblEmailSend implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "邮件id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

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

    @ApiModelProperty(value = "是否草稿")
    private String isDraft;

    @ApiModelProperty(value = "删除标志")
    private String isDelete;

    @ApiModelProperty(value = "密送标志")
    private String isSecretSend;

    @ApiModelProperty(value = "邮件附件")
    private String emailAttach;

    @ApiModelProperty(value = "发送类型")
    private String sendType;

    @ApiModelProperty(value = "发送人id")
    private String sendPerson;

    @ApiModelProperty(value = "发送人姓名")
    private String sendName;

    @ApiModelProperty(value = "发送时间")
    private LocalDateTime sendDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getIsDraft() {
        return isDraft;
    }

    public void setIsDraft(String isDraft) {
        this.isDraft = isDraft;
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

    public String getSendType() {
        return sendType;
    }

    public void setSendType(String sendType) {
        this.sendType = sendType;
    }

    public String getSendPerson() {
        return sendPerson;
    }

    public void setSendPerson(String sendPerson) {
        this.sendPerson = sendPerson;
    }

    public String getSendName() {
        return sendName;
    }

    public void setSendName(String sendName) {
        this.sendName = sendName;
    }

    public LocalDateTime getSendDate() {
        return sendDate;
    }

    public void setSendDate(LocalDateTime sendDate) {
        this.sendDate = sendDate;
    }

    @Override
    public String toString() {
        return "TblEmailSend{" +
        "id=" + id +
        ", receivePersonCode=" + receivePersonCode +
        ", receivePersonName=" + receivePersonName +
        ", emailTitle=" + emailTitle +
        ", emailContent=" + emailContent +
        ", importantGrade=" + importantGrade +
        ", isDraft=" + isDraft +
        ", isDelete=" + isDelete +
        ", isSecretSend=" + isSecretSend +
        ", emailAttach=" + emailAttach +
        ", sendType=" + sendType +
        ", sendPerson=" + sendPerson +
        ", sendName=" + sendName +
        ", sendDate=" + sendDate +
        "}";
    }
}
