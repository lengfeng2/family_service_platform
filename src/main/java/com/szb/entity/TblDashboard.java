package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 仪表盘
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="TblDashboard对象", description="仪表盘")
public class TblDashboard implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "数据项")
    private String dataItem;

    @ApiModelProperty(value = "更多地址")
    private String morePath;

    @ApiModelProperty(value = "权限")
    private String privileges;

    @ApiModelProperty(value = "状态")
    @TableField("Status")
    private String Status;

    @ApiModelProperty(value = "所属产品")
    private String belongProduct;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDataItem() {
        return dataItem;
    }

    public void setDataItem(String dataItem) {
        this.dataItem = dataItem;
    }

    public String getMorePath() {
        return morePath;
    }

    public void setMorePath(String morePath) {
        this.morePath = morePath;
    }

    public String getPrivileges() {
        return privileges;
    }

    public void setPrivileges(String privileges) {
        this.privileges = privileges;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getBelongProduct() {
        return belongProduct;
    }

    public void setBelongProduct(String belongProduct) {
        this.belongProduct = belongProduct;
    }

    @Override
    public String toString() {
        return "TblDashboard{" +
        "id=" + id +
        ", dataItem=" + dataItem +
        ", morePath=" + morePath +
        ", privileges=" + privileges +
        ", Status=" + Status +
        ", belongProduct=" + belongProduct +
        "}";
    }
}
