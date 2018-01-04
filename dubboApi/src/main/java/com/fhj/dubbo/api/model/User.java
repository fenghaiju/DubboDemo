package com.fhj.dubbo.api.model;

import java.io.Serializable;

/**
 * com.fhj.dubbo.api.model
 * 94936
 * 2018/1/3
 * 15:03
 * DubboDemo
 **/
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private long id;
    private String name;
    private int age;

    public User(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}
