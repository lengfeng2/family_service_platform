package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 员工通讯录
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="TblEmployeeContact对象", description="员工通讯录")
public class TblEmployeeContact implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自动编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "排序号")
    private Integer orderId;

    @ApiModelProperty(value = "所属类别名称")
    private String categoryName;

    @ApiModelProperty(value = "所属类别id")
    private String categoryId;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "工号")
    private String workNum;

    @ApiModelProperty(value = "部门")
    private String dept;

    @ApiModelProperty(value = "角色")
    private String role;

    @ApiModelProperty(value = "职位")
    private String position;

    @ApiModelProperty(value = "性别")
    private String gender;

    @ApiModelProperty(value = "生日")
    private String birthday;

    @ApiModelProperty(value = "办公电话")
    private String officePhone;

    @ApiModelProperty(value = "传真")
    private String fax;

    @ApiModelProperty(value = "移动电话")
    private String movePhone;

    @ApiModelProperty(value = "家庭电话")
    private String homePhone;

    @ApiModelProperty(value = "电子邮件")
    private String email;

    @ApiModelProperty(value = "QQ号")
    private String qq;

    @ApiModelProperty(value = "微信号")
    private String wchat;

    @ApiModelProperty(value = "内部即时通")
    private String innerMsn;

    @ApiModelProperty(value = "地址")
    private String addr;

    @ApiModelProperty(value = "邮编")
    private String postCode;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "创建人id")
    private String createPersonId;

    @ApiModelProperty(value = "创建人名称")
    private String createPerson;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkNum() {
        return workNum;
    }

    public void setWorkNum(String workNum) {
        this.workNum = workNum;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getMovePhone() {
        return movePhone;
    }

    public void setMovePhone(String movePhone) {
        this.movePhone = movePhone;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWchat() {
        return wchat;
    }

    public void setWchat(String wchat) {
        this.wchat = wchat;
    }

    public String getInnerMsn() {
        return innerMsn;
    }

    public void setInnerMsn(String innerMsn) {
        this.innerMsn = innerMsn;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreatePersonId() {
        return createPersonId;
    }

    public void setCreatePersonId(String createPersonId) {
        this.createPersonId = createPersonId;
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
        return "TblEmployeeContact{" +
        "id=" + id +
        ", orderId=" + orderId +
        ", categoryName=" + categoryName +
        ", categoryId=" + categoryId +
        ", name=" + name +
        ", workNum=" + workNum +
        ", dept=" + dept +
        ", role=" + role +
        ", position=" + position +
        ", gender=" + gender +
        ", birthday=" + birthday +
        ", officePhone=" + officePhone +
        ", fax=" + fax +
        ", movePhone=" + movePhone +
        ", homePhone=" + homePhone +
        ", email=" + email +
        ", qq=" + qq +
        ", wchat=" + wchat +
        ", innerMsn=" + innerMsn +
        ", addr=" + addr +
        ", postCode=" + postCode +
        ", remark=" + remark +
        ", createPersonId=" + createPersonId +
        ", createPerson=" + createPerson +
        ", createDate=" + createDate +
        "}";
    }
}
