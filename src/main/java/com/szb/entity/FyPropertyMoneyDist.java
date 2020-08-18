package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 物业费分布
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="FyPropertyMoneyDist对象", description="物业费分布")
public class FyPropertyMoneyDist implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自动编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "房间编号")
    private Integer cellId;

    @ApiModelProperty(value = "费项编号")
    private Integer moneyId;

    @ApiModelProperty(value = "是否共有费用")
    private String isPublicMoney;

    @ApiModelProperty(value = "当前读数")
    private Double currentReadNumber;

    @ApiModelProperty(value = "上次计费单位")
    private Double lastChargeUnit;

    @ApiModelProperty(value = "楼层系数")
    private Double floorFactor;

    @ApiModelProperty(value = "使用量倍数")
    private Integer useNumberMult;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCellId() {
        return cellId;
    }

    public void setCellId(Integer cellId) {
        this.cellId = cellId;
    }

    public Integer getMoneyId() {
        return moneyId;
    }

    public void setMoneyId(Integer moneyId) {
        this.moneyId = moneyId;
    }

    public String getIsPublicMoney() {
        return isPublicMoney;
    }

    public void setIsPublicMoney(String isPublicMoney) {
        this.isPublicMoney = isPublicMoney;
    }

    public Double getCurrentReadNumber() {
        return currentReadNumber;
    }

    public void setCurrentReadNumber(Double currentReadNumber) {
        this.currentReadNumber = currentReadNumber;
    }

    public Double getLastChargeUnit() {
        return lastChargeUnit;
    }

    public void setLastChargeUnit(Double lastChargeUnit) {
        this.lastChargeUnit = lastChargeUnit;
    }

    public Double getFloorFactor() {
        return floorFactor;
    }

    public void setFloorFactor(Double floorFactor) {
        this.floorFactor = floorFactor;
    }

    public Integer getUseNumberMult() {
        return useNumberMult;
    }

    public void setUseNumberMult(Integer useNumberMult) {
        this.useNumberMult = useNumberMult;
    }

    @Override
    public String toString() {
        return "FyPropertyMoneyDist{" +
        "id=" + id +
        ", cellId=" + cellId +
        ", moneyId=" + moneyId +
        ", isPublicMoney=" + isPublicMoney +
        ", currentReadNumber=" + currentReadNumber +
        ", lastChargeUnit=" + lastChargeUnit +
        ", floorFactor=" + floorFactor +
        ", useNumberMult=" + useNumberMult +
        "}";
    }
}
