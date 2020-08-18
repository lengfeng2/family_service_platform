package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 用户档案
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="TblUserRecord对象", description="用户档案")
public class TblUserRecord implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "用户编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "用户姓名")
    private String userName;

    @ApiModelProperty(value = "用户密码")
    private String userPassword;

    @ApiModelProperty(value = "用户类型")
    private String userType;

    @ApiModelProperty(value = "岗位角色")
    private Integer userRole;

    @ApiModelProperty(value = "用户性别")
    private String userGender;

    @ApiModelProperty(value = "所属部门")
    private Integer userDept;

    @ApiModelProperty(value = "职位")
    private Integer userJob;

    @ApiModelProperty(value = "用户状态")
    private String userStatus;

    @ApiModelProperty(value = "办公电话")
    private String officePhone;

    @ApiModelProperty(value = "内线电话")
    private String innerPhone;

    @ApiModelProperty(value = "移动电话")
    private String movePhone;

    @ApiModelProperty(value = "电子邮箱")
    private String email;

    @ApiModelProperty(value = "允许发送手机短信")
    private String isSendMsg;

    @ApiModelProperty(value = "有效开始日期")
    private LocalDateTime startDate;

    @ApiModelProperty(value = "有效结束日期")
    private LocalDateTime stopDate;

    @ApiModelProperty(value = "出生日期")
    private LocalDateTime birthday;

    @ApiModelProperty(value = "登陆ip规则")
    private String ipRule;

    @ApiModelProperty(value = "入职日期")
    private LocalDateTime userHiredate;

    @ApiModelProperty(value = "允许发送微信")
    private String isSendWchat;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "所属公司")
    private String company;

    @ApiModelProperty(value = "是否部门管理者")
    private String isDeptAdmin;

    @ApiModelProperty(value = "最后登陆时间")
    private LocalDateTime lastLoginDate;

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Integer getUserRole() {
        return userRole;
    }

    public void setUserRole(Integer userRole) {
        this.userRole = userRole;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public Integer getUserDept() {
        return userDept;
    }

    public void setUserDept(Integer userDept) {
        this.userDept = userDept;
    }

    public Integer getUserJob() {
        return userJob;
    }

    public void setUserJob(Integer userJob) {
        this.userJob = userJob;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    public String getInnerPhone() {
        return innerPhone;
    }

    public void setInnerPhone(String innerPhone) {
        this.innerPhone = innerPhone;
    }

    public String getMovePhone() {
        return movePhone;
    }

    public void setMovePhone(String movePhone) {
        this.movePhone = movePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIsSendMsg() {
        return isSendMsg;
    }

    public void setIsSendMsg(String isSendMsg) {
        this.isSendMsg = isSendMsg;
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

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public String getIpRule() {
        return ipRule;
    }

    public void setIpRule(String ipRule) {
        this.ipRule = ipRule;
    }

    public LocalDateTime getUserHiredate() {
        return userHiredate;
    }

    public void setUserHiredate(LocalDateTime userHiredate) {
        this.userHiredate = userHiredate;
    }

    public String getIsSendWchat() {
        return isSendWchat;
    }

    public void setIsSendWchat(String isSendWchat) {
        this.isSendWchat = isSendWchat;
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

    public String getIsDeptAdmin() {
        return isDeptAdmin;
    }

    public void setIsDeptAdmin(String isDeptAdmin) {
        this.isDeptAdmin = isDeptAdmin;
    }

    public LocalDateTime getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(LocalDateTime lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
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
        return "TblUserRecord{" +
        "id=" + id +
        ", userName=" + userName +
        ", userPassword=" + userPassword +
        ", userType=" + userType +
        ", userRole=" + userRole +
        ", userGender=" + userGender +
        ", userDept=" + userDept +
        ", userJob=" + userJob +
        ", userStatus=" + userStatus +
        ", officePhone=" + officePhone +
        ", innerPhone=" + innerPhone +
        ", movePhone=" + movePhone +
        ", email=" + email +
        ", isSendMsg=" + isSendMsg +
        ", startDate=" + startDate +
        ", stopDate=" + stopDate +
        ", birthday=" + birthday +
        ", ipRule=" + ipRule +
        ", userHiredate=" + userHiredate +
        ", isSendWchat=" + isSendWchat +
        ", remark=" + remark +
        ", company=" + company +
        ", isDeptAdmin=" + isDeptAdmin +
        ", lastLoginDate=" + lastLoginDate +
        ", createPerson=" + createPerson +
        ", createDate=" + createDate +
        "}";
    }
}
