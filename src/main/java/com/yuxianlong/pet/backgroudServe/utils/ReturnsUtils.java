package com.yuxianlong.pet.backgroudServe.utils;

/**
 * 定义返回给前端的规则
 * @param <T>
 */
public class ReturnsUtils<T> {
    private Integer code;
    private String msg;
    private T data;

    /*
    操作成功，但不返回然后数据
     */
    public ReturnsUtils() {
        this.code = 200;
        this.msg = "操作成功";
    }
    /*
    自定义返回的操作结果
     */
    public ReturnsUtils(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    /*
    返回操作信息和结果
     */
    public ReturnsUtils(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
