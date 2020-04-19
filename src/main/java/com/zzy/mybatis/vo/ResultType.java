package com.zzy.mybatis.vo;

public enum ResultType {
    SUCCESS("1"), FAIL("0");

    private String code;

    ResultType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
