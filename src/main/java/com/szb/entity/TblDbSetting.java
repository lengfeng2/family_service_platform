package com.szb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 数据库设置
 * </p>
 *
 * @author leng
 * @since 2020-08-14
 */
@ApiModel(value="TblDbSetting对象", description="数据库设置")
public class TblDbSetting implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "连接地址")
    @TableField("db_Url")
    private String dbUrl;

    @ApiModelProperty(value = "用户名")
    private String dbUsername;

    @ApiModelProperty(value = "密码")
    private String dbPwd;

    @ApiModelProperty(value = "数据库名")
    private String dbLibName;

    @ApiModelProperty(value = "存放路径")
    private String savePath;

    @ApiModelProperty(value = "存放名称")
    private String saveName;


    public String getDbUrl() {
        return dbUrl;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public String getDbUsername() {
        return dbUsername;
    }

    public void setDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
    }

    public String getDbPwd() {
        return dbPwd;
    }

    public void setDbPwd(String dbPwd) {
        this.dbPwd = dbPwd;
    }

    public String getDbLibName() {
        return dbLibName;
    }

    public void setDbLibName(String dbLibName) {
        this.dbLibName = dbLibName;
    }

    public String getSavePath() {
        return savePath;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }

    public String getSaveName() {
        return saveName;
    }

    public void setSaveName(String saveName) {
        this.saveName = saveName;
    }

    @Override
    public String toString() {
        return "TblDbSetting{" +
        "dbUrl=" + dbUrl +
        ", dbUsername=" + dbUsername +
        ", dbPwd=" + dbPwd +
        ", dbLibName=" + dbLibName +
        ", savePath=" + savePath +
        ", saveName=" + saveName +
        "}";
    }
}
