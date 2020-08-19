package com.szb.result;

import java.io.Serializable;

/**
 * 定义返回符合前端校验规范的返回对象
 */
public class WebResponse implements Serializable {
    private static final long serialVersionUID = -508235611467934730L;

    private String code;
    private String message;
    private Object result;

    public WebResponse() {
    }

    public WebResponse(String code, String message, Object result) {
        this.code = code;
        this.message = message;
        this.result = result;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    @Override
    public String
    toString() {
        return "WebResponse{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", result=" + result +
                '}';
    }
}
