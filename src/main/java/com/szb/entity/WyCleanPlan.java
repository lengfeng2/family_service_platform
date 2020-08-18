package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 清洁安排
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="WyCleanPlan对象", description="清洁安排")
public class WyCleanPlan implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "项目编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "项目名称")
    private String projectName;

    @ApiModelProperty(value = "清洁地段")
    private String cleanPlace;

    @ApiModelProperty(value = "清洁内容")
    private String cleanContent;

    @ApiModelProperty(value = "负责人")
    private String leader;

    @ApiModelProperty(value = "清洁时间")
    private String cleanDate;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "所属公司")
    private String company;


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

    public String getCleanPlace() {
        return cleanPlace;
    }

    public void setCleanPlace(String cleanPlace) {
        this.cleanPlace = cleanPlace;
    }

    public String getCleanContent() {
        return cleanContent;
    }

    public void setCleanContent(String cleanContent) {
        this.cleanContent = cleanContent;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getCleanDate() {
        return cleanDate;
    }

    public void setCleanDate(String cleanDate) {
        this.cleanDate = cleanDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "WyCleanPlan{" +
        "id=" + id +
        ", projectName=" + projectName +
        ", cleanPlace=" + cleanPlace +
        ", cleanContent=" + cleanContent +
        ", leader=" + leader +
        ", cleanDate=" + cleanDate +
        ", remark=" + remark +
        ", company=" + company +
        "}";
    }
}
