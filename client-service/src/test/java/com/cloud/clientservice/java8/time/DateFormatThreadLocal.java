/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.java8.time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @authur wtj
 * @date 2019/7/27    20:33
 */
public class DateFormatThreadLocal {
    private static ThreadLocal<DateFormat> df = new ThreadLocal<DateFormat>(){
        protected DateFormat initialValue(){
            return new SimpleDateFormat("yyyyMMdd");
        }
    };

    public static Date convert(String source) throws Exception{
        return df.get().parse(source);
    }

}
