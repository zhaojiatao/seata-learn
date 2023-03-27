package com.it235.seata.storage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author zhaojiatao
 * @version 1.0.0
 * @date 2023/3/8 16:18
 * @Description
 * @ClassName OrderServiceApplication
 * Copyright: Copyright (c) 2022-2023 All Rights Reserved.
 */
@SpringBootApplication
@MapperScan("com.it235.seata.storage.mapper")
@EnableDiscoveryClient
@EnableFeignClients
public class StorageServiceApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(StorageServiceApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(StorageServiceApplication.class, args);
    }
}
