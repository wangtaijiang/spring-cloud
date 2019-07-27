/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.java8.stream.parallelstream;

import java.time.Duration;
import java.time.Instant;
import java.util.OptionalLong;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.stream.LongStream;

import org.junit.Test;

/**
 * @authur wtj
 * @date 2019/7/27    17:57
 */
public class TestForkJoin {
    @Test
    public void test1(){
        Instant start = Instant.now();
//        System.out.println(start.getNano());
        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinTask<Long> task = new ForkJoinCalculation(0, 100000000L);
        Long sum = pool.invoke(task);
        System.out.println(sum);
        Instant end = Instant.now();
//        System.out.println(end.getNano());
        int nano = Duration.between(start, end).getNano();
//        System.out.println(nano);
//        System.out.println(Duration.between(start, end).getSeconds());
        System.out.println(Duration.between(start, end).toMillis());
//        System.out.println(Duration.between(start, end).getUnits());
        System.out.println("=========================");
        /**
         * 普通for循环
         */
        start = Instant.now();
        long summ = 0;
        for (long i = 0; i <= 100000000L; i++) {
            summ += i;

        }
        System.out.println(summ);
        end = Instant.now();
        System.out.println(Duration.between(start, end).toMillis());

        /**
         * ForkJoin框架 适用于大数据量的计算，注意 临界值 大小的设定；
         */
    }
    /**
     * java8并行流
     */
    @Test
    public void test2(){
        OptionalLong reduce = LongStream.rangeClosed(0, 100000000L)
                .parallel() //可以通过parallel 和 sequential 在并行流和顺序流之间进行切换
                .reduce(Long::sum);
        //                .reduce(0,(x,y) -> x + y);
        System.out.println(reduce.getAsLong());
    }

}
