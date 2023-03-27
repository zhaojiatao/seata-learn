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
 * @ClassName OrderClient
 * Copyright: Copyright (c) 2022-2023 All Rights Reserved.
 */
@FeignClient(name = "order-service")
@Component
public interface OrderClient {
    @GetMapping("order/create")
    Boolean create(@RequestParam("userId") long userId , @RequestParam("productId") long productId);
}
