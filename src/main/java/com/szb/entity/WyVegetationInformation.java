package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 植被信息
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="WyVegetationInformation对象", description="植被信息")
public class WyVegetationInformation implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "植被编号")
    @TableId(value = "vegetation_id", type = IdType.AUTO)
    private String vegetationId;

    @ApiModelProperty(value = "植被名称")
    private String vegetationName;

    @ApiModelProperty(value = "种类")
    private String vegetationType;

    @ApiModelProperty(value = "树龄")
    private Integer vegetationAge;

    @ApiModelProperty(value = "数量")
    private Integer vegetationNumber;

    @ApiModelProperty(value = "单位")
    private String vegetationUnit;

    @ApiModelProperty(value = "习性")
    private String vegetationHabit;

    @ApiModelProperty(value = "特点")
    private String vegetationFeature;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "所属公司")
    private String company;


    public String getVegetationId() {
        return vegetationId;
    }

    public void setVegetationId(String vegetationId) {
        this.vegetationId = vegetationId;
    }

    public String getVegetationName() {
        return vegetationName;
    }

    public void setVegetationName(String vegetationName) {
        this.vegetationName = vegetationName;
    }

    public String getVegetationType() {
        return vegetationType;
    }

    public void setVegetationType(String vegetationType) {
        this.vegetationType = vegetationType;
    }

    public Integer getVegetationAge() {
        return vegetationAge;
    }

    public void setVegetationAge(Integer vegetationAge) {
        this.vegetationAge = vegetationAge;
    }

    public Integer getVegetationNumber() {
        return vegetationNumber;
    }

    public void setVegetationNumber(Integer vegetationNumber) {
        this.vegetationNumber = vegetationNumber;
    }

    public String getVegetationUnit() {
        return vegetationUnit;
    }

    public void setVegetationUnit(String vegetationUnit) {
        this.vegetationUnit = vegetationUnit;
    }

    public String getVegetationHabit() {
        return vegetationHabit;
    }

    public void setVegetationHabit(String vegetationHabit) {
        this.vegetationHabit = vegetationHabit;
    }

    public String getVegetationFeature() {
        return vegetationFeature;
    }

    public void setVegetationFeature(String vegetationFeature) {
        this.vegetationFeature = vegetationFeature;
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

    @Override
    public String toString() {
        return "WyVegetationInformation{" +
        "vegetationId=" + vegetationId +
        ", vegetationName=" + vegetationName +
        ", vegetationType=" + vegetationType +
        ", vegetationAge=" + vegetationAge +
        ", vegetationNumber=" + vegetationNumber +
        ", vegetationUnit=" + vegetationUnit +
        ", vegetationHabit=" + vegetationHabit +
        ", vegetationFeature=" + vegetationFeature +
        ", remark=" + remark +
        ", company=" + company +
        "}";
    }
}
