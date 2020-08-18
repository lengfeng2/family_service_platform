package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 绿化设置
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="WyGreenSetting对象", description="绿化设置")
public class WyGreenSetting implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "设置编码")
    private String settingCode;

    @ApiModelProperty(value = "设置名称")
    private String settingName;

    @ApiModelProperty(value = "面积")
    private Double area;

    @ApiModelProperty(value = "绿化时间")
    private LocalDateTime greenDate;

    @ApiModelProperty(value = "地点")
    private String greenPlace;

    @ApiModelProperty(value = "责任人")
    private String leader;

    @ApiModelProperty(value = "主要植被")
    private String mainVegetation;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "所属公司")
    private String company;


    public String getSettingCode() {
        return settingCode;
    }

    public void setSettingCode(String settingCode) {
        this.settingCode = settingCode;
    }

    public String getSettingName() {
        return settingName;
    }

    public void setSettingName(String settingName) {
        this.settingName = settingName;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public LocalDateTime getGreenDate() {
        return greenDate;
    }

    public void setGreenDate(LocalDateTime greenDate) {
        this.greenDate = greenDate;
    }

    public String getGreenPlace() {
        return greenPlace;
    }

    public void setGreenPlace(String greenPlace) {
        this.greenPlace = greenPlace;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getMainVegetation() {
        return mainVegetation;
    }

    public void setMainVegetation(String mainVegetation) {
        this.mainVegetation = mainVegetation;
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
        return "WyGreenSetting{" +
        "settingCode=" + settingCode +
        ", settingName=" + settingName +
        ", area=" + area +
        ", greenDate=" + greenDate +
        ", greenPlace=" + greenPlace +
        ", leader=" + leader +
        ", mainVegetation=" + mainVegetation +
        ", remark=" + remark +
        ", company=" + company +
        "}";
    }
}
