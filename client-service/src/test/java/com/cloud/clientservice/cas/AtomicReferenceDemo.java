/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.cas;

import java.util.concurrent.atomic.AtomicReference;

import org.junit.Test;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @authur wtj
 * @date 2019/6/25    16:27
 */
@Data
@AllArgsConstructor
class User{
    String userName;
    int age;
}
public class AtomicReferenceDemo {

    @Test
    public void testAtomicReference(){
        User zhangsan = new User("zhangsan",22);
        User lisi = new User("lisi",25);

        AtomicReference<User> atomicReference = new AtomicReference<>();
        atomicReference.set(zhangsan);

        System.out.println(atomicReference.compareAndSet(zhangsan, lisi) + "\t " + atomicReference.get().toString());
        System.out.println(atomicReference.compareAndSet(zhangsan, lisi) + "\t " + atomicReference.get().toString());


    }
}
