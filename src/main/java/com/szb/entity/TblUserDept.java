package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 用户部门表
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="TblUserDept对象", description="用户部门表")
public class TblUserDept implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "用户编号")
    private Integer userId;

    @ApiModelProperty(value = "部门编号")
    private Integer deptId;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    @Override
    public String toString() {
        return "TblUserDept{" +
        "userId=" + userId +
        ", deptId=" + deptId +
        "}";
    }
}
