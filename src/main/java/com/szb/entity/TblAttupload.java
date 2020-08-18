package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 附件
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="TblAttupload对象", description="附件")
public class TblAttupload implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "附件id")
    @TableId(value = "attID", type = IdType.AUTO)
    private Integer attID;

    @ApiModelProperty(value = "附件名称")
    @TableField("attName")
    private String attName;

    @ApiModelProperty(value = "附件新名称")
    @TableField("attNewName")
    private String attNewName;

    @ApiModelProperty(value = "唯一key")
    @TableField("attKey")
    private String attKey;

    @ApiModelProperty(value = "附件分类")
    @TableField("attClass")
    private String attClass;


    public Integer getAttID() {
        return attID;
    }

    public void setAttID(Integer attID) {
        this.attID = attID;
    }

    public String getAttName() {
        return attName;
    }

    public void setAttName(String attName) {
        this.attName = attName;
    }

    public String getAttNewName() {
        return attNewName;
    }

    public void setAttNewName(String attNewName) {
        this.attNewName = attNewName;
    }

    public String getAttKey() {
        return attKey;
    }

    public void setAttKey(String attKey) {
        this.attKey = attKey;
    }

    public String getAttClass() {
        return attClass;
    }

    public void setAttClass(String attClass) {
        this.attClass = attClass;
    }

    @Override
    public String toString() {
        return "TblAttupload{" +
        "attID=" + attID +
        ", attName=" + attName +
        ", attNewName=" + attNewName +
        ", attKey=" + attKey +
        ", attClass=" + attClass +
        "}";
    }
}
