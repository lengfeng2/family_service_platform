package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 环境配置
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="TblEnvirSetting对象", description="环境配置")
public class TblEnvirSetting implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "序号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "logo图片名称")
    private String logoName;

    @ApiModelProperty(value = "产品名称")
    private String productName;

    @ApiModelProperty(value = "版本号")
    private String version;

    @ApiModelProperty(value = "当前版本标识")
    private String currentVersion;

    @ApiModelProperty(value = "类型")
    private String type;

    @ApiModelProperty(value = "是否主系统")
    private String isMain;

    @ApiModelProperty(value = "自定义文本一")
    private String customTextOne;

    @ApiModelProperty(value = "自定义文本二")
    private String customTextTwo;

    @ApiModelProperty(value = "自定义文本三")
    private String customTextThree;

    @ApiModelProperty(value = "自定义文本四")
    private String customTextFour;

    @ApiModelProperty(value = "设置时间")
    private LocalDateTime setTime;

    @ApiModelProperty(value = "产品代码")
    private String productId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogoName() {
        return logoName;
    }

    public void setLogoName(String logoName) {
        this.logoName = logoName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getCurrentVersion() {
        return currentVersion;
    }

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIsMain() {
        return isMain;
    }

    public void setIsMain(String isMain) {
        this.isMain = isMain;
    }

    public String getCustomTextOne() {
        return customTextOne;
    }

    public void setCustomTextOne(String customTextOne) {
        this.customTextOne = customTextOne;
    }

    public String getCustomTextTwo() {
        return customTextTwo;
    }

    public void setCustomTextTwo(String customTextTwo) {
        this.customTextTwo = customTextTwo;
    }

    public String getCustomTextThree() {
        return customTextThree;
    }

    public void setCustomTextThree(String customTextThree) {
        this.customTextThree = customTextThree;
    }

    public String getCustomTextFour() {
        return customTextFour;
    }

    public void setCustomTextFour(String customTextFour) {
        this.customTextFour = customTextFour;
    }

    public LocalDateTime getSetTime() {
        return setTime;
    }

    public void setSetTime(LocalDateTime setTime) {
        this.setTime = setTime;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "TblEnvirSetting{" +
        "id=" + id +
        ", logoName=" + logoName +
        ", productName=" + productName +
        ", version=" + version +
        ", currentVersion=" + currentVersion +
        ", type=" + type +
        ", isMain=" + isMain +
        ", customTextOne=" + customTextOne +
        ", customTextTwo=" + customTextTwo +
        ", customTextThree=" + customTextThree +
        ", customTextFour=" + customTextFour +
        ", setTime=" + setTime +
        ", productId=" + productId +
        "}";
    }
}
