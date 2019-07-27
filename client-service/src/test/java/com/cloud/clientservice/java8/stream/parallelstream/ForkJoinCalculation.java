/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.java8.stream.parallelstream;

import java.util.concurrent.RecursiveTask;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @authur wtj
 * @date 2019/7/27    17:45
 *
 * ForkJoin框架
 */
@Data
@AllArgsConstructor
public class ForkJoinCalculation extends RecursiveTask<Long> {

    private long start;
    private long end;

    private static final long THRESHOLD = 10000;//临界值

    @Override
    protected Long compute() {
        long length = end - start;
        if(length < THRESHOLD){
            long sum = 0;
            for(long i = start; i <= end; i++){
                sum += i;
            }
            return sum;
        }else {
            long middle = (start + end) / 2;
            ForkJoinCalculation left = new ForkJoinCalculation(start,middle);
            left.fork();//拆分子任务，同时压入线程队列
            ForkJoinCalculation right = new ForkJoinCalculation(middle + 1, end);
            right.fork();
            Long leftJoin = left.join();
            Long rightJoin = right.join();
            return leftJoin + rightJoin;
        }
    }
}
