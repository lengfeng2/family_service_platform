package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 桌面
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="TblDesktop对象", description="桌面")
public class TblDesktop implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "编码")
    private String id;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "更多地址")
    private String morePath;

    @ApiModelProperty(value = "权限")
    private String privileges;

    @ApiModelProperty(value = "状态")
    private String status;

    @ApiModelProperty(value = "所属产品")
    private String belongProduct;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBelongProduct() {
        return belongProduct;
    }

    public void setBelongProduct(String belongProduct) {
        this.belongProduct = belongProduct;
    }

    @Override
    public String toString() {
        return "TblDesktop{" +
        "id=" + id +
        ", name=" + name +
        ", morePath=" + morePath +
        ", privileges=" + privileges +
        ", status=" + status +
        ", belongProduct=" + belongProduct +
        "}";
    }
}
