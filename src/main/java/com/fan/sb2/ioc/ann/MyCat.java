package com.fan.sb2.ioc.ann;

import com.fan.sb2.ioc.xml.Animal;
import com.fan.sb2.ioc.xml.Cat;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author yangfan
 * @version 1.0
 * @date 2020/5/28 22:26
 * @description 实现 FactoryBean
 */
@Component
public class MyCat implements FactoryBean<Animal> {
    @Override
    public Animal getObject() throws Exception {
        return new Cat();
    }

    @Override
    public Class<?> getObjectType() {
        return Animal.class;
    }
}
