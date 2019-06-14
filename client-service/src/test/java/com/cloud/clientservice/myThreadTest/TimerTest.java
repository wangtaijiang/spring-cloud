/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.myThreadTest;

/**
 * @authur wtj
 * @date 2019/6/14    15:35
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 关于定时器的应用 作用: 每隔一段固定的时间执行一段代码
 */
public class TimerTest {

    public static void main(String[] args) throws Exception {
        // 1.创建定时器
        Timer t = new Timer();
        // 2.指定定时任务
        t.schedule(new LogTimerTask(), new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").parse("2019-06-09 14:24:00 "
                + "000"), 10 * 1000);
        System.out.println(Thread.currentThread().getId()+"++++++++"+Thread.currentThread().getName());
    }
}

// 指定任务
class LogTimerTask extends TimerTask {

    @Override
    public void run() {
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(new Date()));
        System.out.println(Thread.currentThread().getId()+"++++++++"+Thread.currentThread().getName());
    }
}
