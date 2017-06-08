package com.recognizer.classchecks.report.model.bean;

/**
 * @author Dongjun Zou
 * @Description ${todo}
 * @email 984147586@qq.com
 * @date 2017/6/1 22:55
 */

public class ReportResultBean {

    private String api_code;
    private boolean api_body;
    private String api_message;

    public ReportResultBean() {
    }

    public ReportResultBean(String api_code, boolean api_body, String api_message) {
        this.api_code = api_code;
        this.api_body = api_body;
        this.api_message = api_message;
    }

    public String getApi_code() {
        return api_code;
    }

    public void setApi_code(String api_code) {
        this.api_code = api_code;
    }

    public boolean getApi_body() {
        return api_body;
    }

    public void setApi_body(boolean api_body) {
        this.api_body = api_body;
    }

    public String getApi_message() {
        return api_message;
    }

    public void setApi_message(String api_message) {
        this.api_message = api_message;
    }

    @Override
    public String toString() {
        return "ReportResultBean{" +
                "api_code='" + api_code + '\'' +
                ", api_body=" + api_body +
                ", api_message='" + api_message + '\'' +
                '}';
    }
}
