package com.me.sweet.Response;

/**
 * Created by weisw.shi on 2017/7/16.
 */
public class BaseResponse {

    private int code;

    private String tips;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }
}
