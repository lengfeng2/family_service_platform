package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 客服收银组
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="WyServiceCashierGroup对象", description="客服收银组")
public class WyServiceCashierGroup implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自动编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "客服组名称")
    private String name;

    @ApiModelProperty(value = "包含楼宇编码")
    private String includeBuildingCode;

    @ApiModelProperty(value = "包含楼宇名称")
    private String includeBuildingName;

    @ApiModelProperty(value = "包含客服编码")
    private String includeServiceCode;

    @ApiModelProperty(value = "包含客服名称")
    private String includeServiceName;

    @ApiModelProperty(value = "组说明")
    private String desc;

    @ApiModelProperty(value = "所属公司")
    private String company;

    @ApiModelProperty(value = "创建人")
    private String createPerson;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "修改人")
    private String updatePerson;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIncludeBuildingCode() {
        return includeBuildingCode;
    }

    public void setIncludeBuildingCode(String includeBuildingCode) {
        this.includeBuildingCode = includeBuildingCode;
    }

    public String getIncludeBuildingName() {
        return includeBuildingName;
    }

    public void setIncludeBuildingName(String includeBuildingName) {
        this.includeBuildingName = includeBuildingName;
    }

    public String getIncludeServiceCode() {
        return includeServiceCode;
    }

    public void setIncludeServiceCode(String includeServiceCode) {
        this.includeServiceCode = includeServiceCode;
    }

    public String getIncludeServiceName() {
        return includeServiceName;
    }

    public void setIncludeServiceName(String includeServiceName) {
        this.includeServiceName = includeServiceName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
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

    public String getUpdatePerson() {
        return updatePerson;
    }

    public void setUpdatePerson(String updatePerson) {
        this.updatePerson = updatePerson;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "WyServiceCashierGroup{" +
        "id=" + id +
        ", name=" + name +
        ", includeBuildingCode=" + includeBuildingCode +
        ", includeBuildingName=" + includeBuildingName +
        ", includeServiceCode=" + includeServiceCode +
        ", includeServiceName=" + includeServiceName +
        ", desc=" + desc +
        ", company=" + company +
        ", createPerson=" + createPerson +
        ", createDate=" + createDate +
        ", updatePerson=" + updatePerson +
        ", updateDate=" + updateDate +
        "}";
    }
}
