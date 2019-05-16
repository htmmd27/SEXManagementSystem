package com.example.demo.entity;

import java.io.Serializable;

public class LogInBean implements Serializable {
    private static final long serializableUID = 2L;
    private boolean result;
    private String status;

    public void setResult(boolean result) {
        this.result = result;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public boolean getResult() {
        return result;
    }
}
