package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 租赁合同
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="ZhRentContract对象", description="租赁合同")
public class ZhRentContract implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自动编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "合同编号")
    private String contractId;

    @ApiModelProperty(value = "签订日期")
    private LocalDateTime signDate;

    @ApiModelProperty(value = "生效日期")
    private LocalDateTime startDate;

    @ApiModelProperty(value = "终止日期")
    private LocalDateTime stopDate;

    @ApiModelProperty(value = "所属租户id")
    private Integer rentId;

    @ApiModelProperty(value = "联系人")
    private String contact;

    @ApiModelProperty(value = "起租日期")
    private LocalDateTime startRentDate;

    @ApiModelProperty(value = "停租日期")
    private LocalDateTime stopRentDate;

    @ApiModelProperty(value = "合同租金金额")
    private Double contractRentMoney;

    @ApiModelProperty(value = "收费面积")
    private Double receiveArea;

    @ApiModelProperty(value = "合同状态")
    private String contractStatus;

    @ApiModelProperty(value = "保证金")
    private Double ensureMoney;

    @ApiModelProperty(value = "保证金说明")
    private String ensureMoneyDesc;

    @ApiModelProperty(value = "合同附件")
    private String contractAttach;

    @ApiModelProperty(value = "租期")
    private Integer rentDays;

    @ApiModelProperty(value = "管理费")
    private Double adminMoney;

    @ApiModelProperty(value = "是否收取租金")
    private String isRentMoney;

    @ApiModelProperty(value = "缴纳方式")
    private Long payMethod;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "创建人")
    private String createPerson;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "修改人")
    private String updatePerson;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateDate;

    @ApiModelProperty(value = "招商人员id")
    private String attractPersonId;

    @ApiModelProperty(value = "招商人员姓名")
    private String attractPersonName;

    @ApiModelProperty(value = "所属公司")
    private String company;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public LocalDateTime getSignDate() {
        return signDate;
    }

    public void setSignDate(LocalDateTime signDate) {
        this.signDate = signDate;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getStopDate() {
        return stopDate;
    }

    public void setStopDate(LocalDateTime stopDate) {
        this.stopDate = stopDate;
    }

    public Integer getRentId() {
        return rentId;
    }

    public void setRentId(Integer rentId) {
        this.rentId = rentId;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public LocalDateTime getStartRentDate() {
        return startRentDate;
    }

    public void setStartRentDate(LocalDateTime startRentDate) {
        this.startRentDate = startRentDate;
    }

    public LocalDateTime getStopRentDate() {
        return stopRentDate;
    }

    public void setStopRentDate(LocalDateTime stopRentDate) {
        this.stopRentDate = stopRentDate;
    }

    public Double getContractRentMoney() {
        return contractRentMoney;
    }

    public void setContractRentMoney(Double contractRentMoney) {
        this.contractRentMoney = contractRentMoney;
    }

    public Double getReceiveArea() {
        return receiveArea;
    }

    public void setReceiveArea(Double receiveArea) {
        this.receiveArea = receiveArea;
    }

    public String getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(String contractStatus) {
        this.contractStatus = contractStatus;
    }

    public Double getEnsureMoney() {
        return ensureMoney;
    }

    public void setEnsureMoney(Double ensureMoney) {
        this.ensureMoney = ensureMoney;
    }

    public String getEnsureMoneyDesc() {
        return ensureMoneyDesc;
    }

    public void setEnsureMoneyDesc(String ensureMoneyDesc) {
        this.ensureMoneyDesc = ensureMoneyDesc;
    }

    public String getContractAttach() {
        return contractAttach;
    }

    public void setContractAttach(String contractAttach) {
        this.contractAttach = contractAttach;
    }

    public Integer getRentDays() {
        return rentDays;
    }

    public void setRentDays(Integer rentDays) {
        this.rentDays = rentDays;
    }

    public Double getAdminMoney() {
        return adminMoney;
    }

    public void setAdminMoney(Double adminMoney) {
        this.adminMoney = adminMoney;
    }

    public String getIsRentMoney() {
        return isRentMoney;
    }

    public void setIsRentMoney(String isRentMoney) {
        this.isRentMoney = isRentMoney;
    }

    public Long getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(Long payMethod) {
        this.payMethod = payMethod;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public String getAttractPersonId() {
        return attractPersonId;
    }

    public void setAttractPersonId(String attractPersonId) {
        this.attractPersonId = attractPersonId;
    }

    public String getAttractPersonName() {
        return attractPersonName;
    }

    public void setAttractPersonName(String attractPersonName) {
        this.attractPersonName = attractPersonName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "ZhRentContract{" +
        "id=" + id +
        ", contractId=" + contractId +
        ", signDate=" + signDate +
        ", startDate=" + startDate +
        ", stopDate=" + stopDate +
        ", rentId=" + rentId +
        ", contact=" + contact +
        ", startRentDate=" + startRentDate +
        ", stopRentDate=" + stopRentDate +
        ", contractRentMoney=" + contractRentMoney +
        ", receiveArea=" + receiveArea +
        ", contractStatus=" + contractStatus +
        ", ensureMoney=" + ensureMoney +
        ", ensureMoneyDesc=" + ensureMoneyDesc +
        ", contractAttach=" + contractAttach +
        ", rentDays=" + rentDays +
        ", adminMoney=" + adminMoney +
        ", isRentMoney=" + isRentMoney +
        ", payMethod=" + payMethod +
        ", remark=" + remark +
        ", createPerson=" + createPerson +
        ", createDate=" + createDate +
        ", updatePerson=" + updatePerson +
        ", updateDate=" + updateDate +
        ", attractPersonId=" + attractPersonId +
        ", attractPersonName=" + attractPersonName +
        ", company=" + company +
        "}";
    }
}
