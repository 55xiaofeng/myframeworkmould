package com.myframework.code.myexception;

public class AppRunningTimeExcepiton extends RuntimeException{
    private String message;

    public AppRunningTimeExcepiton(String msg)
    {
        this.message = msg;
    }
    public String getMessage() {
        return message;
    }
}
