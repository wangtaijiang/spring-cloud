/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.java8.optional;

import java.util.Optional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @authur wtj
 * @date 2019/7/27    19:21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewMan {
    private Optional<Women> women = Optional.empty();
}
