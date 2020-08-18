package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 自定义类型
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="TblCustomType对象", description="自定义类型")
public class TblCustomType implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "类型编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "类型名称")
    private String name;

    @ApiModelProperty(value = "类型状态")
    private String status;

    @ApiModelProperty(value = "类型分类")
    private String category;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "TblCustomType{" +
        "id=" + id +
        ", name=" + name +
        ", status=" + status +
        ", category=" + category +
        "}";
    }
}
