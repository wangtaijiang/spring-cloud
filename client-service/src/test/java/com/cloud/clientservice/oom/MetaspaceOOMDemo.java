/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.oom;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @authur wtj
 * @date 2019/7/1    12:35
 */
public class MetaspaceOOMDemo {

    static class OOMTest{}
    public static void main(String[] args) {

        int i = 0;// 模拟计数多少次发生异常

        try{
            while (true){
                i++;
                Enhancer enhancer = new Enhancer();
                enhancer.setSuperclass(OOMTest.class);
                enhancer.setUseCache(false);
                enhancer.setCallback(new MethodInterceptor() {
                    @Override
                    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy)
                            throws Throwable {
                        return methodProxy.invokeSuper(o,args);
                    }
                });
                enhancer.create();
            }

        }catch (Throwable e){
            System.out.println("===========发生异常的次数：");
            e.printStackTrace();
        }

        /**
         * ===========发生异常的次数：
         * java.lang.OutOfMemoryError: Metaspace
         */
    }
}
