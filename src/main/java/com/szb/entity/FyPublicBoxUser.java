package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 公表关联用户
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="FyPublicBoxUser对象", description="公表关联用户")
public class FyPublicBoxUser implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自动增长id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "表号")
    private String publicBoxId;

    @ApiModelProperty(value = "房间号")
    private Integer cellId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPublicBoxId() {
        return publicBoxId;
    }

    public void setPublicBoxId(String publicBoxId) {
        this.publicBoxId = publicBoxId;
    }

    public Integer getCellId() {
        return cellId;
    }

    public void setCellId(Integer cellId) {
        this.cellId = cellId;
    }

    @Override
    public String toString() {
        return "FyPublicBoxUser{" +
        "id=" + id +
        ", publicBoxId=" + publicBoxId +
        ", cellId=" + cellId +
        "}";
    }
}
