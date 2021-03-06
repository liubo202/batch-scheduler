package com.asofdate.hauth.dto;

/**
 * Created by hzwy23 on 2017/7/4.
 */
public class LoginMsgDto {
    private String username;
    private String password;
    private String statusId;
    private String continueErrorCnt;
    private String flag;
    private String message;
    private Integer retCode;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getContinueErrorCnt() {
        return continueErrorCnt;
    }

    public void setContinueErrorCnt(String continueErrorCnt) {
        this.continueErrorCnt = continueErrorCnt;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getRetCode() {
        return retCode;
    }

    public void setRetCode(Integer retCode) {
        this.retCode = retCode;
    }

    @Override
    public String toString() {
        return "LoginMsgDto{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", statusId='" + statusId + '\'' +
                ", continueErrorCnt='" + continueErrorCnt + '\'' +
                ", flag='" + flag + '\'' +
                ", message='" + message + '\'' +
                ", retCode='" + retCode + '\'' +
                '}';
    }
}
