package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 企业档案
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="TblCompany对象", description="企业档案")
public class TblCompany implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "企业编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "企业全称")
    private String companyFullName;

    @ApiModelProperty(value = "企业简称")
    private String companySimpleName;

    @ApiModelProperty(value = "英文名称")
    private String companyEnglishName;

    @ApiModelProperty(value = "企业品牌")
    private String companyBrand;

    @ApiModelProperty(value = "企业类型")
    private String companyType;

    @ApiModelProperty(value = "所属行业")
    private String companyTrade;

    @ApiModelProperty(value = "企业地址")
    private String companyAddr;

    @ApiModelProperty(value = "邮政编码")
    private String postCode;

    @ApiModelProperty(value = "企业电话")
    private String companyPhone;

    @ApiModelProperty(value = "企业传真")
    private String companyFax;

    @ApiModelProperty(value = "企业网站")
    private String companyWebsite;

    @ApiModelProperty(value = "企业邮箱")
    private String companyEmail;

    @ApiModelProperty(value = "国税号")
    private String companyNational;

    @ApiModelProperty(value = "地税号")
    private String companyLand;

    @ApiModelProperty(value = "开户银行")
    private String openBank;

    @ApiModelProperty(value = "银行账号")
    private String bankAccount;

    @ApiModelProperty(value = "法人代表")
    private String companyLeader;

    @ApiModelProperty(value = "注册时间")
    private LocalDateTime registerDate;

    @ApiModelProperty(value = "注册资金")
    private Double registerMoney;

    @ApiModelProperty(value = "员工人数")
    private String employeeNumber;

    @ApiModelProperty(value = "企业简介")
    private String companyIntro;

    @ApiModelProperty(value = "备注")
    private String remark;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyFullName() {
        return companyFullName;
    }

    public void setCompanyFullName(String companyFullName) {
        this.companyFullName = companyFullName;
    }

    public String getCompanySimpleName() {
        return companySimpleName;
    }

    public void setCompanySimpleName(String companySimpleName) {
        this.companySimpleName = companySimpleName;
    }

    public String getCompanyEnglishName() {
        return companyEnglishName;
    }

    public void setCompanyEnglishName(String companyEnglishName) {
        this.companyEnglishName = companyEnglishName;
    }

    public String getCompanyBrand() {
        return companyBrand;
    }

    public void setCompanyBrand(String companyBrand) {
        this.companyBrand = companyBrand;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getCompanyTrade() {
        return companyTrade;
    }

    public void setCompanyTrade(String companyTrade) {
        this.companyTrade = companyTrade;
    }

    public String getCompanyAddr() {
        return companyAddr;
    }

    public void setCompanyAddr(String companyAddr) {
        this.companyAddr = companyAddr;
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

    public String getCompanyFax() {
        return companyFax;
    }

    public void setCompanyFax(String companyFax) {
        this.companyFax = companyFax;
    }

    public String getCompanyWebsite() {
        return companyWebsite;
    }

    public void setCompanyWebsite(String companyWebsite) {
        this.companyWebsite = companyWebsite;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public String getCompanyNational() {
        return companyNational;
    }

    public void setCompanyNational(String companyNational) {
        this.companyNational = companyNational;
    }

    public String getCompanyLand() {
        return companyLand;
    }

    public void setCompanyLand(String companyLand) {
        this.companyLand = companyLand;
    }

    public String getOpenBank() {
        return openBank;
    }

    public void setOpenBank(String openBank) {
        this.openBank = openBank;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getCompanyLeader() {
        return companyLeader;
    }

    public void setCompanyLeader(String companyLeader) {
        this.companyLeader = companyLeader;
    }

    public LocalDateTime getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDateTime registerDate) {
        this.registerDate = registerDate;
    }

    public Double getRegisterMoney() {
        return registerMoney;
    }

    public void setRegisterMoney(Double registerMoney) {
        this.registerMoney = registerMoney;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getCompanyIntro() {
        return companyIntro;
    }

    public void setCompanyIntro(String companyIntro) {
        this.companyIntro = companyIntro;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "TblCompany{" +
        "id=" + id +
        ", companyFullName=" + companyFullName +
        ", companySimpleName=" + companySimpleName +
        ", companyEnglishName=" + companyEnglishName +
        ", companyBrand=" + companyBrand +
        ", companyType=" + companyType +
        ", companyTrade=" + companyTrade +
        ", companyAddr=" + companyAddr +
        ", postCode=" + postCode +
        ", companyPhone=" + companyPhone +
        ", companyFax=" + companyFax +
        ", companyWebsite=" + companyWebsite +
        ", companyEmail=" + companyEmail +
        ", companyNational=" + companyNational +
        ", companyLand=" + companyLand +
        ", openBank=" + openBank +
        ", bankAccount=" + bankAccount +
        ", companyLeader=" + companyLeader +
        ", registerDate=" + registerDate +
        ", registerMoney=" + registerMoney +
        ", employeeNumber=" + employeeNumber +
        ", companyIntro=" + companyIntro +
        ", remark=" + remark +
        "}";
    }
}
