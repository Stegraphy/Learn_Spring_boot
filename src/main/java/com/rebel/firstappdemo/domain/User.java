package com.rebel.firstappdemo.domain;

import org.springframework.beans.factory.annotation.Value;

/*
用户模型
 */
public class User {
    /*
    用户的名称
     */
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    //@Value("${spring.application.name}")
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
