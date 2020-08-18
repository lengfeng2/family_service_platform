package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 单元信息表
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="FcUnit对象", description="单元信息表")
public class FcUnit implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自动编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "楼宇编号")
    private String buildingCode;

    @ApiModelProperty(value = "单元编码")
    private String unitCode;

    @ApiModelProperty(value = "单元名称")
    private String unitName;

    @ApiModelProperty(value = "开始楼层")
    private Integer startFloor;

    @ApiModelProperty(value = "结束楼层")
    private Integer stopFloor;

    @ApiModelProperty(value = "开始房号")
    private Integer startCellId;

    @ApiModelProperty(value = "结束房号")
    private Integer stopCellId;

    @ApiModelProperty(value = "备注")
    private String remark;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBuildingCode() {
        return buildingCode;
    }

    public void setBuildingCode(String buildingCode) {
        this.buildingCode = buildingCode;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public Integer getStartFloor() {
        return startFloor;
    }

    public void setStartFloor(Integer startFloor) {
        this.startFloor = startFloor;
    }

    public Integer getStopFloor() {
        return stopFloor;
    }

    public void setStopFloor(Integer stopFloor) {
        this.stopFloor = stopFloor;
    }

    public Integer getStartCellId() {
        return startCellId;
    }

    public void setStartCellId(Integer startCellId) {
        this.startCellId = startCellId;
    }

    public Integer getStopCellId() {
        return stopCellId;
    }

    public void setStopCellId(Integer stopCellId) {
        this.stopCellId = stopCellId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "FcUnit{" +
        "id=" + id +
        ", buildingCode=" + buildingCode +
        ", unitCode=" + unitCode +
        ", unitName=" + unitName +
        ", startFloor=" + startFloor +
        ", stopFloor=" + stopFloor +
        ", startCellId=" + startCellId +
        ", stopCellId=" + stopCellId +
        ", remark=" + remark +
        "}";
    }
}
