package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 消防事故
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="WyFireAccident对象", description="消防事故")
public class WyFireAccident implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自动编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "事故日期")
    private LocalDateTime accidentDate;

    @ApiModelProperty(value = "事故地点")
    private String accidentPlace;

    @ApiModelProperty(value = "发生原因")
    private String occurReason;

    @ApiModelProperty(value = "相关人员")
    private String relatedPerson;

    @ApiModelProperty(value = "处理结果")
    private String handleResult;

    @ApiModelProperty(value = "损失程度")
    private String loss;

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

    public LocalDateTime getAccidentDate() {
        return accidentDate;
    }

    public void setAccidentDate(LocalDateTime accidentDate) {
        this.accidentDate = accidentDate;
    }

    public String getAccidentPlace() {
        return accidentPlace;
    }

    public void setAccidentPlace(String accidentPlace) {
        this.accidentPlace = accidentPlace;
    }

    public String getOccurReason() {
        return occurReason;
    }

    public void setOccurReason(String occurReason) {
        this.occurReason = occurReason;
    }

    public String getRelatedPerson() {
        return relatedPerson;
    }

    public void setRelatedPerson(String relatedPerson) {
        this.relatedPerson = relatedPerson;
    }

    public String getHandleResult() {
        return handleResult;
    }

    public void setHandleResult(String handleResult) {
        this.handleResult = handleResult;
    }

    public String getLoss() {
        return loss;
    }

    public void setLoss(String loss) {
        this.loss = loss;
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
        return "WyFireAccident{" +
        "id=" + id +
        ", accidentDate=" + accidentDate +
        ", accidentPlace=" + accidentPlace +
        ", occurReason=" + occurReason +
        ", relatedPerson=" + relatedPerson +
        ", handleResult=" + handleResult +
        ", loss=" + loss +
        ", remark=" + remark +
        ", company=" + company +
        "}";
    }
}
