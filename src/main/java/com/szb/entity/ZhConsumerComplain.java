package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 业主投诉
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="ZhConsumerComplain对象", description="业主投诉")
public class ZhConsumerComplain implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自动编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "房间编号")
    private String cellId;

    @ApiModelProperty(value = "投诉人")
    private String complainPerson;

    @ApiModelProperty(value = "投诉电话")
    private String complainPhone;

    @ApiModelProperty(value = "投诉日期")
    private LocalDateTime complainDate;

    @ApiModelProperty(value = "联系电话")
    private String phoneNumber;

    @ApiModelProperty(value = "接待人")
    private String receptionPerson;

    @ApiModelProperty(value = "投诉类别")
    private String complainType;

    @ApiModelProperty(value = "状态")
    private String status;

    @ApiModelProperty(value = "开始受理人")
    private String startAcceptPerson;

    @ApiModelProperty(value = "开始受理时间")
    private LocalDateTime startAcceptDate;

    @ApiModelProperty(value = "受理结果")
    private String acceptResult;

    @ApiModelProperty(value = "受理完成人")
    private String acceptFinishPerson;

    @ApiModelProperty(value = "受理完成时间")
    private LocalDateTime acceptFinishDate;

    @ApiModelProperty(value = "数据来源")
    private String datasource;

    @ApiModelProperty(value = "参考附件")
    private String referAttach;

    @ApiModelProperty(value = "回访人")
    private String returnVisitPerson;

    @ApiModelProperty(value = "回访时间")
    private LocalDateTime returnVisitDate;

    @ApiModelProperty(value = "是否满意")
    private String isSatisfy;

    @ApiModelProperty(value = "业主评价")
    private String customerEvaluate;

    @ApiModelProperty(value = "创建人")
    private String createPerson;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCellId() {
        return cellId;
    }

    public void setCellId(String cellId) {
        this.cellId = cellId;
    }

    public String getComplainPerson() {
        return complainPerson;
    }

    public void setComplainPerson(String complainPerson) {
        this.complainPerson = complainPerson;
    }

    public String getComplainPhone() {
        return complainPhone;
    }

    public void setComplainPhone(String complainPhone) {
        this.complainPhone = complainPhone;
    }

    public LocalDateTime getComplainDate() {
        return complainDate;
    }

    public void setComplainDate(LocalDateTime complainDate) {
        this.complainDate = complainDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getReceptionPerson() {
        return receptionPerson;
    }

    public void setReceptionPerson(String receptionPerson) {
        this.receptionPerson = receptionPerson;
    }

    public String getComplainType() {
        return complainType;
    }

    public void setComplainType(String complainType) {
        this.complainType = complainType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStartAcceptPerson() {
        return startAcceptPerson;
    }

    public void setStartAcceptPerson(String startAcceptPerson) {
        this.startAcceptPerson = startAcceptPerson;
    }

    public LocalDateTime getStartAcceptDate() {
        return startAcceptDate;
    }

    public void setStartAcceptDate(LocalDateTime startAcceptDate) {
        this.startAcceptDate = startAcceptDate;
    }

    public String getAcceptResult() {
        return acceptResult;
    }

    public void setAcceptResult(String acceptResult) {
        this.acceptResult = acceptResult;
    }

    public String getAcceptFinishPerson() {
        return acceptFinishPerson;
    }

    public void setAcceptFinishPerson(String acceptFinishPerson) {
        this.acceptFinishPerson = acceptFinishPerson;
    }

    public LocalDateTime getAcceptFinishDate() {
        return acceptFinishDate;
    }

    public void setAcceptFinishDate(LocalDateTime acceptFinishDate) {
        this.acceptFinishDate = acceptFinishDate;
    }

    public String getDatasource() {
        return datasource;
    }

    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    public String getReferAttach() {
        return referAttach;
    }

    public void setReferAttach(String referAttach) {
        this.referAttach = referAttach;
    }

    public String getReturnVisitPerson() {
        return returnVisitPerson;
    }

    public void setReturnVisitPerson(String returnVisitPerson) {
        this.returnVisitPerson = returnVisitPerson;
    }

    public LocalDateTime getReturnVisitDate() {
        return returnVisitDate;
    }

    public void setReturnVisitDate(LocalDateTime returnVisitDate) {
        this.returnVisitDate = returnVisitDate;
    }

    public String getIsSatisfy() {
        return isSatisfy;
    }

    public void setIsSatisfy(String isSatisfy) {
        this.isSatisfy = isSatisfy;
    }

    public String getCustomerEvaluate() {
        return customerEvaluate;
    }

    public void setCustomerEvaluate(String customerEvaluate) {
        this.customerEvaluate = customerEvaluate;
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

    @Override
    public String toString() {
        return "ZhConsumerComplain{" +
        "id=" + id +
        ", cellId=" + cellId +
        ", complainPerson=" + complainPerson +
        ", complainPhone=" + complainPhone +
        ", complainDate=" + complainDate +
        ", phoneNumber=" + phoneNumber +
        ", receptionPerson=" + receptionPerson +
        ", complainType=" + complainType +
        ", status=" + status +
        ", startAcceptPerson=" + startAcceptPerson +
        ", startAcceptDate=" + startAcceptDate +
        ", acceptResult=" + acceptResult +
        ", acceptFinishPerson=" + acceptFinishPerson +
        ", acceptFinishDate=" + acceptFinishDate +
        ", datasource=" + datasource +
        ", referAttach=" + referAttach +
        ", returnVisitPerson=" + returnVisitPerson +
        ", returnVisitDate=" + returnVisitDate +
        ", isSatisfy=" + isSatisfy +
        ", customerEvaluate=" + customerEvaluate +
        ", createPerson=" + createPerson +
        ", createDate=" + createDate +
        "}";
    }
}
