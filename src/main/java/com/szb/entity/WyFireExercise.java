package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 消防演练
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="WyFireExercise对象", description="消防演练")
public class WyFireExercise implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自动编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "单位")
    private String unit;

    @ApiModelProperty(value = "开始日期")
    private LocalDateTime startDate;

    @ApiModelProperty(value = "结束日期")
    private LocalDateTime stopDate;

    @ApiModelProperty(value = "演练目的")
    private String exercisePurpose;

    @ApiModelProperty(value = "参与人数")
    private Integer joinPersons;

    @ApiModelProperty(value = "协助单位")
    private String assistantUnit;

    @ApiModelProperty(value = "演练内容")
    private String exerciseContent;

    @ApiModelProperty(value = "演练效果")
    private String exerciseResult;

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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getStopDate() {
        return stopDate;
    }

    public void setStopDate(LocalDateTime stopDate) {
        this.stopDate = stopDate;
    }

    public String getExercisePurpose() {
        return exercisePurpose;
    }

    public void setExercisePurpose(String exercisePurpose) {
        this.exercisePurpose = exercisePurpose;
    }

    public Integer getJoinPersons() {
        return joinPersons;
    }

    public void setJoinPersons(Integer joinPersons) {
        this.joinPersons = joinPersons;
    }

    public String getAssistantUnit() {
        return assistantUnit;
    }

    public void setAssistantUnit(String assistantUnit) {
        this.assistantUnit = assistantUnit;
    }

    public String getExerciseContent() {
        return exerciseContent;
    }

    public void setExerciseContent(String exerciseContent) {
        this.exerciseContent = exerciseContent;
    }

    public String getExerciseResult() {
        return exerciseResult;
    }

    public void setExerciseResult(String exerciseResult) {
        this.exerciseResult = exerciseResult;
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
        return "WyFireExercise{" +
        "id=" + id +
        ", unit=" + unit +
        ", startDate=" + startDate +
        ", stopDate=" + stopDate +
        ", exercisePurpose=" + exercisePurpose +
        ", joinPersons=" + joinPersons +
        ", assistantUnit=" + assistantUnit +
        ", exerciseContent=" + exerciseContent +
        ", exerciseResult=" + exerciseResult +
        ", remark=" + remark +
        ", company=" + company +
        "}";
    }
}
