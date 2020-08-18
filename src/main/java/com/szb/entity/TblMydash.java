package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 我的驾驶舱
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="TblMydash对象", description="我的驾驶舱")
public class TblMydash implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自动编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "所属驾驶舱id")
    private Integer dashId;

    @ApiModelProperty(value = "排序号")
    private Long orderId;

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "显示条数")
    private String showNum;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDashId() {
        return dashId;
    }

    public void setDashId(Integer dashId) {
        this.dashId = dashId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getShowNum() {
        return showNum;
    }

    public void setShowNum(String showNum) {
        this.showNum = showNum;
    }

    @Override
    public String toString() {
        return "TblMydash{" +
        "id=" + id +
        ", dashId=" + dashId +
        ", orderId=" + orderId +
        ", username=" + username +
        ", showNum=" + showNum +
        "}";
    }
}
