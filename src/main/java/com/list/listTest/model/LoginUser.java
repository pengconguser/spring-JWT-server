package com.list.listTest.model;

public class LoginUser {
    private String username;
    private String password;
    private Integer rememberMe=0;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Integer getRememberMe() {
        return rememberMe;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRememberMe(Integer rememberMe) {
        this.rememberMe = rememberMe;
    }
}
