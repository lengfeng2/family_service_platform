package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 临客费项设置
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="FyTemporaryMoneySetting对象", description="临客费项设置")
public class FyTemporaryMoneySetting implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "临客费项id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "费项名称")
    private String temporaryMoneyName;

    @ApiModelProperty(value = "上级费项id")
    private Integer upperMoneyId;

    @ApiModelProperty(value = "单位价格")
    private Double priceUnit;

    @ApiModelProperty(value = "费项说明")
    private String moneyDescription;

    @ApiModelProperty(value = "创建人")
    private String createPerson;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "修改人")
    private String updatePerson;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateDate;

    @ApiModelProperty(value = "所属公司")
    private String company;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTemporaryMoneyName() {
        return temporaryMoneyName;
    }

    public void setTemporaryMoneyName(String temporaryMoneyName) {
        this.temporaryMoneyName = temporaryMoneyName;
    }

    public Integer getUpperMoneyId() {
        return upperMoneyId;
    }

    public void setUpperMoneyId(Integer upperMoneyId) {
        this.upperMoneyId = upperMoneyId;
    }

    public Double getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(Double priceUnit) {
        this.priceUnit = priceUnit;
    }

    public String getMoneyDescription() {
        return moneyDescription;
    }

    public void setMoneyDescription(String moneyDescription) {
        this.moneyDescription = moneyDescription;
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "FyTemporaryMoneySetting{" +
        "id=" + id +
        ", temporaryMoneyName=" + temporaryMoneyName +
        ", upperMoneyId=" + upperMoneyId +
        ", priceUnit=" + priceUnit +
        ", moneyDescription=" + moneyDescription +
        ", createPerson=" + createPerson +
        ", createDate=" + createDate +
        ", updatePerson=" + updatePerson +
        ", updateDate=" + updateDate +
        ", company=" + company +
        "}";
    }
}
