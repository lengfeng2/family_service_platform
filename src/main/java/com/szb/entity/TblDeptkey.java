package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 部门key
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="TblDeptkey对象", description="部门key")
public class TblDeptkey implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "Key编码")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "key名称")
    private String deptName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "TblDeptkey{" +
        "id=" + id +
        ", deptName=" + deptName +
        "}";
    }
}
