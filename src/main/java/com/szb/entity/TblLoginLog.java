package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 登录日志
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="TblLoginLog对象", description="登录日志")
public class TblLoginLog implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "登录人员编码")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "登录日期")
    private LocalDateTime loginDate;

    @ApiModelProperty(value = "登录的ip地址")
    private String loginIp;

    @ApiModelProperty(value = "登录状态")
    private String loginStatus;

    @ApiModelProperty(value = "进入模块名称")
    private Long openMk;

    @ApiModelProperty(value = "登录机器名")
    private String loginMechineName;

    @ApiModelProperty(value = "端口号")
    private String loginPort;

    @ApiModelProperty(value = "登录入口")
    private String loginDoor;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(LocalDateTime loginDate) {
        this.loginDate = loginDate;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public String getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(String loginStatus) {
        this.loginStatus = loginStatus;
    }

    public Long getOpenMk() {
        return openMk;
    }

    public void setOpenMk(Long openMk) {
        this.openMk = openMk;
    }

    public String getLoginMechineName() {
        return loginMechineName;
    }

    public void setLoginMechineName(String loginMechineName) {
        this.loginMechineName = loginMechineName;
    }

    public String getLoginPort() {
        return loginPort;
    }

    public void setLoginPort(String loginPort) {
        this.loginPort = loginPort;
    }

    public String getLoginDoor() {
        return loginDoor;
    }

    public void setLoginDoor(String loginDoor) {
        this.loginDoor = loginDoor;
    }

    @Override
    public String toString() {
        return "TblLoginLog{" +
        "id=" + id +
        ", loginDate=" + loginDate +
        ", loginIp=" + loginIp +
        ", loginStatus=" + loginStatus +
        ", openMk=" + openMk +
        ", loginMechineName=" + loginMechineName +
        ", loginPort=" + loginPort +
        ", loginDoor=" + loginDoor +
        "}";
    }
}
