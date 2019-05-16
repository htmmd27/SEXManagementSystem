package com.example.demo.entity;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serializableUID = 1L;
    private static String id;
    private String password;

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public static String getId() {
        return id;
    }
}
