package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 投票数据明细表
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="TblVoteDetail对象", description="投票数据明细表")
public class TblVoteDetail implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "投票编号")
    private Integer voteId;

    @ApiModelProperty(value = "答案编号")
    private Integer answerId;

    @ApiModelProperty(value = "答案")
    private String result;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVoteId() {
        return voteId;
    }

    public void setVoteId(Integer voteId) {
        this.voteId = voteId;
    }

    public Integer getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "TblVoteDetail{" +
        "id=" + id +
        ", voteId=" + voteId +
        ", answerId=" + answerId +
        ", result=" + result +
        "}";
    }
}
