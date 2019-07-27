/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.java8.time;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.Test;

/**
 * @authur wtj
 * @date 2019/7/27    20:23
 */
public class TestSimpleDateFormat {

    @Test
    public void test1() throws Exception {
        SimpleDateFormat yyyyMMdd = new SimpleDateFormat("yyyyMMdd");

        List<Future<Date>> futureList = new ArrayList<>();
        ExecutorService threadPool = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10; i++) {
           futureList.add( threadPool.submit(() ->{
               return yyyyMMdd.parse("20190727");
           }));
        }
        for (Future<Date> future : futureList) {
            System.out.println(future.get());
        }

    }

    @Test
    public void test2() throws Exception {

        List<Future<Date>> futureList = new ArrayList<>();
        ExecutorService threadPool = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10; i++) {
            futureList.add( threadPool.submit(() ->{
                return DateFormatThreadLocal.convert("20190727");
            }));
        }
        for (Future<Date> future : futureList) {
            System.out.println(future.get());
        }

    }

    /**
     * java8 时间API
     * @throws Exception
     */
    @Test
    public void test3() throws Exception {

//        SimpleDateFormat yyyyMMdd = new SimpleDateFormat("yyyyMMdd");

        DateTimeFormatter yyyyMMdd = DateTimeFormatter.ofPattern("yyyyMMdd");

        List<Future<LocalDate>> futureList = new ArrayList<>();
        ExecutorService threadPool = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10; i++) {
            futureList.add( threadPool.submit(() ->{
                return LocalDate.parse("20190727",yyyyMMdd);
            }));
        }
        for (Future<LocalDate> future : futureList) {
            System.out.println(future.get());
        }

    }
}
