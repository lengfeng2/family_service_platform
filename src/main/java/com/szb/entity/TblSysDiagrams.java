package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 系统图标
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="TblSysDiagrams对象", description="系统图标")
public class TblSysDiagrams implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "图标名称")
    private String diagramName;

    @ApiModelProperty(value = "归属人")
    private Integer belongPerson;

    @ApiModelProperty(value = "图标编号")
    private Integer diagramId;

    @ApiModelProperty(value = "图标版本")
    private Integer diagramVersion;

    @ApiModelProperty(value = "图标定义")
    private String diagramDefinition;


    public String getDiagramName() {
        return diagramName;
    }

    public void setDiagramName(String diagramName) {
        this.diagramName = diagramName;
    }

    public Integer getBelongPerson() {
        return belongPerson;
    }

    public void setBelongPerson(Integer belongPerson) {
        this.belongPerson = belongPerson;
    }

    public Integer getDiagramId() {
        return diagramId;
    }

    public void setDiagramId(Integer diagramId) {
        this.diagramId = diagramId;
    }

    public Integer getDiagramVersion() {
        return diagramVersion;
    }

    public void setDiagramVersion(Integer diagramVersion) {
        this.diagramVersion = diagramVersion;
    }

    public String getDiagramDefinition() {
        return diagramDefinition;
    }

    public void setDiagramDefinition(String diagramDefinition) {
        this.diagramDefinition = diagramDefinition;
    }

    @Override
    public String toString() {
        return "TblSysDiagrams{" +
        "diagramName=" + diagramName +
        ", belongPerson=" + belongPerson +
        ", diagramId=" + diagramId +
        ", diagramVersion=" + diagramVersion +
        ", diagramDefinition=" + diagramDefinition +
        "}";
    }
}
