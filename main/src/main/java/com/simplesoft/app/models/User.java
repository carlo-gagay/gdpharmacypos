package com.simplesoft.app.models;

import java.time.LocalDateTime;

public class User {
    
    private int id;
    private String userName;
    private String password;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public User() {
    }

    public User(int id, String userName, String password, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
