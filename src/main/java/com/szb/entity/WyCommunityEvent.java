package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 社区活动
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="WyCommunityEvent对象", description="社区活动")
public class WyCommunityEvent implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自动编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "活动日期")
    private LocalDateTime eventDate;

    @ApiModelProperty(value = "活动内容")
    private String eventContent;

    @ApiModelProperty(value = "主持者")
    private String hoster;

    @ApiModelProperty(value = "参加人员")
    private String joinPerson;

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

    public LocalDateTime getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDateTime eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventContent() {
        return eventContent;
    }

    public void setEventContent(String eventContent) {
        this.eventContent = eventContent;
    }

    public String getHoster() {
        return hoster;
    }

    public void setHoster(String hoster) {
        this.hoster = hoster;
    }

    public String getJoinPerson() {
        return joinPerson;
    }

    public void setJoinPerson(String joinPerson) {
        this.joinPerson = joinPerson;
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
        return "WyCommunityEvent{" +
        "id=" + id +
        ", eventDate=" + eventDate +
        ", eventContent=" + eventContent +
        ", hoster=" + hoster +
        ", joinPerson=" + joinPerson +
        ", remark=" + remark +
        ", company=" + company +
        "}";
    }
}
