package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 车位租赁
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="WyCarSpaceRent对象", description="车位租赁")
public class WyCarSpaceRent implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自动编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "合同编号")
    private String constractId;

    @ApiModelProperty(value = "所属车位编号")
    private String carSpaceId;

    @ApiModelProperty(value = "租期开始日")
    private LocalDateTime rentStartDate;

    @ApiModelProperty(value = "租期结束日")
    private LocalDateTime rentStopDate;

    @ApiModelProperty(value = "承租月数")
    private Double rentMonth;

    @ApiModelProperty(value = "使用人id")
    private Integer userId;

    @ApiModelProperty(value = "使用人名称")
    private String userName;

    @ApiModelProperty(value = "车牌号码")
    private String carLicenceId;

    @ApiModelProperty(value = "停车证号")
    private String stopCarLicence;

    @ApiModelProperty(value = "月租金")
    private Double rentPerMonth;

    @ApiModelProperty(value = "月服务费")
    private Double serviceMoneyPerMonth;

    @ApiModelProperty(value = "签订日期")
    private LocalDateTime signDate;

    @ApiModelProperty(value = "生效日期")
    private LocalDateTime startDate;

    @ApiModelProperty(value = "终止日期")
    private LocalDateTime stopDate;

    @ApiModelProperty(value = "状态")
    private String status;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "中介费")
    private Double agentMoney;

    @ApiModelProperty(value = "是否收取租金")
    private String isRentMoney;

    @ApiModelProperty(value = "合同附件")
    private String contractAttach;

    @ApiModelProperty(value = "创建人")
    private String createPerson;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "修改人")
    private String updatePerson;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConstractId() {
        return constractId;
    }

    public void setConstractId(String constractId) {
        this.constractId = constractId;
    }

    public String getCarSpaceId() {
        return carSpaceId;
    }

    public void setCarSpaceId(String carSpaceId) {
        this.carSpaceId = carSpaceId;
    }

    public LocalDateTime getRentStartDate() {
        return rentStartDate;
    }

    public void setRentStartDate(LocalDateTime rentStartDate) {
        this.rentStartDate = rentStartDate;
    }

    public LocalDateTime getRentStopDate() {
        return rentStopDate;
    }

    public void setRentStopDate(LocalDateTime rentStopDate) {
        this.rentStopDate = rentStopDate;
    }

    public Double getRentMonth() {
        return rentMonth;
    }

    public void setRentMonth(Double rentMonth) {
        this.rentMonth = rentMonth;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCarLicenceId() {
        return carLicenceId;
    }

    public void setCarLicenceId(String carLicenceId) {
        this.carLicenceId = carLicenceId;
    }

    public String getStopCarLicence() {
        return stopCarLicence;
    }

    public void setStopCarLicence(String stopCarLicence) {
        this.stopCarLicence = stopCarLicence;
    }

    public Double getRentPerMonth() {
        return rentPerMonth;
    }

    public void setRentPerMonth(Double rentPerMonth) {
        this.rentPerMonth = rentPerMonth;
    }

    public Double getServiceMoneyPerMonth() {
        return serviceMoneyPerMonth;
    }

    public void setServiceMoneyPerMonth(Double serviceMoneyPerMonth) {
        this.serviceMoneyPerMonth = serviceMoneyPerMonth;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Double getAgentMoney() {
        return agentMoney;
    }

    public void setAgentMoney(Double agentMoney) {
        this.agentMoney = agentMoney;
    }

    public String getIsRentMoney() {
        return isRentMoney;
    }

    public void setIsRentMoney(String isRentMoney) {
        this.isRentMoney = isRentMoney;
    }

    public String getContractAttach() {
        return contractAttach;
    }

    public void setContractAttach(String contractAttach) {
        this.contractAttach = contractAttach;
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

    @Override
    public String toString() {
        return "WyCarSpaceRent{" +
        "id=" + id +
        ", constractId=" + constractId +
        ", carSpaceId=" + carSpaceId +
        ", rentStartDate=" + rentStartDate +
        ", rentStopDate=" + rentStopDate +
        ", rentMonth=" + rentMonth +
        ", userId=" + userId +
        ", userName=" + userName +
        ", carLicenceId=" + carLicenceId +
        ", stopCarLicence=" + stopCarLicence +
        ", rentPerMonth=" + rentPerMonth +
        ", serviceMoneyPerMonth=" + serviceMoneyPerMonth +
        ", signDate=" + signDate +
        ", startDate=" + startDate +
        ", stopDate=" + stopDate +
        ", status=" + status +
        ", remark=" + remark +
        ", agentMoney=" + agentMoney +
        ", isRentMoney=" + isRentMoney +
        ", contractAttach=" + contractAttach +
        ", createPerson=" + createPerson +
        ", createDate=" + createDate +
        ", updatePerson=" + updatePerson +
        ", updateDate=" + updateDate +
        "}";
    }
}
