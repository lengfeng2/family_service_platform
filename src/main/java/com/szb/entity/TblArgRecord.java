package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 参数档案
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="TblArgRecord对象", description="参数档案")
public class TblArgRecord implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "参数编码")
    @TableId(value = "arg_code", type = IdType.AUTO)
    private String argCode;

    @ApiModelProperty(value = "参数名称")
    private String argName;

    @ApiModelProperty(value = "参数值")
    private String argValue;

    @ApiModelProperty(value = "说明")
    private String argDesc;

    @ApiModelProperty(value = "排序号")
    private Integer argOrder;

    @ApiModelProperty(value = "所属产品")
    private String belongProduct;


    public String getArgCode() {
        return argCode;
    }

    public void setArgCode(String argCode) {
        this.argCode = argCode;
    }

    public String getArgName() {
        return argName;
    }

    public void setArgName(String argName) {
        this.argName = argName;
    }

    public String getArgValue() {
        return argValue;
    }

    public void setArgValue(String argValue) {
        this.argValue = argValue;
    }

    public String getArgDesc() {
        return argDesc;
    }

    public void setArgDesc(String argDesc) {
        this.argDesc = argDesc;
    }

    public Integer getArgOrder() {
        return argOrder;
    }

    public void setArgOrder(Integer argOrder) {
        this.argOrder = argOrder;
    }

    public String getBelongProduct() {
        return belongProduct;
    }

    public void setBelongProduct(String belongProduct) {
        this.belongProduct = belongProduct;
    }

    @Override
    public String toString() {
        return "TblArgRecord{" +
        "argCode=" + argCode +
        ", argName=" + argName +
        ", argValue=" + argValue +
        ", argDesc=" + argDesc +
        ", argOrder=" + argOrder +
        ", belongProduct=" + belongProduct +
        "}";
    }
}
