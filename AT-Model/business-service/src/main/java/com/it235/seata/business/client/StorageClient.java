package com.it235.seata.business.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhaojiatao
 * @version 1.0.0
 * @date 2023/3/9 14:13
 * @Description
 * @ClassName StorageClient
 * Copyright: Copyright (c) 2022-2023 All Rights Reserved.
 */
@FeignClient(name = "storage-service")
@Component
public interface StorageClient {
    @GetMapping("storage/change")
    Boolean changeStorage(@RequestParam("productId") long productId , @RequestParam("used") long used);
}
