package com.fan.sb2.ioc.ann;

import com.fan.sb2.ioc.xml.Animal;
import com.fan.sb2.ioc.xml.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yangfan
 * @version 1.0
 * @date 2020/5/28 22:20
 * @description 注解方式配置bean介绍-配置类
 */
@Configuration
public class BeanConfiguration {

    @Bean("dog")
    Animal getDog(){
        return new Dog();
    }

}
