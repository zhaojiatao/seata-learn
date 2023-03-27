package com.it235.seata.business;

import com.it235.seata.business.client.OrderClient;
import com.it235.seata.business.client.StorageClient;
import io.seata.spring.annotation.GlobalTransactional;
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

/**
 * @author zhaojiatao
 * @version 1.0.0
 * @date 2023/3/8 16:18
 * @Description
 * @ClassName OrderServiceApplication
 * Copyright: Copyright (c) 2022-2023 All Rights Reserved.
 */
@RestController
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class BusinessServiceApplication extends SpringBootServletInitializer {

    @Autowired
    private OrderClient orderClient;

    @Autowired
    private StorageClient storageClient;

    /**
     * http://localhost:8888/buy?userId=1&productId=1
     * @param userId
     * @param productId
     * @return
     */
    @GetMapping("buy")
    @GlobalTransactional
    public String buy(long userId , long productId){
        orderClient.create(userId , productId);
        storageClient.changeStorage(userId , 1);
        return "ok";
    }


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BusinessServiceApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(BusinessServiceApplication.class, args);
    }
}
