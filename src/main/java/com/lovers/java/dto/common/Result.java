package com.lovers.java.dto.common;

import java.util.HashMap;
import java.util.Map;

public class Result {

    private boolean success;

    private String message;

    private Map<String,String> data=new HashMap<>();

    public Map<String, String> getData() {
        return data;
    }

    public void setData(Map<String, String> data) {
        this.data = data;
    }


    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
