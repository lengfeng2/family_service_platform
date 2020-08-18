package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 公摊费用台账概要
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="FyShareStandingBook对象", description="公摊费用台账概要")
public class FyShareStandingBook implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "公摊费用编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "台账名称")
    private String standingBookName;

    @ApiModelProperty(value = "关联费用编码")
    private Integer associateCostCode;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "生成日期")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "生成人")
    private String createPerson;

    @ApiModelProperty(value = "所属公司")
    private String company;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStandingBookName() {
        return standingBookName;
    }

    public void setStandingBookName(String standingBookName) {
        this.standingBookName = standingBookName;
    }

    public Integer getAssociateCostCode() {
        return associateCostCode;
    }

    public void setAssociateCostCode(Integer associateCostCode) {
        this.associateCostCode = associateCostCode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public String getCreatePerson() {
        return createPerson;
    }

    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "FyShareStandingBook{" +
        "id=" + id +
        ", standingBookName=" + standingBookName +
        ", associateCostCode=" + associateCostCode +
        ", remark=" + remark +
        ", createDate=" + createDate +
        ", createPerson=" + createPerson +
        ", company=" + company +
        "}";
    }
}
