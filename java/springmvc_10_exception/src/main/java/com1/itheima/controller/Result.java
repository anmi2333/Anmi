package com1.itheima.controller;

/**
 * @projectName: springmvc_01_quickstart
 * @package: com.itheima.controller
 * @className: Result
 * @NAME: WANG CHAO
 * @date: 2023/09/05 10:07
 */
@SuppressWarnings({"all"})
public class Result {
    private Object data;
    private Integer code;
    private String msg;

    public Result() {
    }
    public Result(Integer code, Object data) {
        this.data = data;
        this.code = code;
    }

    public Result(Integer code, Object data,String msg) {
        this.data = data;
        this.code = code;
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
