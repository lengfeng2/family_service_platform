package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 我的记事本
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="TblMyNote对象", description="我的记事本")
public class TblMyNote implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "创建人员编码")
    private String createPersonId;

    @ApiModelProperty(value = "标题")
    private String title;

    @ApiModelProperty(value = "类型")
    private String type;

    @ApiModelProperty(value = "地点")
    private String place;

    @ApiModelProperty(value = "内容")
    private String content;

    @ApiModelProperty(value = "是否私人性质")
    private Integer isPrivate;

    @ApiModelProperty(value = "是否重复")
    private Integer isRepeat;

    @ApiModelProperty(value = "重复")
    private String repeat;

    @ApiModelProperty(value = "重复至日结束")
    private LocalDateTime repeatStop;

    @ApiModelProperty(value = "是否提醒")
    private Integer isRemain;

    @ApiModelProperty(value = "提前N天提醒")
    private Integer remainDay;

    @ApiModelProperty(value = "开始时间")
    private LocalDateTime startDate;

    @ApiModelProperty(value = "结束时间")
    private LocalDateTime stopDate;

    @ApiModelProperty(value = "预约人员")
    private String orderPerson;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreatePersonId() {
        return createPersonId;
    }

    public void setCreatePersonId(String createPersonId) {
        this.createPersonId = createPersonId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(Integer isPrivate) {
        this.isPrivate = isPrivate;
    }

    public Integer getIsRepeat() {
        return isRepeat;
    }

    public void setIsRepeat(Integer isRepeat) {
        this.isRepeat = isRepeat;
    }

    public String getRepeat() {
        return repeat;
    }

    public void setRepeat(String repeat) {
        this.repeat = repeat;
    }

    public LocalDateTime getRepeatStop() {
        return repeatStop;
    }

    public void setRepeatStop(LocalDateTime repeatStop) {
        this.repeatStop = repeatStop;
    }

    public Integer getIsRemain() {
        return isRemain;
    }

    public void setIsRemain(Integer isRemain) {
        this.isRemain = isRemain;
    }

    public Integer getRemainDay() {
        return remainDay;
    }

    public void setRemainDay(Integer remainDay) {
        this.remainDay = remainDay;
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

    public String getOrderPerson() {
        return orderPerson;
    }

    public void setOrderPerson(String orderPerson) {
        this.orderPerson = orderPerson;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "TblMyNote{" +
        "id=" + id +
        ", createPersonId=" + createPersonId +
        ", title=" + title +
        ", type=" + type +
        ", place=" + place +
        ", content=" + content +
        ", isPrivate=" + isPrivate +
        ", isRepeat=" + isRepeat +
        ", repeat=" + repeat +
        ", repeatStop=" + repeatStop +
        ", isRemain=" + isRemain +
        ", remainDay=" + remainDay +
        ", startDate=" + startDate +
        ", stopDate=" + stopDate +
        ", orderPerson=" + orderPerson +
        ", createDate=" + createDate +
        "}";
    }
}
