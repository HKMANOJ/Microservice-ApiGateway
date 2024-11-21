package com.example.user_service.entity;


public class User {

    private int userId;
    private String userName;
    private String place;

    public User(int userId, String userName, String place) {
        this.userId = userId;
        this.userName = userName;
        this.place = place;
    }

    public User() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", place='" + place + '\'' +
                '}';
    }
}
