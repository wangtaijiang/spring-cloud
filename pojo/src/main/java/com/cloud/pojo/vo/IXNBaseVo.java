/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;

/**
 * @authur wtj
 * @date 2019/5/16    13:36
 */
public class IXNBaseVo implements Serializable {
    private boolean writeFlag = true;

    public boolean isWriteFlag() {
        return writeFlag;
    }

    public void setWriteFlag(boolean writeFlag) {
        this.writeFlag = writeFlag;
    }
}
