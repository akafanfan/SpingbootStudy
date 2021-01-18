package com.fan.sb2.async.thread;

import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * @author yangfan
 * @version 1.0
 * @date 2021/1/18 23:57
 * @description 配置线程池
 */

@Configuration
@EnableAsync
public class AsyncConfig  implements AsyncConfigurer {
    @Override
    public Executor getAsyncExecutor() {
        // 线程池
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        // 线程数
        taskExecutor.setCorePoolSize(50);
        // 最大线程数
        taskExecutor.setMaxPoolSize(200);
        // 线程队列最大线程数
        taskExecutor.setQueueCapacity(1000);
        // 初始化线程池
        taskExecutor.initialize();
        return AsyncConfigurer.super.getAsyncExecutor();
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        System.out.println("线程异常");
        return AsyncConfigurer.super.getAsyncUncaughtExceptionHandler();
    }
}