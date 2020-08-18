package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 收入项目
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="WyIncomeProject对象", description="收入项目")
public class WyIncomeProject implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "收入项目id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "收入项目名称")
    private String incomeProjectName;

    @ApiModelProperty(value = "上级收入项目id")
    private Integer parentIncomeId;

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

    public String getIncomeProjectName() {
        return incomeProjectName;
    }

    public void setIncomeProjectName(String incomeProjectName) {
        this.incomeProjectName = incomeProjectName;
    }

    public Integer getParentIncomeId() {
        return parentIncomeId;
    }

    public void setParentIncomeId(Integer parentIncomeId) {
        this.parentIncomeId = parentIncomeId;
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
        return "WyIncomeProject{" +
        "id=" + id +
        ", incomeProjectName=" + incomeProjectName +
        ", parentIncomeId=" + parentIncomeId +
        ", desc=" + desc +
        ", createPerson=" + createPerson +
        ", createDate=" + createDate +
        ", updatePerson=" + updatePerson +
        ", updateDate=" + updateDate +
        "}";
    }
}
