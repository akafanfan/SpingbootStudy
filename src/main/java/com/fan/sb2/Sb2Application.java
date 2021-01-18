package com.fan.sb2;

import com.fan.sb2.initializer.SecondInitializer;
import com.fan.sb2.listener.SecondListener;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
@MapperScan("com.fan.sb2")
public class Sb2Application {

    public static void main(String[] args) {
        SpringApplication.run(Sb2Application.class, args);

//        第二种 方式 自定义系统初始化器启动
//        SpringApplication springApplication = new SpringApplication(Sb2Application.class);
//        springApplication.addInitializers(new SecondInitializer());
//        springApplication.run(args);

//        第二种 方式 自定义监听器
//        SpringApplication springApplication = new SpringApplication(Sb2Application.class);
//        springApplication.addListeners(new SecondListener());
//        springApplication.run();
    }
}
