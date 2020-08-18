package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 物业接管工程明细
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="WyPropertyTakeoverDetail对象", description="物业接管工程明细")
public class WyPropertyTakeoverDetail implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "接管细节id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "所属接管id")
    private Integer takeoverId;

    @ApiModelProperty(value = "工程项目名称")
    private String projectName;

    @ApiModelProperty(value = "验收方")
    private String checked;

    @ApiModelProperty(value = "验收日期")
    private LocalDateTime checkedDate;

    @ApiModelProperty(value = "验收结果")
    private String checkedResult;

    @ApiModelProperty(value = "整改完成日期")
    private LocalDateTime finishDate;

    @ApiModelProperty(value = "整改完成情况")
    private String finishCondition;

    @ApiModelProperty(value = "备注")
    private String remark;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTakeoverId() {
        return takeoverId;
    }

    public void setTakeoverId(Integer takeoverId) {
        this.takeoverId = takeoverId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getChecked() {
        return checked;
    }

    public void setChecked(String checked) {
        this.checked = checked;
    }

    public LocalDateTime getCheckedDate() {
        return checkedDate;
    }

    public void setCheckedDate(LocalDateTime checkedDate) {
        this.checkedDate = checkedDate;
    }

    public String getCheckedResult() {
        return checkedResult;
    }

    public void setCheckedResult(String checkedResult) {
        this.checkedResult = checkedResult;
    }

    public LocalDateTime getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(LocalDateTime finishDate) {
        this.finishDate = finishDate;
    }

    public String getFinishCondition() {
        return finishCondition;
    }

    public void setFinishCondition(String finishCondition) {
        this.finishCondition = finishCondition;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "WyPropertyTakeoverDetail{" +
        "id=" + id +
        ", takeoverId=" + takeoverId +
        ", projectName=" + projectName +
        ", checked=" + checked +
        ", checkedDate=" + checkedDate +
        ", checkedResult=" + checkedResult +
        ", finishDate=" + finishDate +
        ", finishCondition=" + finishCondition +
        ", remark=" + remark +
        "}";
    }
}
