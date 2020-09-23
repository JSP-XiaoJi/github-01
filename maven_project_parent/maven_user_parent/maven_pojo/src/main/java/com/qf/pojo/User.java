package com.qf.pojo;

import lombok.Data;

@Data
public class User {
    private int uid;
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
