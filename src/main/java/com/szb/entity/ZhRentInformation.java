package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 租户信息
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="ZhRentInformation对象", description="租户信息")
public class ZhRentInformation implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自动编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "租户编码")
    private String rentCode;

    @ApiModelProperty(value = "租户名称")
    private String rentName;

    @ApiModelProperty(value = "法定代表")
    private String memberOfRight;

    @ApiModelProperty(value = "租户类型")
    private Long rentType;

    @ApiModelProperty(value = "联系人")
    private String contact;

    @ApiModelProperty(value = "性别")
    private String gender;

    @ApiModelProperty(value = "联系电话")
    private String homeNumber;

    @ApiModelProperty(value = "手机")
    private String phoneNumber;

    @ApiModelProperty(value = "地址")
    private String addr;

    @ApiModelProperty(value = "证件类型")
    private Long certificateType;

    @ApiModelProperty(value = "主营商品")
    private Long mainSale;

    @ApiModelProperty(value = "证件号码")
    private String certificateNumber;

    @ApiModelProperty(value = "状态")
    private String status;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "照片地址")
    private String pictureUrl;

    @ApiModelProperty(value = "创建人")
    private String createPerson;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "修改人")
    private String updatePerson;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateDate;

    @ApiModelProperty(value = "所属公司")
    private String company;

    @ApiModelProperty(value = "登陆密码")
    private String pwd;

    @ApiModelProperty(value = "租户附件")
    private String rentAttach;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRentCode() {
        return rentCode;
    }

    public void setRentCode(String rentCode) {
        this.rentCode = rentCode;
    }

    public String getRentName() {
        return rentName;
    }

    public void setRentName(String rentName) {
        this.rentName = rentName;
    }

    public String getMemberOfRight() {
        return memberOfRight;
    }

    public void setMemberOfRight(String memberOfRight) {
        this.memberOfRight = memberOfRight;
    }

    public Long getRentType() {
        return rentType;
    }

    public void setRentType(Long rentType) {
        this.rentType = rentType;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Long getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(Long certificateType) {
        this.certificateType = certificateType;
    }

    public Long getMainSale() {
        return mainSale;
    }

    public void setMainSale(Long mainSale) {
        this.mainSale = mainSale;
    }

    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
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

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRentAttach() {
        return rentAttach;
    }

    public void setRentAttach(String rentAttach) {
        this.rentAttach = rentAttach;
    }

    @Override
    public String toString() {
        return "ZhRentInformation{" +
        "id=" + id +
        ", rentCode=" + rentCode +
        ", rentName=" + rentName +
        ", memberOfRight=" + memberOfRight +
        ", rentType=" + rentType +
        ", contact=" + contact +
        ", gender=" + gender +
        ", homeNumber=" + homeNumber +
        ", phoneNumber=" + phoneNumber +
        ", addr=" + addr +
        ", certificateType=" + certificateType +
        ", mainSale=" + mainSale +
        ", certificateNumber=" + certificateNumber +
        ", status=" + status +
        ", remark=" + remark +
        ", pictureUrl=" + pictureUrl +
        ", createPerson=" + createPerson +
        ", createDate=" + createDate +
        ", updatePerson=" + updatePerson +
        ", updateDate=" + updateDate +
        ", company=" + company +
        ", pwd=" + pwd +
        ", rentAttach=" + rentAttach +
        "}";
    }
}
