package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 打印参数
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="TblPrintParam对象", description="打印参数")
public class TblPrintParam implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "打印参数编号")
    @TableId(value = "print_id", type = IdType.AUTO)
    private String printId;

    @ApiModelProperty(value = "打印参数名称")
    private String printName;

    @ApiModelProperty(value = "打印参数值")
    private String printValue;

    @ApiModelProperty(value = "打印参数描述")
    private String printDesc;


    public String getPrintId() {
        return printId;
    }

    public void setPrintId(String printId) {
        this.printId = printId;
    }

    public String getPrintName() {
        return printName;
    }

    public void setPrintName(String printName) {
        this.printName = printName;
    }

    public String getPrintValue() {
        return printValue;
    }

    public void setPrintValue(String printValue) {
        this.printValue = printValue;
    }

    public String getPrintDesc() {
        return printDesc;
    }

    public void setPrintDesc(String printDesc) {
        this.printDesc = printDesc;
    }

    @Override
    public String toString() {
        return "TblPrintParam{" +
        "printId=" + printId +
        ", printName=" + printName +
        ", printValue=" + printValue +
        ", printDesc=" + printDesc +
        "}";
    }
}
