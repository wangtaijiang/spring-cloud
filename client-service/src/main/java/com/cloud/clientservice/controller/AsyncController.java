/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.clientservice.service.AsyncService;
import com.cloud.commons.response.ResponseMessageT;

import lombok.extern.slf4j.Slf4j;

/**
 * @authur wtj
 * @date 2019/6/13    11:54
 */
@RestController
@Slf4j
@RequestMapping("/async")
public class AsyncController {

    @Autowired
    AsyncService asyncService;

    /**
     * 测试 springBoot中 线程池的使用
     * @return
     */
    @RequestMapping("/test")
    public ResponseMessageT submit(){
        log.info("start submit");
        asyncService.excuteAsync();
        log.info("end submit");
        return ResponseMessageT.success("ok!");
    }
}
