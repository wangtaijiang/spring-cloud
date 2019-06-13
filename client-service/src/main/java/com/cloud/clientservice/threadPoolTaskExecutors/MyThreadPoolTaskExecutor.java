/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.threadPoolTaskExecutors;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.util.concurrent.ListenableFuture;

import lombok.extern.slf4j.Slf4j;

/**
 * @authur wtj
 * @date 2019/6/13    14:13
 */
@Slf4j
public class MyThreadPoolTaskExecutor extends ThreadPoolTaskExecutor {

//    @Value("${corePoolSize}")
//    private static int corePoolSize;
//
//    @Value("${maxPoolSize}")
//    private static int maxPoolSize;
//
//    @Value("${queueCapacity}")
//    private static int queueCapacity;
//
//    @Value("${threadNamePrefix}")
//    private static String threadNamePrefix;
//
//    public MyThreadPoolTaskExecutor(){
//        this.setCorePoolSize(corePoolSize);
//        this.setMaxPoolSize(maxPoolSize);
//        this.setQueueCapacity(queueCapacity);
//        this.setThreadNamePrefix(threadNamePrefix);
//    }

    /**
     * 此方法记录线程池当前情况，并将其信息如 任务总数、活跃线程数、队列中等待的任务数量打印出来
     * @param prefix
     */
    private void showThreadPoolInfo(String prefix){
        ThreadPoolExecutor threadPoolExecutor = getThreadPoolExecutor();
        if(null == threadPoolExecutor){
            return;
        }
        log.info("{},{},taskCount[{}],completedTaskCount[{}],activeCount[{}],queueSize[{}]",
                this.getThreadNamePrefix(),
                prefix,
                threadPoolExecutor.getTaskCount(),
                threadPoolExecutor.getCompletedTaskCount(),
                threadPoolExecutor.getCompletedTaskCount(),
                threadPoolExecutor.getQueue().size());
    }

    @Override
    public void execute(Runnable task){
        showThreadPoolInfo("1.do execute");
        super.execute(task);
    }

    @Override
    public void execute(Runnable task,long startTimeOut){
        showThreadPoolInfo("2.do execute");
        super.execute(task,startTimeOut);
    }

    @Override
    public Future<?> submit(Runnable task){
        showThreadPoolInfo("1.do submit");
        return super.submit(task);
    }

    @Override
    public <T> Future<T> submit(Callable<T> task){
        showThreadPoolInfo("2.do submit");
        return super.submit(task);
    }

    @Override
    public ListenableFuture<?> submitListenable(Runnable task){
        showThreadPoolInfo("1.do submitListenable");
        return super.submitListenable(task);
    }

    @Override
    public <T> ListenableFuture<T> submitListenable(Callable<T> task){
        showThreadPoolInfo("2.do submitListenable");
        return super.submitListenable(task);
    }

}
