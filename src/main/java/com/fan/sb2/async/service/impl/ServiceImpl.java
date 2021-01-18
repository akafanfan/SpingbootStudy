package com.fan.sb2.async.service.impl;

import com.fan.sb2.async.service.IService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author yangfan
 * @version 1.0
 * @date 2021/1/18 23:23
 * @description
 */
@Service
public class ServiceImpl {

    @Async
    public void testAsync() {
        try {
            Thread.sleep(5000);
            System.out.println("处理数据...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
