package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 我的桌面
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="TblMydesk对象", description="我的桌面")
public class TblMydesk implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自动编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "所属模块")
    private String belongModel;

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

    public String getBelongModel() {
        return belongModel;
    }

    public void setBelongModel(String belongModel) {
        this.belongModel = belongModel;
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
        return "TblMydesk{" +
        "id=" + id +
        ", belongModel=" + belongModel +
        ", orderId=" + orderId +
        ", username=" + username +
        ", showNum=" + showNum +
        "}";
    }
}
