package com.fan.sb2.ioc.xml;

import lombok.Data;

import java.util.List;

@Data
public class Student {
    private String name;

    private Integer age;

    private List<String> classList;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", classList=" + String.join(",",classList) +
                '}';
    }
}
