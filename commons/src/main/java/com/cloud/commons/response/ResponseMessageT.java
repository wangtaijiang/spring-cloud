
/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.commons.response;

import java.util.Map;

/**
 * @authur wtj
 * @date 2019/5/6    16:25
 */
public class ResponseMessageT<T> {
    public static String OK = "ok";
    public static String FAIL = "fail";
    public static String NEED_LOGIN = "need-login";
    public static String NO_AUTH = "no-auth";
    public static String CONFIRM = "confirm";

    private String status;
    private String message;
    private T data;

    /**
     * default empty constructor
     */
    public ResponseMessageT() {
        // do nothing
    }

    public ResponseMessageT(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public ResponseMessageT(String status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public static ResponseMessageT<Object> success(String message) {
        return new ResponseMessageT<Object>(ResponseMessageT.OK, message, null);
    }

    public static <V> ResponseMessageT<V> success(V data) {
        return new ResponseMessageT<V>(ResponseMessageT.OK, null, data);
    }

    public static <K> ResponseMessageT<K> success(String message, K data) {
        return new ResponseMessageT<K>(ResponseMessageT.OK, message, data);
    }

    public static ResponseMessageT<Object> fail(String message) {
        return new ResponseMessageT<Object>(ResponseMessageT.FAIL, message);
    }

    public static <E> ResponseMessageT<E> fail(String message, E data) {
        return new ResponseMessageT<E>(ResponseMessageT.FAIL, message, data);
    }

    public static <M> ResponseMessageT<Map<String, M>> fail(Map<String, M> data) {
        return new ResponseMessageT<Map<String, M>>(ResponseMessageT.FAIL, null, data);
    }

    public static ResponseMessageT<Map<String, String>> fail(String message, Map<String, String> data) {
        return new ResponseMessageT<Map<String, String>>(ResponseMessageT.FAIL, message, data);
    }

    public static ResponseMessageT<Object> confirm(String message) {
        return new ResponseMessageT<Object>(ResponseMessageT.CONFIRM, message);
    }

    public static ResponseMessageT<Object> needLogin(String message) {
        return new ResponseMessageT<Object>(ResponseMessageT.NEED_LOGIN, message);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
