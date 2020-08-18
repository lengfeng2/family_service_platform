package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 物业接管概要
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="WyPropertyTakeoverSchema对象", description="物业接管概要")
public class WyPropertyTakeoverSchema implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "接管单号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "接管标题")
    private String takeoverTitle;

    @ApiModelProperty(value = "所属楼盘")
    private Integer estateId;

    @ApiModelProperty(value = "接管备注")
    private String remark;

    @ApiModelProperty(value = "创建人")
    private String createPerson;

    @ApiModelProperty(value = "创建日期")
    private LocalDateTime createDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTakeoverTitle() {
        return takeoverTitle;
    }

    public void setTakeoverTitle(String takeoverTitle) {
        this.takeoverTitle = takeoverTitle;
    }

    public Integer getEstateId() {
        return estateId;
    }

    public void setEstateId(Integer estateId) {
        this.estateId = estateId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    @Override
    public String toString() {
        return "WyPropertyTakeoverSchema{" +
        "id=" + id +
        ", takeoverTitle=" + takeoverTitle +
        ", estateId=" + estateId +
        ", remark=" + remark +
        ", createPerson=" + createPerson +
        ", createDate=" + createDate +
        "}";
    }
}
