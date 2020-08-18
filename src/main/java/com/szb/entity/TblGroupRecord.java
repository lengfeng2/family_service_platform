package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 群组档案
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="TblGroupRecord对象", description="群组档案")
public class TblGroupRecord implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自动增长id")
    private Integer groupRecordId;

    @ApiModelProperty(value = "群组名称")
    private String groupName;

    @ApiModelProperty(value = "群组类型")
    private String groupType;

    @ApiModelProperty(value = "群组说明")
    private String groupDesc;

    @ApiModelProperty(value = "组内成员id")
    private String groupMemberId;

    @ApiModelProperty(value = "组内成员名称")
    private String groupMemberName;

    @ApiModelProperty(value = "创建人")
    private String createPerson;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createDate;


    public Integer getGroupRecordId() {
        return groupRecordId;
    }

    public void setGroupRecordId(Integer groupRecordId) {
        this.groupRecordId = groupRecordId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    public String getGroupDesc() {
        return groupDesc;
    }

    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
    }

    public String getGroupMemberId() {
        return groupMemberId;
    }

    public void setGroupMemberId(String groupMemberId) {
        this.groupMemberId = groupMemberId;
    }

    public String getGroupMemberName() {
        return groupMemberName;
    }

    public void setGroupMemberName(String groupMemberName) {
        this.groupMemberName = groupMemberName;
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
        return "TblGroupRecord{" +
        "groupRecordId=" + groupRecordId +
        ", groupName=" + groupName +
        ", groupType=" + groupType +
        ", groupDesc=" + groupDesc +
        ", groupMemberId=" + groupMemberId +
        ", groupMemberName=" + groupMemberName +
        ", createPerson=" + createPerson +
        ", createDate=" + createDate +
        "}";
    }
}
