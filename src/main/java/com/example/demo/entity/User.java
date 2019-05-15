package com.example.demo.entity;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serializableUID = 1L;
    private long account;
    private String password;

    public long getAccount() {
        return account;
    }

    public void setAccount(long account) {
        this.account = account;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public String getPassword() {
        return password;
    }
}
