package com.it235.seata.order.service;

import com.it235.seata.order.model.Order;

/**
 * @author zhaojiatao
 * @version 1.0.0
 * @date 2023/3/8 16:23
 * @Description
 * @ClassName OrderService
 * Copyright: Copyright (c) 2022-2023 All Rights Reserved.
 */
public interface OrderService {
    boolean create(Order order);
}
