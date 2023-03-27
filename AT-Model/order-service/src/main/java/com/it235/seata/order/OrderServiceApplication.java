package com.it235.seata.order;

import com.it235.seata.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.spring.annotation.MapperScan;

import java.math.BigDecimal;

/**
 * @author zhaojiatao
 * @version 1.0.0
 * @date 2023/3/8 16:18
 * @Description
 * @ClassName OrderServiceApplication
 * Copyright: Copyright (c) 2022-2023 All Rights Reserved.
 */
@SpringBootApplication
@MapperScan("com.it235.seata.order.mapper")
@EnableDiscoveryClient
@EnableFeignClients
public class OrderServiceApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(OrderServiceApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }
}
