package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 角色档案
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="TblRole对象", description="角色档案")
public class TblRole implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "角色编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "角色名称")
    private String roleName;

    @ApiModelProperty(value = "角色类型")
    private String roleType;

    @ApiModelProperty(value = "操作权限")
    private String rolePrivileges;

    @ApiModelProperty(value = "角色备注")
    private String roleRemark;

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

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public String getRolePrivileges() {
        return rolePrivileges;
    }

    public void setRolePrivileges(String rolePrivileges) {
        this.rolePrivileges = rolePrivileges;
    }

    public String getRoleRemark() {
        return roleRemark;
    }

    public void setRoleRemark(String roleRemark) {
        this.roleRemark = roleRemark;
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
        return "TblRole{" +
        "id=" + id +
        ", roleName=" + roleName +
        ", roleType=" + roleType +
        ", rolePrivileges=" + rolePrivileges +
        ", roleRemark=" + roleRemark +
        ", createPerson=" + createPerson +
        ", createDate=" + createDate +
        "}";
    }
}
