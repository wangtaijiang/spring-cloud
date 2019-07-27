/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.java8.stream;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;

/**
 * @authur wtj
 * @date 2019/7/27    16:20
 *
 */
public class TestTransaction
{
    List<Transaction> transactions = null;
    @Before
    public void before(){
        Trader a = new Trader("a","北京");
        Trader b = new Trader("b","上海");
        Trader c = new Trader("c","北京");
        Trader d = new Trader("d","北京");

        transactions = Arrays.asList(
                new Transaction(d,2017,300),
                new Transaction(c,2018,2000),
                new Transaction(c,2017,400),
                new Transaction(b,2018,450),
                new Transaction(b,2017,5000),
                new Transaction(a,2017,4000)

        );


    }
    /**
     * 题目1：找出2017年发生的所有交易，并按交易额排序（从低到高）
     * 题目2：交易员都来自那些城市；
     * 题目3：查找所有来自北京的交易员，并按姓名排序；
     * 题目4：返回所有交易员的姓名，并排序;
     * 题目5：又没有交易员在上海工作过；
     * 题目6：打印生活在北京的交易员的所有交易额；
     * 题目7:所有交易中，最高的交易额是多少？
     * 题目8：找到交易额最小的交易
     */
    @Test
    public void test1(){
        transactions.stream()
                .filter(transaction -> transaction.getYear() ==2017)
                .sorted((x,y)-> -Integer.compare(x.getValue(),y.getValue()))
                .forEach(System.out::println);
    }
    @Test
    public void test2(){
        Set<String> collect = transactions.stream()
                .map(t -> t.getTrader().getCity())
                .collect(Collectors.toSet());
        System.out.println(collect);
    }
    @Test
    public void test3(){
        Set<Trader> traders = transactions.stream()
                .map(t -> t.getTrader())
                .filter(x -> x.getCity().equals("北京"))
                .sorted((t1, t2) -> t1.getName().compareTo(t2.getName()))
                .collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(traders);

        transactions.stream()
                .map(transaction -> transaction.getTrader())
                .filter(trader -> trader.getCity().equals("北京"))
                .sorted((t1,t2) -> t1.getName().compareTo(t2.getName()))
                .distinct()
                .forEach(System.out::println);
    }
    @Test
    public void test4(){
        transactions.stream()
                .map(t -> t.getTrader().getName())
                .distinct()
                .sorted()
                .forEach(System.out::println);
        Set<String> collect = transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .collect(Collectors.toSet());
        System.out.println(collect);

        String reduce = transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("所有交易员名字：", String::concat);
        System.out.println(reduce);
        String collect1 = transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .collect(Collectors.joining(",","交易员名字:",""));
        System.out.println(collect1);
    }
    @Test
    public void test5(){
        boolean b = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .anyMatch(city -> "上海".equals(city));
        System.out.println(b);
        boolean 上海 = transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("上海"));
        System.out.println(上海);
    }
    @Test
    public void test6(){
        Optional<Integer> sum = transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("北京"))
                .map(transaction -> transaction.getValue())
//                .reduce((v1, v2) -> v1 + v2);
                .reduce(Integer::sum);
        System.out.println(sum.get());

        Integer collect = transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("北京"))
                .map(Transaction::getValue)
                .collect(Collectors.summingInt(value -> value));
        System.out.println(collect);

    }
    @Test
    public void test7(){
        Optional<Integer> collect = transactions.stream()
                .map(transaction -> transaction.getValue())
                .collect(Collectors.maxBy(Integer::compareTo));
        System.out.println(collect.get());

        Optional<Transaction> max = transactions.stream()
                .max((t1, t2) -> Integer.compare(t1.getValue(), t2.getValue()));
        System.out.println(max.get().getValue());
    }
    @Test
    public void test8(){
        Optional<Transaction> min = transactions.stream()
                .min((t1, t2) -> Integer.compare(t1.getValue(), t2.getValue()));
        System.out.println(min.get());
    }
}





