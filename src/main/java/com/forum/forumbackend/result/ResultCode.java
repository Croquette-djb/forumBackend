package com.forum.forumbackend.result;

public enum ResultCode {
    SUCCESS(200, "成功"),

    FAIL(500, "失败"),

    PASS_NOT_CORRECT(305, "密码不正确");


    private Integer code;

    private String msg;

    ResultCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}

