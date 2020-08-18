package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 常用短信
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="TblCommonMessage对象", description="常用短信")
public class TblCommonMessage implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "短信编码")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "短信内容")
    private String messageContent;

    @ApiModelProperty(value = "类型")
    private Long messageType;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public Long getMessageType() {
        return messageType;
    }

    public void setMessageType(Long messageType) {
        this.messageType = messageType;
    }

    @Override
    public String toString() {
        return "TblCommonMessage{" +
        "id=" + id +
        ", messageContent=" + messageContent +
        ", messageType=" + messageType +
        "}";
    }
}
