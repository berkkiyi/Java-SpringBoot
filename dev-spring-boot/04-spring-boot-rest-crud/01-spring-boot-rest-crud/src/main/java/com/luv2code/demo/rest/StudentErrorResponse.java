package com.luv2code.demo.rest;

public class StudentErrorResponse {

    private int status;
    private String messaage;

    private long timeStamp;

    public StudentErrorResponse(){

    }

    public StudentErrorResponse(int status, String messaage, long timeStamp) {
        this.status = status;
        this.messaage = messaage;
        this.timeStamp = timeStamp;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessaage() {
        return messaage;
    }

    public void setMessaage(String messaage) {
        this.messaage = messaage;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
