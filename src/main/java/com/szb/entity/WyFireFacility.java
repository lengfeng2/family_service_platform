package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 消防设施
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="WyFireFacility对象", description="消防设施")
public class WyFireFacility implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自动编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "设施名称")
    private String facilityName;

    @ApiModelProperty(value = "规格型号")
    private String specifications;

    @ApiModelProperty(value = "单位")
    private String unit;

    @ApiModelProperty(value = "数量")
    private Integer number;

    @ApiModelProperty(value = "放置地点")
    private String place;

    @ApiModelProperty(value = "负责人")
    private String leader;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "所属公司")
    private String company;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
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
        return "WyFireFacility{" +
        "id=" + id +
        ", facilityName=" + facilityName +
        ", specifications=" + specifications +
        ", unit=" + unit +
        ", number=" + number +
        ", place=" + place +
        ", leader=" + leader +
        ", remark=" + remark +
        ", company=" + company +
        "}";
    }
}
