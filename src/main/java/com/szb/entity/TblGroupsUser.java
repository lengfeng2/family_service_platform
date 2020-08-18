package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 分组用户
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="TblGroupsUser对象", description="分组用户")
public class TblGroupsUser implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "分组id")
    private Integer groupId;

    @ApiModelProperty(value = "对象id")
    private String objId;

    @ApiModelProperty(value = "绑定类型")
    private Integer objType;


    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getObjId() {
        return objId;
    }

    public void setObjId(String objId) {
        this.objId = objId;
    }

    public Integer getObjType() {
        return objType;
    }

    public void setObjType(Integer objType) {
        this.objType = objType;
    }

    @Override
    public String toString() {
        return "TblGroupsUser{" +
        "groupId=" + groupId +
        ", objId=" + objId +
        ", objType=" + objType +
        "}";
    }
}
