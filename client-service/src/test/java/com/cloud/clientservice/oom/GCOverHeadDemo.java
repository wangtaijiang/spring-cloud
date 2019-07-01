/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * @authur wtj
 * @date 2019/7/1    10:44
 */
public class GCOverHeadDemo {
    public static void main(String[] args) {
        int i = 0;
        List<String > list = new ArrayList<>();

        try{
            while (true){
                list.add(String.valueOf(++i).intern());
            }
        }catch (Throwable throwable){
            System.out.println("************" + i +"**********");
            throwable.printStackTrace();
            throw throwable;
        }
        /**
         * java.lang.OutOfMemoryError: GC overhead limit exceeded
         */
    }
}
