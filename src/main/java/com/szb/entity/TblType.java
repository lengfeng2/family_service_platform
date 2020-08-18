package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 类型库
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="TblType对象", description="类型库")
public class TblType implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "类型编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "类型名称")
    private String typeName;

    @ApiModelProperty(value = "状态")
    private String typeStatus;

    @ApiModelProperty(value = "所属产品")
    private String belongProduct;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeStatus() {
        return typeStatus;
    }

    public void setTypeStatus(String typeStatus) {
        this.typeStatus = typeStatus;
    }

    public String getBelongProduct() {
        return belongProduct;
    }

    public void setBelongProduct(String belongProduct) {
        this.belongProduct = belongProduct;
    }

    @Override
    public String toString() {
        return "TblType{" +
        "id=" + id +
        ", typeName=" + typeName +
        ", typeStatus=" + typeStatus +
        ", belongProduct=" + belongProduct +
        "}";
    }
}
