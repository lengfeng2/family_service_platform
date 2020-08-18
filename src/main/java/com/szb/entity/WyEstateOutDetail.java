package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 楼盘经费支出明细
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="WyEstateOutDetail对象", description="楼盘经费支出明细")
public class WyEstateOutDetail implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自动编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "记账日期")
    private LocalDateTime chargeDate;

    @ApiModelProperty(value = "所属楼盘id")
    private Integer estateId;

    @ApiModelProperty(value = "支出主项目")
    private String outputMainProject;

    @ApiModelProperty(value = "支出子项目")
    private Integer outputSubProject;

    @ApiModelProperty(value = "支出金额")
    private Double outputMoney;

    @ApiModelProperty(value = "年累计支出金额")
    private Double outputMoneyYear;

    @ApiModelProperty(value = "主项累计支出金额")
    private Double outputMoneyMain;

    @ApiModelProperty(value = "状态")
    private String status;

    @ApiModelProperty(value = "说明")
    private String desc;

    @ApiModelProperty(value = "创建人")
    private String createPerson;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "修改人")
    private String updatePerson;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateDate;

    @ApiModelProperty(value = "下一步接收人id")
    private String nextReceivePersonId;

    @ApiModelProperty(value = "下一步接收人姓名")
    private String nextReceivePersonName;

    @ApiModelProperty(value = "送审时间")
    private LocalDateTime sendCheckDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getChargeDate() {
        return chargeDate;
    }

    public void setChargeDate(LocalDateTime chargeDate) {
        this.chargeDate = chargeDate;
    }

    public Integer getEstateId() {
        return estateId;
    }

    public void setEstateId(Integer estateId) {
        this.estateId = estateId;
    }

    public String getOutputMainProject() {
        return outputMainProject;
    }

    public void setOutputMainProject(String outputMainProject) {
        this.outputMainProject = outputMainProject;
    }

    public Integer getOutputSubProject() {
        return outputSubProject;
    }

    public void setOutputSubProject(Integer outputSubProject) {
        this.outputSubProject = outputSubProject;
    }

    public Double getOutputMoney() {
        return outputMoney;
    }

    public void setOutputMoney(Double outputMoney) {
        this.outputMoney = outputMoney;
    }

    public Double getOutputMoneyYear() {
        return outputMoneyYear;
    }

    public void setOutputMoneyYear(Double outputMoneyYear) {
        this.outputMoneyYear = outputMoneyYear;
    }

    public Double getOutputMoneyMain() {
        return outputMoneyMain;
    }

    public void setOutputMoneyMain(Double outputMoneyMain) {
        this.outputMoneyMain = outputMoneyMain;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
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

    public String getNextReceivePersonId() {
        return nextReceivePersonId;
    }

    public void setNextReceivePersonId(String nextReceivePersonId) {
        this.nextReceivePersonId = nextReceivePersonId;
    }

    public String getNextReceivePersonName() {
        return nextReceivePersonName;
    }

    public void setNextReceivePersonName(String nextReceivePersonName) {
        this.nextReceivePersonName = nextReceivePersonName;
    }

    public LocalDateTime getSendCheckDate() {
        return sendCheckDate;
    }

    public void setSendCheckDate(LocalDateTime sendCheckDate) {
        this.sendCheckDate = sendCheckDate;
    }

    @Override
    public String toString() {
        return "WyEstateOutDetail{" +
        "id=" + id +
        ", chargeDate=" + chargeDate +
        ", estateId=" + estateId +
        ", outputMainProject=" + outputMainProject +
        ", outputSubProject=" + outputSubProject +
        ", outputMoney=" + outputMoney +
        ", outputMoneyYear=" + outputMoneyYear +
        ", outputMoneyMain=" + outputMoneyMain +
        ", status=" + status +
        ", desc=" + desc +
        ", createPerson=" + createPerson +
        ", createDate=" + createDate +
        ", updatePerson=" + updatePerson +
        ", updateDate=" + updateDate +
        ", nextReceivePersonId=" + nextReceivePersonId +
        ", nextReceivePersonName=" + nextReceivePersonName +
        ", sendCheckDate=" + sendCheckDate +
        "}";
    }
}
