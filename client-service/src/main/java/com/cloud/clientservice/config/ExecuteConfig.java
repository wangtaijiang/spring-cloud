/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.config;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import com.cloud.clientservice.threadPoolTaskExecutors.MyThreadPoolTaskExecutor;

import lombok.extern.slf4j.Slf4j;

/**
 * @authur wtj
 * @date 2019/6/13    12:49
 */
@Configuration
@Slf4j
@EnableAsync
public class ExecuteConfig {

    @Bean
    public Executor asyncServiceExecutor(){

        log.info("start asyncServiceExecutor");
        ThreadPoolTaskExecutor executor = new MyThreadPoolTaskExecutor();
//        log.info("corePoolSize:{},maxPoolSize:{},threadPrefisName:{}",
//                executor.getCorePoolSize(),
//                executor.getMaxPoolSize(),
//                executor.getThreadNamePrefix());
        // 核心线程数
        executor.setCorePoolSize(5);
        // 最大线程数
        executor.setMaxPoolSize(5);
        // 队列大小
        executor.setQueueCapacity(9999);
        // 设置线程池中线程名称前缀
        executor.setThreadNamePrefix("async-service-");
        // rejection-policy: 当pool已经达到max size的时候，新任务处理策略
        // CALLER_RUNS: 不在新线程中执行，而是有调用者所在的线程来执行
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
         executor.initialize();
         return  executor;
    }
}
