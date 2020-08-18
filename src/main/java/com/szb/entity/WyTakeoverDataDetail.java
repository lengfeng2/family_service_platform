package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 物业接管资料明细
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="WyTakeoverDataDetail对象", description="物业接管资料明细")
public class WyTakeoverDataDetail implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "接管资料id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "所属接管id")
    private Integer takeoverId;

    @ApiModelProperty(value = "资料名称")
    private String dataName;

    @ApiModelProperty(value = "资料份数")
    private Integer dataCopies;

    @ApiModelProperty(value = "资料页数")
    private Integer dataPages;

    @ApiModelProperty(value = "资料分类")
    private Long dataType;

    @ApiModelProperty(value = "档案号")
    private String fileNumber;

    @ApiModelProperty(value = "交出人")
    private String handoverPerson;

    @ApiModelProperty(value = "接收人")
    private String receivePerson;

    @ApiModelProperty(value = "接受日期")
    private LocalDateTime receiveDate;

    @ApiModelProperty(value = "备注")
    private String remark;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTakeoverId() {
        return takeoverId;
    }

    public void setTakeoverId(Integer takeoverId) {
        this.takeoverId = takeoverId;
    }

    public String getDataName() {
        return dataName;
    }

    public void setDataName(String dataName) {
        this.dataName = dataName;
    }

    public Integer getDataCopies() {
        return dataCopies;
    }

    public void setDataCopies(Integer dataCopies) {
        this.dataCopies = dataCopies;
    }

    public Integer getDataPages() {
        return dataPages;
    }

    public void setDataPages(Integer dataPages) {
        this.dataPages = dataPages;
    }

    public Long getDataType() {
        return dataType;
    }

    public void setDataType(Long dataType) {
        this.dataType = dataType;
    }

    public String getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(String fileNumber) {
        this.fileNumber = fileNumber;
    }

    public String getHandoverPerson() {
        return handoverPerson;
    }

    public void setHandoverPerson(String handoverPerson) {
        this.handoverPerson = handoverPerson;
    }

    public String getReceivePerson() {
        return receivePerson;
    }

    public void setReceivePerson(String receivePerson) {
        this.receivePerson = receivePerson;
    }

    public LocalDateTime getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(LocalDateTime receiveDate) {
        this.receiveDate = receiveDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "WyTakeoverDataDetail{" +
        "id=" + id +
        ", takeoverId=" + takeoverId +
        ", dataName=" + dataName +
        ", dataCopies=" + dataCopies +
        ", dataPages=" + dataPages +
        ", dataType=" + dataType +
        ", fileNumber=" + fileNumber +
        ", handoverPerson=" + handoverPerson +
        ", receivePerson=" + receivePerson +
        ", receiveDate=" + receiveDate +
        ", remark=" + remark +
        "}";
    }
}
