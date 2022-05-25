package com.lc.demo.bean;

/**
 * @ClassName Error
 * @Deacription TODO
 * @Author daier
 * @Date 2021/1/7 3:58
 * @Version 1.0
 **/
public class MyError {
    private String msg;

    public MyError() {
    }

    public MyError(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Error{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
