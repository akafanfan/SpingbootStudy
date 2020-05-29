package com.fan.sb2.ioc.xml;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Data
@Component
public class HelloService {
    private Student student;

    @Autowired
    @Qualifier("myCat")
    private Animal animal;

    public String hello() {
        return animal.getName();
//        return "hello";
    }

}
