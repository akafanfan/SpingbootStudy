package com.fan.sb2.initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;

import java.util.HashMap;
import java.util.Map;

@Order(3)//定义顺序 3
public class ThirdInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        ConfigurableEnvironment environment = configurableApplicationContext.getEnvironment();
        Map<String, Object> map = new HashMap<>();
        map.put("key3","value3");
        MapPropertySource mapPropertySource = new MapPropertySource("thirdInitializer", map);
        environment.getPropertySources().addLast(mapPropertySource);
        System.out.println("run thirdInitializer");
    }
}
