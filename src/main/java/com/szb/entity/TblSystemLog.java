package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 系统日志
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="TblSystemLog对象", description="系统日志")
public class TblSystemLog implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自动编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "日志内容")
    private String logContent;

    @ApiModelProperty(value = "模块编码")
    private String modelId;

    @ApiModelProperty(value = "ip地址")
    private String ipAddr;

    @ApiModelProperty(value = "部门权限")
    private String deptPrivileges;

    @ApiModelProperty(value = "操作人编码")
    private String operateId;

    @ApiModelProperty(value = "操作人名称")
    private String operateName;

    @ApiModelProperty(value = "部门编码")
    private String deptId;

    @ApiModelProperty(value = "部门名称")
    private String deptName;

    @ApiModelProperty(value = "操作时间")
    private LocalDateTime operateDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogContent() {
        return logContent;
    }

    public void setLogContent(String logContent) {
        this.logContent = logContent;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getIpAddr() {
        return ipAddr;
    }

    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
    }

    public String getDeptPrivileges() {
        return deptPrivileges;
    }

    public void setDeptPrivileges(String deptPrivileges) {
        this.deptPrivileges = deptPrivileges;
    }

    public String getOperateId() {
        return operateId;
    }

    public void setOperateId(String operateId) {
        this.operateId = operateId;
    }

    public String getOperateName() {
        return operateName;
    }

    public void setOperateName(String operateName) {
        this.operateName = operateName;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public LocalDateTime getOperateDate() {
        return operateDate;
    }

    public void setOperateDate(LocalDateTime operateDate) {
        this.operateDate = operateDate;
    }

    @Override
    public String toString() {
        return "TblSystemLog{" +
        "id=" + id +
        ", logContent=" + logContent +
        ", modelId=" + modelId +
        ", ipAddr=" + ipAddr +
        ", deptPrivileges=" + deptPrivileges +
        ", operateId=" + operateId +
        ", operateName=" + operateName +
        ", deptId=" + deptId +
        ", deptName=" + deptName +
        ", operateDate=" + operateDate +
        "}";
    }
}
