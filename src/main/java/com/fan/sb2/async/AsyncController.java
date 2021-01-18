package com.fan.sb2.async;

import com.fan.sb2.async.service.IService;
import com.fan.sb2.async.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangfan
 * @version 1.0
 * @date 2021/1/18 23:19
 * @description
 */
@RestController
@RequestMapping("/demo")
public class AsyncController {
    @Autowired
    private ServiceImpl serviceImpl;


    @RequestMapping("/hello")
    public String hello() {
        serviceImpl.testAsync();
        return "hello world";
    }

}
