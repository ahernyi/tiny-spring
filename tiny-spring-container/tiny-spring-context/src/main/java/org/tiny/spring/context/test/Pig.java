package org.tiny.spring.context.test;

/**
 * Created by LiuYi on 2018/7/13 15:42
 */
public class Pig {

    public Pig() {}

    public Pig(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}