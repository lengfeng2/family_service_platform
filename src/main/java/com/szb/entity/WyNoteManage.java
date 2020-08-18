package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 票据管理
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="WyNoteManage对象", description="票据管理")
public class WyNoteManage implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "票据编号")
    @TableId(value = "note_id", type = IdType.AUTO)
    private String noteId;

    @ApiModelProperty(value = "票据前缀")
    private String notePrefix;

    @ApiModelProperty(value = "票据流水号")
    private String noteSerialNumber;

    @ApiModelProperty(value = "票据状态")
    private String noteStatus;

    @ApiModelProperty(value = "票据说明")
    private String noteDesc;

    @ApiModelProperty(value = "使用人id")
    private String userId;

    @ApiModelProperty(value = "使用人姓名")
    private String userName;

    @ApiModelProperty(value = "创建人")
    private String createPerson;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "修改人")
    private String updatePerson;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateDate;

    @ApiModelProperty(value = "分配人id")
    private String assignPersonId;

    @ApiModelProperty(value = "分配人名称")
    private String assignPersonName;

    @ApiModelProperty(value = "分配时间")
    private LocalDateTime assignDate;

    @ApiModelProperty(value = "打印人id")
    private String printPersonId;

    @ApiModelProperty(value = "打印人名称")
    private String printPersonName;

    @ApiModelProperty(value = "打印时间")
    private LocalDateTime printDate;

    @ApiModelProperty(value = "单据类型")
    private String noteType;

    @ApiModelProperty(value = "收款单号")
    private String receiveMoneyId;

    @ApiModelProperty(value = "作废原因")
    private String invalidReason;

    @ApiModelProperty(value = "作废人id")
    private String invalidPersonId;

    @ApiModelProperty(value = "作废人名称")
    private String invalidPersonName;

    @ApiModelProperty(value = "作废时间")
    private LocalDateTime invalidDate;

    @ApiModelProperty(value = "作废确认人")
    private String invalidConfirmPerson;

    @ApiModelProperty(value = "作废确认时间")
    private LocalDateTime invalidConfirmDate;


    public String getNoteId() {
        return noteId;
    }

    public void setNoteId(String noteId) {
        this.noteId = noteId;
    }

    public String getNotePrefix() {
        return notePrefix;
    }

    public void setNotePrefix(String notePrefix) {
        this.notePrefix = notePrefix;
    }

    public String getNoteSerialNumber() {
        return noteSerialNumber;
    }

    public void setNoteSerialNumber(String noteSerialNumber) {
        this.noteSerialNumber = noteSerialNumber;
    }

    public String getNoteStatus() {
        return noteStatus;
    }

    public void setNoteStatus(String noteStatus) {
        this.noteStatus = noteStatus;
    }

    public String getNoteDesc() {
        return noteDesc;
    }

    public void setNoteDesc(String noteDesc) {
        this.noteDesc = noteDesc;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCreatePerson() {
        return createPerson;
    }

    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public String getUpdatePerson() {
        return updatePerson;
    }

    public void setUpdatePerson(String updatePerson) {
        this.updatePerson = updatePerson;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public String getAssignPersonId() {
        return assignPersonId;
    }

    public void setAssignPersonId(String assignPersonId) {
        this.assignPersonId = assignPersonId;
    }

    public String getAssignPersonName() {
        return assignPersonName;
    }

    public void setAssignPersonName(String assignPersonName) {
        this.assignPersonName = assignPersonName;
    }

    public LocalDateTime getAssignDate() {
        return assignDate;
    }

    public void setAssignDate(LocalDateTime assignDate) {
        this.assignDate = assignDate;
    }

    public String getPrintPersonId() {
        return printPersonId;
    }

    public void setPrintPersonId(String printPersonId) {
        this.printPersonId = printPersonId;
    }

    public String getPrintPersonName() {
        return printPersonName;
    }

    public void setPrintPersonName(String printPersonName) {
        this.printPersonName = printPersonName;
    }

    public LocalDateTime getPrintDate() {
        return printDate;
    }

    public void setPrintDate(LocalDateTime printDate) {
        this.printDate = printDate;
    }

    public String getNoteType() {
        return noteType;
    }

    public void setNoteType(String noteType) {
        this.noteType = noteType;
    }

    public String getReceiveMoneyId() {
        return receiveMoneyId;
    }

    public void setReceiveMoneyId(String receiveMoneyId) {
        this.receiveMoneyId = receiveMoneyId;
    }

    public String getInvalidReason() {
        return invalidReason;
    }

    public void setInvalidReason(String invalidReason) {
        this.invalidReason = invalidReason;
    }

    public String getInvalidPersonId() {
        return invalidPersonId;
    }

    public void setInvalidPersonId(String invalidPersonId) {
        this.invalidPersonId = invalidPersonId;
    }

    public String getInvalidPersonName() {
        return invalidPersonName;
    }

    public void setInvalidPersonName(String invalidPersonName) {
        this.invalidPersonName = invalidPersonName;
    }

    public LocalDateTime getInvalidDate() {
        return invalidDate;
    }

    public void setInvalidDate(LocalDateTime invalidDate) {
        this.invalidDate = invalidDate;
    }

    public String getInvalidConfirmPerson() {
        return invalidConfirmPerson;
    }

    public void setInvalidConfirmPerson(String invalidConfirmPerson) {
        this.invalidConfirmPerson = invalidConfirmPerson;
    }

    public LocalDateTime getInvalidConfirmDate() {
        return invalidConfirmDate;
    }

    public void setInvalidConfirmDate(LocalDateTime invalidConfirmDate) {
        this.invalidConfirmDate = invalidConfirmDate;
    }

    @Override
    public String toString() {
        return "WyNoteManage{" +
        "noteId=" + noteId +
        ", notePrefix=" + notePrefix +
        ", noteSerialNumber=" + noteSerialNumber +
        ", noteStatus=" + noteStatus +
        ", noteDesc=" + noteDesc +
        ", userId=" + userId +
        ", userName=" + userName +
        ", createPerson=" + createPerson +
        ", createDate=" + createDate +
        ", updatePerson=" + updatePerson +
        ", updateDate=" + updateDate +
        ", assignPersonId=" + assignPersonId +
        ", assignPersonName=" + assignPersonName +
        ", assignDate=" + assignDate +
        ", printPersonId=" + printPersonId +
        ", printPersonName=" + printPersonName +
        ", printDate=" + printDate +
        ", noteType=" + noteType +
        ", receiveMoneyId=" + receiveMoneyId +
        ", invalidReason=" + invalidReason +
        ", invalidPersonId=" + invalidPersonId +
        ", invalidPersonName=" + invalidPersonName +
        ", invalidDate=" + invalidDate +
        ", invalidConfirmPerson=" + invalidConfirmPerson +
        ", invalidConfirmDate=" + invalidConfirmDate +
        "}";
    }
}
