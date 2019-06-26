/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.enums;

import lombok.Getter;

/**
 * @authur wtj
 * @date 2019/6/26    14:22
 */
public enum CountryEnum {

    ONE(1,"齐国"),
    TWO(2,"楚国"),
    THREE(3,"燕国"),
    FOUR(4,"韩国"),
    FIVE(5,"赵国"),
    SIX(6,"魏国");

    @Getter
    private Integer code;

    @Getter
    private String message;

    CountryEnum(Integer code,String message){
        this.code = code;
        this.message = message;
    }


    public static CountryEnum forEachCountryEnum(int code){
        CountryEnum[] countryEnums = CountryEnum.values();
        for (CountryEnum countryEnum : countryEnums) {
            if(code == countryEnum.getCode()){
                return countryEnum;
            }
        }
        return null;
    }
}
