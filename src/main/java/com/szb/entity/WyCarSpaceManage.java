package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 车位管理
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="WyCarSpaceManage对象", description="车位管理")
public class WyCarSpaceManage implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "车位编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "车位类型")
    private Long carSpaceType;

    @ApiModelProperty(value = "车牌号码")
    private String carLicenceId;

    @ApiModelProperty(value = "预售价格")
    private Double preSalePrice;

    @ApiModelProperty(value = "预租价格")
    private Double preRentPrice;

    @ApiModelProperty(value = "停车证号")
    private String stopCarLicence;

    @ApiModelProperty(value = "所属楼盘id")
    private Integer estateId;

    @ApiModelProperty(value = "管理类别")
    private String manageType;

    @ApiModelProperty(value = "车位位置")
    private String carSapcePosition;

    @ApiModelProperty(value = "车位面积")
    private Double carSapceArea;

    @ApiModelProperty(value = "产权人id")
    private Integer ownerId;

    @ApiModelProperty(value = "产权人名称")
    private String ownerName;

    @ApiModelProperty(value = "实售价格")
    private Double realSalePrice;

    @ApiModelProperty(value = "车位类别")
    private String carSpaceCategory;

    @ApiModelProperty(value = "当前状态")
    private String status;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "创建人")
    private String createPerson;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "修改人")
    private String updatePerson;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateDate;

    @ApiModelProperty(value = "销售人")
    private String salePerson;

    @ApiModelProperty(value = "销售时间")
    private LocalDateTime saleDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getCarSpaceType() {
        return carSpaceType;
    }

    public void setCarSpaceType(Long carSpaceType) {
        this.carSpaceType = carSpaceType;
    }

    public String getCarLicenceId() {
        return carLicenceId;
    }

    public void setCarLicenceId(String carLicenceId) {
        this.carLicenceId = carLicenceId;
    }

    public Double getPreSalePrice() {
        return preSalePrice;
    }

    public void setPreSalePrice(Double preSalePrice) {
        this.preSalePrice = preSalePrice;
    }

    public Double getPreRentPrice() {
        return preRentPrice;
    }

    public void setPreRentPrice(Double preRentPrice) {
        this.preRentPrice = preRentPrice;
    }

    public String getStopCarLicence() {
        return stopCarLicence;
    }

    public void setStopCarLicence(String stopCarLicence) {
        this.stopCarLicence = stopCarLicence;
    }

    public Integer getEstateId() {
        return estateId;
    }

    public void setEstateId(Integer estateId) {
        this.estateId = estateId;
    }

    public String getManageType() {
        return manageType;
    }

    public void setManageType(String manageType) {
        this.manageType = manageType;
    }

    public String getCarSapcePosition() {
        return carSapcePosition;
    }

    public void setCarSapcePosition(String carSapcePosition) {
        this.carSapcePosition = carSapcePosition;
    }

    public Double getCarSapceArea() {
        return carSapceArea;
    }

    public void setCarSapceArea(Double carSapceArea) {
        this.carSapceArea = carSapceArea;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Double getRealSalePrice() {
        return realSalePrice;
    }

    public void setRealSalePrice(Double realSalePrice) {
        this.realSalePrice = realSalePrice;
    }

    public String getCarSpaceCategory() {
        return carSpaceCategory;
    }

    public void setCarSpaceCategory(String carSpaceCategory) {
        this.carSpaceCategory = carSpaceCategory;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreatePerson() {
        return createPerson;
    }

    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public String getUpdatePerson() {
        return updatePerson;
    }

    public void setUpdatePerson(String updatePerson) {
        this.updatePerson = updatePerson;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public String getSalePerson() {
        return salePerson;
    }

    public void setSalePerson(String salePerson) {
        this.salePerson = salePerson;
    }

    public LocalDateTime getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(LocalDateTime saleDate) {
        this.saleDate = saleDate;
    }

    @Override
    public String toString() {
        return "WyCarSpaceManage{" +
        "id=" + id +
        ", carSpaceType=" + carSpaceType +
        ", carLicenceId=" + carLicenceId +
        ", preSalePrice=" + preSalePrice +
        ", preRentPrice=" + preRentPrice +
        ", stopCarLicence=" + stopCarLicence +
        ", estateId=" + estateId +
        ", manageType=" + manageType +
        ", carSapcePosition=" + carSapcePosition +
        ", carSapceArea=" + carSapceArea +
        ", ownerId=" + ownerId +
        ", ownerName=" + ownerName +
        ", realSalePrice=" + realSalePrice +
        ", carSpaceCategory=" + carSpaceCategory +
        ", status=" + status +
        ", remark=" + remark +
        ", createPerson=" + createPerson +
        ", createDate=" + createDate +
        ", updatePerson=" + updatePerson +
        ", updateDate=" + updateDate +
        ", salePerson=" + salePerson +
        ", saleDate=" + saleDate +
        "}";
    }
}
