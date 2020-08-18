package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 业委会成员
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="WyCommitteeMembers对象", description="业委会成员")
public class WyCommitteeMembers implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自动编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "成员代码")
    private String memberCode;

    @ApiModelProperty(value = "成员姓名")
    private String memberName;

    @ApiModelProperty(value = "职务")
    private String memberDuty;

    @ApiModelProperty(value = "出生日期")
    private LocalDateTime birthday;

    @ApiModelProperty(value = "性别")
    private String gender;

    @ApiModelProperty(value = "联系电话")
    private String phoneNumber;

    @ApiModelProperty(value = "工作单位")
    private String workPlace;

    @ApiModelProperty(value = "个人简介")
    private String selfIntroduce;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "所属公司")
    private String company;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(String memberCode) {
        this.memberCode = memberCode;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberDuty() {
        return memberDuty;
    }

    public void setMemberDuty(String memberDuty) {
        this.memberDuty = memberDuty;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public String getSelfIntroduce() {
        return selfIntroduce;
    }

    public void setSelfIntroduce(String selfIntroduce) {
        this.selfIntroduce = selfIntroduce;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "WyCommitteeMembers{" +
        "id=" + id +
        ", memberCode=" + memberCode +
        ", memberName=" + memberName +
        ", memberDuty=" + memberDuty +
        ", birthday=" + birthday +
        ", gender=" + gender +
        ", phoneNumber=" + phoneNumber +
        ", workPlace=" + workPlace +
        ", selfIntroduce=" + selfIntroduce +
        ", remark=" + remark +
        ", company=" + company +
        "}";
    }
}
