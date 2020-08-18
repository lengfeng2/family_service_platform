package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 公表信息
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="FyPublicBox对象", description="公表信息")
public class FyPublicBox implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "公表编号")
    private String publicBoxId;

    @ApiModelProperty(value = "所属费项")
    private Integer moneyId;

    @ApiModelProperty(value = "公表读数")
    private Double publicBoxReadNumber;

    @ApiModelProperty(value = "分摊方法")
    private String shareMethod;

    @ApiModelProperty(value = "公表状态")
    private String publicBoxState;


    public String getPublicBoxId() {
        return publicBoxId;
    }

    public void setPublicBoxId(String publicBoxId) {
        this.publicBoxId = publicBoxId;
    }

    public Integer getMoneyId() {
        return moneyId;
    }

    public void setMoneyId(Integer moneyId) {
        this.moneyId = moneyId;
    }

    public Double getPublicBoxReadNumber() {
        return publicBoxReadNumber;
    }

    public void setPublicBoxReadNumber(Double publicBoxReadNumber) {
        this.publicBoxReadNumber = publicBoxReadNumber;
    }

    public String getShareMethod() {
        return shareMethod;
    }

    public void setShareMethod(String shareMethod) {
        this.shareMethod = shareMethod;
    }

    public String getPublicBoxState() {
        return publicBoxState;
    }

    public void setPublicBoxState(String publicBoxState) {
        this.publicBoxState = publicBoxState;
    }

    @Override
    public String toString() {
        return "FyPublicBox{" +
        "publicBoxId=" + publicBoxId +
        ", moneyId=" + moneyId +
        ", publicBoxReadNumber=" + publicBoxReadNumber +
        ", shareMethod=" + shareMethod +
        ", publicBoxState=" + publicBoxState +
        "}";
    }
}
