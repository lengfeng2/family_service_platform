package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Size;

/**
 * <p>
 * 楼宇信息表
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value = "FcBuilding对象", description = "楼宇信息表")
public class FcBuilding implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "自动编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "房产编码")
    @Length(min = 1, max = 3, message = "房产编码长度超过限制")
    private String estateCode;

    @ApiModelProperty(value = "楼宇编码")
    private String buildingCode;

    @ApiModelProperty(value = "楼宇名称")
    private String buildingName;

    @ApiModelProperty(value = "楼宇功能")
    private String buildingFunction;

    @ApiModelProperty(value = "使用面积")
    private Double usedArea;

    @ApiModelProperty(value = "建筑面积")
    private Double buildArea;

    @ApiModelProperty(value = "建设许可证号")
    private String buildPermissionId;

    @ApiModelProperty(value = "销售许可证号")
    private String salePermissionId;

    @ApiModelProperty(value = "竣工日期")
    private Date finishDate;

    @ApiModelProperty(value = "封顶日期")
    private Date overRoofDate;

    @ApiModelProperty(value = "装修")
    private String decorate;

    @ApiModelProperty(value = "结构类别")
    private String structType;

    @ApiModelProperty(value = "完损等级")
    private String damageGrade;

    @ApiModelProperty(value = "单元数量")
    private Double unitCount;

    @ApiModelProperty(value = "楼宇类型")
    private String buildingType;

    @ApiModelProperty(value = "清扫层数")
    private Integer cleanFloor;

    @ApiModelProperty(value = "拖洗层数")
    private Integer mopFloor;

    @ApiModelProperty(value = "楼狼通道地面")
    private Double channelArea;

    @ApiModelProperty(value = "电梯轿箱")
    private Integer elevator;

    @ApiModelProperty(value = "通道门")
    private Integer channelDoor;

    @ApiModelProperty(value = "电梯门")
    private Integer evevatorDoor;

    @ApiModelProperty(value = "水井门")
    private Integer waterWellDoor;

    @ApiModelProperty(value = "电井门")
    private Integer electricWellDoor;

    @ApiModelProperty(value = "百叶窗")
    private Integer windowShades;

    @ApiModelProperty(value = "消防栓")
    private Integer hydrant;

    @ApiModelProperty(value = "整容镜")
    private Integer mirrors;

    @ApiModelProperty(value = "单元门")
    private Integer unitDoor;

    @ApiModelProperty(value = "硬化地面")
    private Double hardenGroundArea;

    @ApiModelProperty(value = "提纯绿地")
    private Double greenArea;

    @ApiModelProperty(value = "不提纯绿地")
    private Double noGreenArea;

    @ApiModelProperty(value = "人工水面")
    private Double waterByPerson;

    @ApiModelProperty(value = "是否使用电梯")
    private String isElevator;

    @ApiModelProperty(value = "是否需要二次水电")
    private String isSecondWaterElectric;

    @ApiModelProperty(value = "随机标识码")
    private String randomIdentify;

    @ApiModelProperty(value = "备注")
    private String remark;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEstateCode() {
        return estateCode;
    }

    public void setEstateCode(String estateCode) {
        this.estateCode = estateCode;
    }

    public String getBuildingCode() {
        return buildingCode;
    }

    public void setBuildingCode(String buildingCode) {
        this.buildingCode = buildingCode;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getBuildingFunction() {
        return buildingFunction;
    }

    public void setBuildingFunction(String buildingFunction) {
        this.buildingFunction = buildingFunction;
    }

    public Double getUsedArea() {
        return usedArea;
    }

    public void setUsedArea(Double usedArea) {
        this.usedArea = usedArea;
    }

    public Double getBuildArea() {
        return buildArea;
    }

    public void setBuildArea(Double buildArea) {
        this.buildArea = buildArea;
    }

    public String getBuildPermissionId() {
        return buildPermissionId;
    }

    public void setBuildPermissionId(String buildPermissionId) {
        this.buildPermissionId = buildPermissionId;
    }

    public String getSalePermissionId() {
        return salePermissionId;
    }

    public void setSalePermissionId(String salePermissionId) {
        this.salePermissionId = salePermissionId;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public Date getOverRoofDate() {
        return overRoofDate;
    }

    public void setOverRoofDate(Date overRoofDate) {
        this.overRoofDate = overRoofDate;
    }

    public String getDecorate() {
        return decorate;
    }

    public void setDecorate(String decorate) {
        this.decorate = decorate;
    }

    public String getStructType() {
        return structType;
    }

    public void setStructType(String structType) {
        this.structType = structType;
    }

    public String getDamageGrade() {
        return damageGrade;
    }

    public void setDamageGrade(String damageGrade) {
        this.damageGrade = damageGrade;
    }

    public Double getUnitCount() {
        return unitCount;
    }

    public void setUnitCount(Double unitCount) {
        this.unitCount = unitCount;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public Integer getCleanFloor() {
        return cleanFloor;
    }

    public void setCleanFloor(Integer cleanFloor) {
        this.cleanFloor = cleanFloor;
    }

    public Integer getMopFloor() {
        return mopFloor;
    }

    public void setMopFloor(Integer mopFloor) {
        this.mopFloor = mopFloor;
    }

    public Double getChannelArea() {
        return channelArea;
    }

    public void setChannelArea(Double channelArea) {
        this.channelArea = channelArea;
    }

    public Integer getElevator() {
        return elevator;
    }

    public void setElevator(Integer elevator) {
        this.elevator = elevator;
    }

    public Integer getChannelDoor() {
        return channelDoor;
    }

    public void setChannelDoor(Integer channelDoor) {
        this.channelDoor = channelDoor;
    }

    public Integer getEvevatorDoor() {
        return evevatorDoor;
    }

    public void setEvevatorDoor(Integer evevatorDoor) {
        this.evevatorDoor = evevatorDoor;
    }

    public Integer getWaterWellDoor() {
        return waterWellDoor;
    }

    public void setWaterWellDoor(Integer waterWellDoor) {
        this.waterWellDoor = waterWellDoor;
    }

    public Integer getElectricWellDoor() {
        return electricWellDoor;
    }

    public void setElectricWellDoor(Integer electricWellDoor) {
        this.electricWellDoor = electricWellDoor;
    }

    public Integer getWindowShades() {
        return windowShades;
    }

    public void setWindowShades(Integer windowShades) {
        this.windowShades = windowShades;
    }

    public Integer getHydrant() {
        return hydrant;
    }

    public void setHydrant(Integer hydrant) {
        this.hydrant = hydrant;
    }

    public Integer getMirrors() {
        return mirrors;
    }

    public void setMirrors(Integer mirrors) {
        this.mirrors = mirrors;
    }

    public Integer getUnitDoor() {
        return unitDoor;
    }

    public void setUnitDoor(Integer unitDoor) {
        this.unitDoor = unitDoor;
    }

    public Double getHardenGroundArea() {
        return hardenGroundArea;
    }

    public void setHardenGroundArea(Double hardenGroundArea) {
        this.hardenGroundArea = hardenGroundArea;
    }

    public Double getGreenArea() {
        return greenArea;
    }

    public void setGreenArea(Double greenArea) {
        this.greenArea = greenArea;
    }

    public Double getNoGreenArea() {
        return noGreenArea;
    }

    public void setNoGreenArea(Double noGreenArea) {
        this.noGreenArea = noGreenArea;
    }

    public Double getWaterByPerson() {
        return waterByPerson;
    }

    public void setWaterByPerson(Double waterByPerson) {
        this.waterByPerson = waterByPerson;
    }

    public String getIsElevator() {
        return isElevator;
    }

    public void setIsElevator(String isElevator) {
        this.isElevator = isElevator;
    }

    public String getIsSecondWaterElectric() {
        return isSecondWaterElectric;
    }

    public void setIsSecondWaterElectric(String isSecondWaterElectric) {
        this.isSecondWaterElectric = isSecondWaterElectric;
    }

    public String getRandomIdentify() {
        return randomIdentify;
    }

    public void setRandomIdentify(String randomIdentify) {
        this.randomIdentify = randomIdentify;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "FcBuilding{" +
                "id=" + id +
                ", estateCode=" + estateCode +
                ", buildingCode=" + buildingCode +
                ", buildingName=" + buildingName +
                ", buildingFunction=" + buildingFunction +
                ", usedArea=" + usedArea +
                ", buildArea=" + buildArea +
                ", buildPermissionId=" + buildPermissionId +
                ", salePermissionId=" + salePermissionId +
                ", finishDate=" + finishDate +
                ", overRoofDate=" + overRoofDate +
                ", decorate=" + decorate +
                ", structType=" + structType +
                ", damageGrade=" + damageGrade +
                ", unitCount=" + unitCount +
                ", buildingType=" + buildingType +
                ", cleanFloor=" + cleanFloor +
                ", mopFloor=" + mopFloor +
                ", channelArea=" + channelArea +
                ", elevator=" + elevator +
                ", channelDoor=" + channelDoor +
                ", evevatorDoor=" + evevatorDoor +
                ", waterWellDoor=" + waterWellDoor +
                ", electricWellDoor=" + electricWellDoor +
                ", windowShades=" + windowShades +
                ", hydrant=" + hydrant +
                ", mirrors=" + mirrors +
                ", unitDoor=" + unitDoor +
                ", hardenGroundArea=" + hardenGroundArea +
                ", greenArea=" + greenArea +
                ", noGreenArea=" + noGreenArea +
                ", waterByPerson=" + waterByPerson +
                ", isElevator=" + isElevator +
                ", isSecondWaterElectric=" + isSecondWaterElectric +
                ", randomIdentify=" + randomIdentify +
                ", remark=" + remark +
                "}";
    }
}
