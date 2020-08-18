package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 业主服务
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="ZhCustomerService对象", description="业主服务")
public class ZhCustomerService implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自动编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "房间编号")
    private Integer cellId;

    @ApiModelProperty(value = "申请人姓名")
    private String proposer;

    @ApiModelProperty(value = "联系电话")
    private String phoneNumber;

    @ApiModelProperty(value = "诉求时间")
    private LocalDateTime appealDate;

    @ApiModelProperty(value = "诉求事项")
    private String appealEvent;

    @ApiModelProperty(value = "状态")
    private String status;

    @ApiModelProperty(value = "服务类型")
    private Long serviceType;

    @ApiModelProperty(value = "创建人")
    private String createPerson;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "标识")
    private String identify;

    @ApiModelProperty(value = "审批人")
    private String checkPerson;

    @ApiModelProperty(value = "审批时间")
    private LocalDateTime checkDate;

    @ApiModelProperty(value = "审批意见")
    private String checkAdvice;

    @ApiModelProperty(value = "服务费用")
    private Double serviceMoney;

    @ApiModelProperty(value = "回访人")
    private String returnVisitPerson;

    @ApiModelProperty(value = "回访时间")
    private LocalDateTime returnVisitDate;

    @ApiModelProperty(value = "是否满意")
    private String isSatisfy;

    @ApiModelProperty(value = "业主评价")
    private String customerEvaluate;

    @ApiModelProperty(value = "参考附件")
    private String referAttach;


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

    public String getProposer() {
        return proposer;
    }

    public void setProposer(String proposer) {
        this.proposer = proposer;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDateTime getAppealDate() {
        return appealDate;
    }

    public void setAppealDate(LocalDateTime appealDate) {
        this.appealDate = appealDate;
    }

    public String getAppealEvent() {
        return appealEvent;
    }

    public void setAppealEvent(String appealEvent) {
        this.appealEvent = appealEvent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getServiceType() {
        return serviceType;
    }

    public void setServiceType(Long serviceType) {
        this.serviceType = serviceType;
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

    public String getIdentify() {
        return identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify;
    }

    public String getCheckPerson() {
        return checkPerson;
    }

    public void setCheckPerson(String checkPerson) {
        this.checkPerson = checkPerson;
    }

    public LocalDateTime getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(LocalDateTime checkDate) {
        this.checkDate = checkDate;
    }

    public String getCheckAdvice() {
        return checkAdvice;
    }

    public void setCheckAdvice(String checkAdvice) {
        this.checkAdvice = checkAdvice;
    }

    public Double getServiceMoney() {
        return serviceMoney;
    }

    public void setServiceMoney(Double serviceMoney) {
        this.serviceMoney = serviceMoney;
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

    public String getReferAttach() {
        return referAttach;
    }

    public void setReferAttach(String referAttach) {
        this.referAttach = referAttach;
    }

    @Override
    public String toString() {
        return "ZhCustomerService{" +
        "id=" + id +
        ", cellId=" + cellId +
        ", proposer=" + proposer +
        ", phoneNumber=" + phoneNumber +
        ", appealDate=" + appealDate +
        ", appealEvent=" + appealEvent +
        ", status=" + status +
        ", serviceType=" + serviceType +
        ", createPerson=" + createPerson +
        ", createDate=" + createDate +
        ", identify=" + identify +
        ", checkPerson=" + checkPerson +
        ", checkDate=" + checkDate +
        ", checkAdvice=" + checkAdvice +
        ", serviceMoney=" + serviceMoney +
        ", returnVisitPerson=" + returnVisitPerson +
        ", returnVisitDate=" + returnVisitDate +
        ", isSatisfy=" + isSatisfy +
        ", customerEvaluate=" + customerEvaluate +
        ", referAttach=" + referAttach +
        "}";
    }
}
