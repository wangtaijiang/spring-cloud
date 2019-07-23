/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.easyexceltest.listen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

import lombok.extern.slf4j.Slf4j;

/**
 * @authur wtj
 * @date 2019/7/21    17:28
 */
@Slf4j
public class ExcelListener extends AnalysisEventListener {


    private List<Object> data = Collections.synchronizedList(new ArrayList<>());

    @Override
    public void invoke(Object object, AnalysisContext context) {
        log.info(context.getCurrentSheet().toString());
        data.add(object);
        if(data.size()>=100){
            doSomething();
            data = new ArrayList<Object>();
        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        doSomething();// 与invoke方法中if语句块里执行相同的操作
    }
    public void doSomething(){
        for (Object o:data) {
            System.out.println(o);
        }
    }
}