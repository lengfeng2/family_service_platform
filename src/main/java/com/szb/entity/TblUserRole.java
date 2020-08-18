package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 用户角色表
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="TblUserRole对象", description="用户角色表")
public class TblUserRole implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "用户编号")
    private String userId;

    @ApiModelProperty(value = "角色编号")
    private Integer roleId;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "TblUserRole{" +
        "userId=" + userId +
        ", roleId=" + roleId +
        "}";
    }
}
