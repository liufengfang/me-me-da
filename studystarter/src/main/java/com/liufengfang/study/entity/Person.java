package com.liufengfang.study.entity;

/**
 * Created by liufengfang on 2020/3/20.
 */
public class Person {
    private String name;

    public Person(String name) {
        System.err.println("com.liufengfang.study.entity.Person init");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
