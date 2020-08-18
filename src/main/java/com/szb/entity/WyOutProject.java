package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 支出项目
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="WyOutProject对象", description="支出项目")
public class WyOutProject implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "支出项目id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "支出项目名称")
    private String outProjectName;

    @ApiModelProperty(value = "上级支出项目id")
    private Integer parentOutProjectId;

    @ApiModelProperty(value = "说明")
    private String desc;

    @ApiModelProperty(value = "创建人")
    private String createPerson;

    @ApiModelProperty(value = "创建时间")
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

    public String getOutProjectName() {
        return outProjectName;
    }

    public void setOutProjectName(String outProjectName) {
        this.outProjectName = outProjectName;
    }

    public Integer getParentOutProjectId() {
        return parentOutProjectId;
    }

    public void setParentOutProjectId(Integer parentOutProjectId) {
        this.parentOutProjectId = parentOutProjectId;
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
        return "WyOutProject{" +
        "id=" + id +
        ", outProjectName=" + outProjectName +
        ", parentOutProjectId=" + parentOutProjectId +
        ", desc=" + desc +
        ", createPerson=" + createPerson +
        ", createDate=" + createDate +
        ", updatePerson=" + updatePerson +
        ", updateDate=" + updateDate +
        "}";
    }
}
