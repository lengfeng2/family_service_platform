package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 费用台账概要
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="FyStandingBook对象", description="费用台账概要")
public class FyStandingBook implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "台账编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "台账名称")
    private String standingBookName;

    @ApiModelProperty(value = "关联费用编码")
    private Integer associateCostCode;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "生成日期")
    private LocalDateTime creationDate;

    @ApiModelProperty(value = "生成人")
    private String creationPerson;

    @ApiModelProperty(value = "关联台账账号")
    private String associateStandingBookId;

    @ApiModelProperty(value = "所属公司")
    private Integer company;


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

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public String getCreationPerson() {
        return creationPerson;
    }

    public void setCreationPerson(String creationPerson) {
        this.creationPerson = creationPerson;
    }

    public String getAssociateStandingBookId() {
        return associateStandingBookId;
    }

    public void setAssociateStandingBookId(String associateStandingBookId) {
        this.associateStandingBookId = associateStandingBookId;
    }

    public Integer getCompany() {
        return company;
    }

    public void setCompany(Integer company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "FyStandingBook{" +
        "id=" + id +
        ", standingBookName=" + standingBookName +
        ", associateCostCode=" + associateCostCode +
        ", remark=" + remark +
        ", creationDate=" + creationDate +
        ", creationPerson=" + creationPerson +
        ", associateStandingBookId=" + associateStandingBookId +
        ", company=" + company +
        "}";
    }
}
