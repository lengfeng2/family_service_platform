package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 业委会会议
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="WyCommitteeMetting对象", description="业委会会议")
public class WyCommitteeMetting implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自动编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "会议日期")
    private LocalDateTime meetingDate;

    @ApiModelProperty(value = "会议主题")
    private String meetingTitle;

    @ApiModelProperty(value = "会议地点")
    private String meetingAddr;

    @ApiModelProperty(value = "会议内容")
    private String meetingContent;

    @ApiModelProperty(value = "主持人")
    private String hoster;

    @ApiModelProperty(value = "记录员")
    private String recorder;

    @ApiModelProperty(value = "参见人员")
    private String joiner;

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

    public LocalDateTime getMeetingDate() {
        return meetingDate;
    }

    public void setMeetingDate(LocalDateTime meetingDate) {
        this.meetingDate = meetingDate;
    }

    public String getMeetingTitle() {
        return meetingTitle;
    }

    public void setMeetingTitle(String meetingTitle) {
        this.meetingTitle = meetingTitle;
    }

    public String getMeetingAddr() {
        return meetingAddr;
    }

    public void setMeetingAddr(String meetingAddr) {
        this.meetingAddr = meetingAddr;
    }

    public String getMeetingContent() {
        return meetingContent;
    }

    public void setMeetingContent(String meetingContent) {
        this.meetingContent = meetingContent;
    }

    public String getHoster() {
        return hoster;
    }

    public void setHoster(String hoster) {
        this.hoster = hoster;
    }

    public String getRecorder() {
        return recorder;
    }

    public void setRecorder(String recorder) {
        this.recorder = recorder;
    }

    public String getJoiner() {
        return joiner;
    }

    public void setJoiner(String joiner) {
        this.joiner = joiner;
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
        return "WyCommitteeMetting{" +
        "id=" + id +
        ", meetingDate=" + meetingDate +
        ", meetingTitle=" + meetingTitle +
        ", meetingAddr=" + meetingAddr +
        ", meetingContent=" + meetingContent +
        ", hoster=" + hoster +
        ", recorder=" + recorder +
        ", joiner=" + joiner +
        ", remark=" + remark +
        ", company=" + company +
        "}";
    }
}
