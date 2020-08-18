package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 房间信息表
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="FcCell对象", description="房间信息表")
public class FcCell implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "房间编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "单元编码")
    private Integer unitCode;

    @ApiModelProperty(value = "房间编码")
    private String cellCode;

    @ApiModelProperty(value = "房间名称")
    private String cellName;

    @ApiModelProperty(value = "户型编码")
    private String cellHouseCode;

    @ApiModelProperty(value = "朝向编码")
    private String cellTowardCode;

    @ApiModelProperty(value = " 功能")
    private String cellFunction;

    @ApiModelProperty(value = "装修编码")
    private String cellDecorateCode;

    @ApiModelProperty(value = "使用面积")
    private Double cellUsedArea;

    @ApiModelProperty(value = "建筑面积")
    private Double cellBuildArea;

    @ApiModelProperty(value = "车库面积")
    private Double carportArea;

    @ApiModelProperty(value = "车位面积")
    private Double carArea;

    @ApiModelProperty(value = "阁楼面积")
    private Double loftArea;

    @ApiModelProperty(value = "储藏室面积")
    private Double storeArea;

    @ApiModelProperty(value = "楼层数")
    private Integer floorNumber;

    @ApiModelProperty(value = "上次欠缴")
    private Double lastDebt;

    @ApiModelProperty(value = "物业类型")
    private Long propertyType;

    @ApiModelProperty(value = "租金")
    private Double rentMoney;

    @ApiModelProperty(value = "长度")
    private Double length;

    @ApiModelProperty(value = "宽度")
    private Double width;

    @ApiModelProperty(value = "档口用途")
    private Long stallUse;

    @ApiModelProperty(value = "档口区域")
    private Long stallArea;

    @ApiModelProperty(value = "是否已售")
    private String isSale;

    @ApiModelProperty(value = "是否已租")
    private String isRent;

    @ApiModelProperty(value = "销售合同编号")
    private String saleContractId;

    @ApiModelProperty(value = "租赁合同编号")
    private String rentContractId;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "系数")
    private String factor;

    @ApiModelProperty(value = "房间性质")
    private Integer cellProperty;

    @ApiModelProperty(value = "储藏室号")
    private String storeId;

    @ApiModelProperty(value = "车牌号")
    private String carLicenceId;

    @ApiModelProperty(value = "车位号")
    private String carSpaceId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(Integer unitCode) {
        this.unitCode = unitCode;
    }

    public String getCellCode() {
        return cellCode;
    }

    public void setCellCode(String cellCode) {
        this.cellCode = cellCode;
    }

    public String getCellName() {
        return cellName;
    }

    public void setCellName(String cellName) {
        this.cellName = cellName;
    }

    public String getCellHouseCode() {
        return cellHouseCode;
    }

    public void setCellHouseCode(String cellHouseCode) {
        this.cellHouseCode = cellHouseCode;
    }

    public String getCellTowardCode() {
        return cellTowardCode;
    }

    public void setCellTowardCode(String cellTowardCode) {
        this.cellTowardCode = cellTowardCode;
    }

    public String getCellFunction() {
        return cellFunction;
    }

    public void setCellFunction(String cellFunction) {
        this.cellFunction = cellFunction;
    }

    public String getCellDecorateCode() {
        return cellDecorateCode;
    }

    public void setCellDecorateCode(String cellDecorateCode) {
        this.cellDecorateCode = cellDecorateCode;
    }

    public Double getCellUsedArea() {
        return cellUsedArea;
    }

    public void setCellUsedArea(Double cellUsedArea) {
        this.cellUsedArea = cellUsedArea;
    }

    public Double getCellBuildArea() {
        return cellBuildArea;
    }

    public void setCellBuildArea(Double cellBuildArea) {
        this.cellBuildArea = cellBuildArea;
    }

    public Double getCarportArea() {
        return carportArea;
    }

    public void setCarportArea(Double carportArea) {
        this.carportArea = carportArea;
    }

    public Double getCarArea() {
        return carArea;
    }

    public void setCarArea(Double carArea) {
        this.carArea = carArea;
    }

    public Double getLoftArea() {
        return loftArea;
    }

    public void setLoftArea(Double loftArea) {
        this.loftArea = loftArea;
    }

    public Double getStoreArea() {
        return storeArea;
    }

    public void setStoreArea(Double storeArea) {
        this.storeArea = storeArea;
    }

    public Integer getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(Integer floorNumber) {
        this.floorNumber = floorNumber;
    }

    public Double getLastDebt() {
        return lastDebt;
    }

    public void setLastDebt(Double lastDebt) {
        this.lastDebt = lastDebt;
    }

    public Long getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(Long propertyType) {
        this.propertyType = propertyType;
    }

    public Double getRentMoney() {
        return rentMoney;
    }

    public void setRentMoney(Double rentMoney) {
        this.rentMoney = rentMoney;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Long getStallUse() {
        return stallUse;
    }

    public void setStallUse(Long stallUse) {
        this.stallUse = stallUse;
    }

    public Long getStallArea() {
        return stallArea;
    }

    public void setStallArea(Long stallArea) {
        this.stallArea = stallArea;
    }

    public String getIsSale() {
        return isSale;
    }

    public void setIsSale(String isSale) {
        this.isSale = isSale;
    }

    public String getIsRent() {
        return isRent;
    }

    public void setIsRent(String isRent) {
        this.isRent = isRent;
    }

    public String getSaleContractId() {
        return saleContractId;
    }

    public void setSaleContractId(String saleContractId) {
        this.saleContractId = saleContractId;
    }

    public String getRentContractId() {
        return rentContractId;
    }

    public void setRentContractId(String rentContractId) {
        this.rentContractId = rentContractId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getFactor() {
        return factor;
    }

    public void setFactor(String factor) {
        this.factor = factor;
    }

    public Integer getCellProperty() {
        return cellProperty;
    }

    public void setCellProperty(Integer cellProperty) {
        this.cellProperty = cellProperty;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getCarLicenceId() {
        return carLicenceId;
    }

    public void setCarLicenceId(String carLicenceId) {
        this.carLicenceId = carLicenceId;
    }

    public String getCarSpaceId() {
        return carSpaceId;
    }

    public void setCarSpaceId(String carSpaceId) {
        this.carSpaceId = carSpaceId;
    }

    @Override
    public String toString() {
        return "FcCell{" +
        "id=" + id +
        ", unitCode=" + unitCode +
        ", cellCode=" + cellCode +
        ", cellName=" + cellName +
        ", cellHouseCode=" + cellHouseCode +
        ", cellTowardCode=" + cellTowardCode +
        ", cellFunction=" + cellFunction +
        ", cellDecorateCode=" + cellDecorateCode +
        ", cellUsedArea=" + cellUsedArea +
        ", cellBuildArea=" + cellBuildArea +
        ", carportArea=" + carportArea +
        ", carArea=" + carArea +
        ", loftArea=" + loftArea +
        ", storeArea=" + storeArea +
        ", floorNumber=" + floorNumber +
        ", lastDebt=" + lastDebt +
        ", propertyType=" + propertyType +
        ", rentMoney=" + rentMoney +
        ", length=" + length +
        ", width=" + width +
        ", stallUse=" + stallUse +
        ", stallArea=" + stallArea +
        ", isSale=" + isSale +
        ", isRent=" + isRent +
        ", saleContractId=" + saleContractId +
        ", rentContractId=" + rentContractId +
        ", remark=" + remark +
        ", factor=" + factor +
        ", cellProperty=" + cellProperty +
        ", storeId=" + storeId +
        ", carLicenceId=" + carLicenceId +
        ", carSpaceId=" + carSpaceId +
        "}";
    }
}
