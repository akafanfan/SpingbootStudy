package com.fan.sb2.ioc.xml;

import lombok.Data;

@Data
public class HelloService {
    private Student student;

    private Animal animal;

    public String hello() {
        return animal.getName();
    }
}
