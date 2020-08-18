package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 楼盘经费支出项目
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="WyEstateOutProject对象", description="楼盘经费支出项目")
public class WyEstateOutProject implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "项目id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "项目名称")
    private String projectName;

    @ApiModelProperty(value = "上级支出项目id")
    private Integer parentOutProjectId;

    @ApiModelProperty(value = "所属主项目")
    private String belongMainProjecct;

    @ApiModelProperty(value = "说明")
    private String desc;

    @ApiModelProperty(value = "建档人")
    private String createPerson;

    @ApiModelProperty(value = "建档时间")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "修改人")
    private String updatePerson;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Integer getParentOutProjectId() {
        return parentOutProjectId;
    }

    public void setParentOutProjectId(Integer parentOutProjectId) {
        this.parentOutProjectId = parentOutProjectId;
    }

    public String getBelongMainProjecct() {
        return belongMainProjecct;
    }

    public void setBelongMainProjecct(String belongMainProjecct) {
        this.belongMainProjecct = belongMainProjecct;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCreatePerson() {
        return createPerson;
    }

    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public String getUpdatePerson() {
        return updatePerson;
    }

    public void setUpdatePerson(String updatePerson) {
        this.updatePerson = updatePerson;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "WyEstateOutProject{" +
        "id=" + id +
        ", projectName=" + projectName +
        ", parentOutProjectId=" + parentOutProjectId +
        ", belongMainProjecct=" + belongMainProjecct +
        ", desc=" + desc +
        ", createPerson=" + createPerson +
        ", createDate=" + createDate +
        ", updatePerson=" + updatePerson +
        ", updateDate=" + updateDate +
        "}";
    }
}
