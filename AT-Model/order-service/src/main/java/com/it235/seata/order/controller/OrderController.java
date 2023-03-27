package com.it235.seata.order.controller;

import com.it235.seata.order.model.Order;
import com.it235.seata.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author zhaojiatao
 * @version 1.0.0
 * @date 2023/3/8 16:21
 * @Description
 * @ClassName OrderController
 * Copyright: Copyright (c) 2022-2023 All Rights Reserved.
 */
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    /**
     * http://localhost:6770/order/create?userId=1&productId=2
     * @param userId
     * @param productId
     * @return
     */
    @GetMapping("order/create")
    public Boolean create(long userId , long productId){
        Order order = new Order();
        order.setCount(1)
                .setMoney(BigDecimal.valueOf(88))
                .setProductId(productId)
                .setUserId(userId)
                .setStatus(0);

        return orderService.create(order);
    }


}
