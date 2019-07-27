/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.java8.time;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjusters;

import org.junit.Test;

/**
 * @authur wtj
 * @date 2019/7/27    20:49
 *
 * 1、LocalDate  LocalTime   LocalDateTime
 * 2、Instant:时间戳（以Unix元年：1970年1月1日00:00:00到某个时间之间的毫秒值）
 * 3、
 *  ①Duration:计算两个时间之间的时间间隔
 *  ②Period：计算两个日期之间的时间间隔
 *
 * 4、TemporalAdjuster:时间校正器
 *
 * 5、DateTimeFormatter:格式化时间/日期
 *
 * 6、ZonedDate、ZonedTime、ZonedDateTime
 */
public class TestLocalDateTime {


    //一、LocalDate  LocalTime   LocalDateTime
    @Test
    public void test1(){
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);


        LocalDateTime plusYears = now.plusYears(-2);
        System.out.println(plusYears);
        LocalDateTime localDateTime = now.minusYears(2);
        System.out.println(localDateTime);
        System.out.println("==============================");
        LocalDateTime dateTime = LocalDateTime.of(2013, 5, 11, 12, 12, 12);
        System.out.println(dateTime);
        System.out.println(dateTime.getYear());
        System.out.println(dateTime.getMonth());
        System.out.println(dateTime.getDayOfMonth());
        System.out.println(dateTime.getDayOfWeek());
        System.out.println(dateTime.getDayOfYear());
        System.out.println(dateTime.getHour());
        System.out.println(dateTime.getMinute());
        System.out.println(dateTime.getSecond());
        System.out.println(dateTime.getNano());
    }

    //二、Instant:时间戳（以Unix元年：1970年1月1日00:00:00到某个时间之间的毫秒值）
    @Test
    public void test2(){
        Instant now = Instant.now();//默认获取UTC 时区的时间，
        System.out.println("UTC时区:\t" + now);

        OffsetDateTime offsetDateTime = now.atOffset(ZoneOffset.ofHours(8));
        System.out.println("本地时区: \t" + offsetDateTime);

        System.out.println(now.toEpochMilli());//时间戳

        Instant instant = Instant.ofEpochSecond(1000);
        System.out.println(instant);
        System.out.println(Instant.ofEpochMilli(1564232843670L));

        //        Date date = new Date();
//        System.out.println(date);
//        long l = System.currentTimeMillis();
//        System.out.println(l);
    }

    //*  1、Duration:计算两个时间之间的时间间隔
    // *  2、Period：计算两个日期之间的时间间隔
    @Test
    public void test3() throws InterruptedException {
        Instant now = Instant.now();
        Thread.sleep(1000);

        Instant now1 = Instant.now();

        Duration between = Duration.between(now, now1);
        System.out.println(between);
        System.out.println(between.toMillis());
        System.out.println(between.getSeconds());
        System.out.println(between.getNano());
        System.out.println("=========================");

        LocalTime now2 = LocalTime.now();
        Thread.sleep(1000);
        LocalTime now3 = LocalTime.now();
        System.out.println(Duration.between(now2, now3).toMillis());

    }
    @Test
    public void test4(){
        LocalDate now = LocalDate.now();
        LocalDate of = LocalDate.of(2018, 4, 5);
        System.out.println(Period.between(now, of));
        System.out.println(Period.between(now, of).getYears());
        System.out.println(Period.between(now, of).getMonths());
        System.out.println(Period.between(now, of).getDays());
    }

    //TemporalAdjuster:时间校正器
    @Test
    public void test5(){
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDateTime localDateTime = now.withDayOfMonth(10);
        System.out.println(localDateTime);

        LocalDateTime with = now.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(with);
        LocalDateTime with1 = now.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println(with1);

        //自定义 下一个工作日
        LocalDateTime with2 = now.with((time) -> {
            LocalDateTime time1 = (LocalDateTime) time;
            DayOfWeek dayOfWeek = time1.getDayOfWeek();
            LocalDateTime localDateTime1 = LocalDateTime.now();
//            switch (dayOfWeek) {
//                case FRIDAY:
//                    localDateTime1 = time1.plusDays(3);
//                    break;
//                case MONDAY:
//                    localDateTime1 = time1.plusDays(7);
//                    break;
//                case SUNDAY:
//                    localDateTime1 = time1.plusDays(1);
//                    break;
//                case TUESDAY:
//                    localDateTime1 = time1.plusDays(6);
//                    break;
//                case SATURDAY:
//                    localDateTime1 = time1.plusDays(2);
//                    break;
//                case THURSDAY:
//                    localDateTime1 = time1.plusDays(4);
//                    break;
//                case WEDNESDAY:
//                    localDateTime1 = time1.plusDays(5);
//                    break;
//            }
            switch (dayOfWeek) {
                case FRIDAY:
                    return time1.plusDays(3);
                case MONDAY:
                    return time1.plusDays(7);
                case SUNDAY:
                    return time1.plusDays(1);
                case TUESDAY:
                    return time1.plusDays(6);
                case SATURDAY:
                    return time1.plusDays(2);
                case THURSDAY:
                    return time1.plusDays(4);
                case WEDNESDAY:
                    return time1.plusDays(5);
            }
            return localDateTime1;
        });
        System.out.println("=====================");
        System.out.println(with2);
    }

    //DateTimeFormatter:格式化时间/日期
    @Test
    public void test6(){
        LocalDateTime now = LocalDateTime.now();


        System.out.println(now.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println(now.format(DateTimeFormatter.ISO_DATE));
        System.out.println("============================");

        //自定义日期格式
        DateTimeFormatter yyyy年MM月dd日 = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");

        String format = dateTimeFormatter.format(now);
        System.out.println(format);
        System.out.println(yyyy年MM月dd日.format(now));
        System.out.println(now.format(yyyy年MM月dd日));

        TemporalAccessor parse = yyyy年MM月dd日.parse("2019年07月27日");
        System.out.println(parse);

        System.out.println(now.parse(format, dateTimeFormatter));
        System.out.println(now.parse("2019年07月27日 21:58:41", dateTimeFormatter));

    }

    //ZonedDate、ZonedTime、ZonedDateTime
    @Test
    public void test7(){
        System.out.println(ZoneId.getAvailableZoneIds());
    }
    @Test
    public void test8(){
        System.out.println("Iceland时区：\t" + LocalDateTime.now(ZoneId.of("Iceland")));

        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime iceland = now.atZone(ZoneId.of("Iceland"));
        System.out.println(iceland);

        LocalDateTime iceland1 = LocalDateTime.now(ZoneId.of("Iceland"));
        ZonedDateTime iceland2 = iceland1.atZone(ZoneId.of("Iceland"));
        ZonedDateTime iceland3 = iceland1.atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(iceland2);
        System.out.println(iceland3);

    }
}
