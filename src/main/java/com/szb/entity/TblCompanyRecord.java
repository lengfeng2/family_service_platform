package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 单位名录
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="TblCompanyRecord对象", description="单位名录")
public class TblCompanyRecord implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自动编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "公司名称")
    private String companyName;

    @ApiModelProperty(value = "公司地址")
    private String companyAdd;

    @ApiModelProperty(value = "公司类型")
    private String companyType;

    @ApiModelProperty(value = "公司级别")
    private String compantGrade;

    @ApiModelProperty(value = "上级部门")
    private String parentCompany;

    @ApiModelProperty(value = "负责人")
    private String leader;

    @ApiModelProperty(value = "邮政编码")
    private String postCode;

    @ApiModelProperty(value = "公司电话")
    private String companyPhone;

    @ApiModelProperty(value = "传真号码")
    private String faxNumber;

    @ApiModelProperty(value = "电子邮件")
    private String email;

    @ApiModelProperty(value = "简单介绍")
    private String simpleDesc;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "录入人")
    private String inputPerson;

    @ApiModelProperty(value = "录入时间")
    private LocalDateTime inputTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAdd() {
        return companyAdd;
    }

    public void setCompanyAdd(String companyAdd) {
        this.companyAdd = companyAdd;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getCompantGrade() {
        return compantGrade;
    }

    public void setCompantGrade(String compantGrade) {
        this.compantGrade = compantGrade;
    }

    public String getParentCompany() {
        return parentCompany;
    }

    public void setParentCompany(String parentCompany) {
        this.parentCompany = parentCompany;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSimpleDesc() {
        return simpleDesc;
    }

    public void setSimpleDesc(String simpleDesc) {
        this.simpleDesc = simpleDesc;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getInputPerson() {
        return inputPerson;
    }

    public void setInputPerson(String inputPerson) {
        this.inputPerson = inputPerson;
    }

    public LocalDateTime getInputTime() {
        return inputTime;
    }

    public void setInputTime(LocalDateTime inputTime) {
        this.inputTime = inputTime;
    }

    @Override
    public String toString() {
        return "TblCompanyRecord{" +
        "id=" + id +
        ", companyName=" + companyName +
        ", companyAdd=" + companyAdd +
        ", companyType=" + companyType +
        ", compantGrade=" + compantGrade +
        ", parentCompany=" + parentCompany +
        ", leader=" + leader +
        ", postCode=" + postCode +
        ", companyPhone=" + companyPhone +
        ", faxNumber=" + faxNumber +
        ", email=" + email +
        ", simpleDesc=" + simpleDesc +
        ", remark=" + remark +
        ", inputPerson=" + inputPerson +
        ", inputTime=" + inputTime +
        "}";
    }
}
