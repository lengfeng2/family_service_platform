package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 租户转兑
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="ZhRentTransfer对象", description="租户转兑")
public class ZhRentTransfer implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自动编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "所属合同编号")
    private Integer contractId;

    @ApiModelProperty(value = "转出租户id")
    private Integer transferOutId;

    @ApiModelProperty(value = "转出租户名称")
    private String transferOutName;

    @ApiModelProperty(value = "转入租户id")
    private Integer transferInId;

    @ApiModelProperty(value = "转入租户名称")
    private String transferInName;

    @ApiModelProperty(value = "更名费")
    private Double changeNameMoney;

    @ApiModelProperty(value = "转兑说明")
    private String transferDesc;

    @ApiModelProperty(value = "转兑时间")
    private LocalDateTime transferDate;

    @ApiModelProperty(value = "操作人")
    private String operatePerson;

    @ApiModelProperty(value = "操作时间")
    private LocalDateTime operateDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public Integer getTransferOutId() {
        return transferOutId;
    }

    public void setTransferOutId(Integer transferOutId) {
        this.transferOutId = transferOutId;
    }

    public String getTransferOutName() {
        return transferOutName;
    }

    public void setTransferOutName(String transferOutName) {
        this.transferOutName = transferOutName;
    }

    public Integer getTransferInId() {
        return transferInId;
    }

    public void setTransferInId(Integer transferInId) {
        this.transferInId = transferInId;
    }

    public String getTransferInName() {
        return transferInName;
    }

    public void setTransferInName(String transferInName) {
        this.transferInName = transferInName;
    }

    public Double getChangeNameMoney() {
        return changeNameMoney;
    }

    public void setChangeNameMoney(Double changeNameMoney) {
        this.changeNameMoney = changeNameMoney;
    }

    public String getTransferDesc() {
        return transferDesc;
    }

    public void setTransferDesc(String transferDesc) {
        this.transferDesc = transferDesc;
    }

    public LocalDateTime getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(LocalDateTime transferDate) {
        this.transferDate = transferDate;
    }

    public String getOperatePerson() {
        return operatePerson;
    }

    public void setOperatePerson(String operatePerson) {
        this.operatePerson = operatePerson;
    }

    public LocalDateTime getOperateDate() {
        return operateDate;
    }

    public void setOperateDate(LocalDateTime operateDate) {
        this.operateDate = operateDate;
    }

    @Override
    public String toString() {
        return "ZhRentTransfer{" +
        "id=" + id +
        ", contractId=" + contractId +
        ", transferOutId=" + transferOutId +
        ", transferOutName=" + transferOutName +
        ", transferInId=" + transferInId +
        ", transferInName=" + transferInName +
        ", changeNameMoney=" + changeNameMoney +
        ", transferDesc=" + transferDesc +
        ", transferDate=" + transferDate +
        ", operatePerson=" + operatePerson +
        ", operateDate=" + operateDate +
        "}";
    }
}
