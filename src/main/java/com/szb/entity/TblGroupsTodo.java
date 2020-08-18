package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 分组待办事项
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="TblGroupsTodo对象", description="分组待办事项")
public class TblGroupsTodo implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "分组id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "待办事项id")
    private String todoId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTodoId() {
        return todoId;
    }

    public void setTodoId(String todoId) {
        this.todoId = todoId;
    }

    @Override
    public String toString() {
        return "TblGroupsTodo{" +
        "id=" + id +
        ", todoId=" + todoId +
        "}";
    }
}
