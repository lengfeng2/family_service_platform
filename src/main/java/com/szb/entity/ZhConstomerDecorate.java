package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 业主装修
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="ZhConstomerDecorate对象", description="业主装修")
public class ZhConstomerDecorate implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自动编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "房间编号")
    private String cellId;

    @ApiModelProperty(value = "申请人")
    private String proposer;

    @ApiModelProperty(value = "联系电话")
    private String phoneNumber;

    @ApiModelProperty(value = "申请日期")
    private LocalDateTime proposerDate;

    @ApiModelProperty(value = "装修内容")
    private String decorateContent;

    @ApiModelProperty(value = "审批人")
    private String checkPerson;

    @ApiModelProperty(value = "装修保证金")
    private Double decorateEnsureMoney;

    @ApiModelProperty(value = "审批日期")
    private LocalDateTime checkDate;

    @ApiModelProperty(value = "审批意见")
    private String checkAdvice;

    @ApiModelProperty(value = "负责人电话")
    private String leaderPhone;

    @ApiModelProperty(value = "施工单位")
    private String executeCompany;

    @ApiModelProperty(value = "施工开始日期")
    private LocalDateTime executeStartDate;

    @ApiModelProperty(value = "负责人")
    private String leader;

    @ApiModelProperty(value = "验收人")
    private String checkedPerson;

    @ApiModelProperty(value = "施工截止日期")
    private LocalDateTime executeStopDate;

    @ApiModelProperty(value = "验收意见")
    private String checkedAdvice;

    @ApiModelProperty(value = "验收日期")
    private LocalDateTime checkedDate;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "状态")
    private String status;

    @ApiModelProperty(value = "创建人")
    private String createPerson;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "标识")
    private String identify;

    @ApiModelProperty(value = "确认人")
    private String confirmPerson;

    @ApiModelProperty(value = "确认时间")
    private LocalDateTime confirmDate;

    @ApiModelProperty(value = "装修附件")
    private String decorateAttach;

    @ApiModelProperty(value = "违约金")
    private Double againstMoney;

    @ApiModelProperty(value = "作废人")
    private String invalidPerson;

    @ApiModelProperty(value = "作废时间")
    private LocalDateTime invalidDate;


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

    public LocalDateTime getProposerDate() {
        return proposerDate;
    }

    public void setProposerDate(LocalDateTime proposerDate) {
        this.proposerDate = proposerDate;
    }

    public String getDecorateContent() {
        return decorateContent;
    }

    public void setDecorateContent(String decorateContent) {
        this.decorateContent = decorateContent;
    }

    public String getCheckPerson() {
        return checkPerson;
    }

    public void setCheckPerson(String checkPerson) {
        this.checkPerson = checkPerson;
    }

    public Double getDecorateEnsureMoney() {
        return decorateEnsureMoney;
    }

    public void setDecorateEnsureMoney(Double decorateEnsureMoney) {
        this.decorateEnsureMoney = decorateEnsureMoney;
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

    public String getLeaderPhone() {
        return leaderPhone;
    }

    public void setLeaderPhone(String leaderPhone) {
        this.leaderPhone = leaderPhone;
    }

    public String getExecuteCompany() {
        return executeCompany;
    }

    public void setExecuteCompany(String executeCompany) {
        this.executeCompany = executeCompany;
    }

    public LocalDateTime getExecuteStartDate() {
        return executeStartDate;
    }

    public void setExecuteStartDate(LocalDateTime executeStartDate) {
        this.executeStartDate = executeStartDate;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getCheckedPerson() {
        return checkedPerson;
    }

    public void setCheckedPerson(String checkedPerson) {
        this.checkedPerson = checkedPerson;
    }

    public LocalDateTime getExecuteStopDate() {
        return executeStopDate;
    }

    public void setExecuteStopDate(LocalDateTime executeStopDate) {
        this.executeStopDate = executeStopDate;
    }

    public String getCheckedAdvice() {
        return checkedAdvice;
    }

    public void setCheckedAdvice(String checkedAdvice) {
        this.checkedAdvice = checkedAdvice;
    }

    public LocalDateTime getCheckedDate() {
        return checkedDate;
    }

    public void setCheckedDate(LocalDateTime checkedDate) {
        this.checkedDate = checkedDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getConfirmPerson() {
        return confirmPerson;
    }

    public void setConfirmPerson(String confirmPerson) {
        this.confirmPerson = confirmPerson;
    }

    public LocalDateTime getConfirmDate() {
        return confirmDate;
    }

    public void setConfirmDate(LocalDateTime confirmDate) {
        this.confirmDate = confirmDate;
    }

    public String getDecorateAttach() {
        return decorateAttach;
    }

    public void setDecorateAttach(String decorateAttach) {
        this.decorateAttach = decorateAttach;
    }

    public Double getAgainstMoney() {
        return againstMoney;
    }

    public void setAgainstMoney(Double againstMoney) {
        this.againstMoney = againstMoney;
    }

    public String getInvalidPerson() {
        return invalidPerson;
    }

    public void setInvalidPerson(String invalidPerson) {
        this.invalidPerson = invalidPerson;
    }

    public LocalDateTime getInvalidDate() {
        return invalidDate;
    }

    public void setInvalidDate(LocalDateTime invalidDate) {
        this.invalidDate = invalidDate;
    }

    @Override
    public String toString() {
        return "ZhConstomerDecorate{" +
        "id=" + id +
        ", cellId=" + cellId +
        ", proposer=" + proposer +
        ", phoneNumber=" + phoneNumber +
        ", proposerDate=" + proposerDate +
        ", decorateContent=" + decorateContent +
        ", checkPerson=" + checkPerson +
        ", decorateEnsureMoney=" + decorateEnsureMoney +
        ", checkDate=" + checkDate +
        ", checkAdvice=" + checkAdvice +
        ", leaderPhone=" + leaderPhone +
        ", executeCompany=" + executeCompany +
        ", executeStartDate=" + executeStartDate +
        ", leader=" + leader +
        ", checkedPerson=" + checkedPerson +
        ", executeStopDate=" + executeStopDate +
        ", checkedAdvice=" + checkedAdvice +
        ", checkedDate=" + checkedDate +
        ", remark=" + remark +
        ", status=" + status +
        ", createPerson=" + createPerson +
        ", createDate=" + createDate +
        ", identify=" + identify +
        ", confirmPerson=" + confirmPerson +
        ", confirmDate=" + confirmDate +
        ", decorateAttach=" + decorateAttach +
        ", againstMoney=" + againstMoney +
        ", invalidPerson=" + invalidPerson +
        ", invalidDate=" + invalidDate +
        "}";
    }
}
