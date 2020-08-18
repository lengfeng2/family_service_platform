package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 投票题目表
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="TblVoteSubject对象", description="投票题目表")
public class TblVoteSubject implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "题目编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "所属项目编号")
    private Integer projectId;

    @ApiModelProperty(value = "题目名称")
    private String subjectName;

    @ApiModelProperty(value = "建档人")
    private String inputRecordPerson;

    @ApiModelProperty(value = "建档时间")
    private LocalDateTime inputRecordDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getInputRecordPerson() {
        return inputRecordPerson;
    }

    public void setInputRecordPerson(String inputRecordPerson) {
        this.inputRecordPerson = inputRecordPerson;
    }

    public LocalDateTime getInputRecordDate() {
        return inputRecordDate;
    }

    public void setInputRecordDate(LocalDateTime inputRecordDate) {
        this.inputRecordDate = inputRecordDate;
    }

    @Override
    public String toString() {
        return "TblVoteSubject{" +
        "id=" + id +
        ", projectId=" + projectId +
        ", subjectName=" + subjectName +
        ", inputRecordPerson=" + inputRecordPerson +
        ", inputRecordDate=" + inputRecordDate +
        "}";
    }
}
