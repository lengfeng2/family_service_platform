package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 快捷方式图标
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="TblShortcutIcon对象", description="快捷方式图标")
public class TblShortcutIcon implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "名称")
    private String iconName;

    @ApiModelProperty(value = "图标路径")
    private String iconPath;

    @ApiModelProperty(value = "状态")
    private String status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIconName() {
        return iconName;
    }

    public void setIconName(String iconName) {
        this.iconName = iconName;
    }

    public String getIconPath() {
        return iconPath;
    }

    public void setIconPath(String iconPath) {
        this.iconPath = iconPath;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "TblShortcutIcon{" +
        "id=" + id +
        ", iconName=" + iconName +
        ", iconPath=" + iconPath +
        ", status=" + status +
        "}";
    }
}
