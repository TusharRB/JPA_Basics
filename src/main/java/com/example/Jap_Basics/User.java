package com.example.Jap_Basics;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class User {

    @Id
    private int userId;
    private String name;
    private String age;
    private String mobile;

    public User(){

    }
    public User(int userId, String name, String age, String mobile) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.mobile = mobile;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}


