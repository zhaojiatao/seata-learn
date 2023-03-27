package com.it235.seata.storage.controller;

import com.it235.seata.storage.service.StorageService;
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
public class StorageController {
    @Autowired
    private StorageService storageService;

    @GetMapping("storage/change")
    public Boolean changeStorage(long productId,int used){
        return storageService.updateUseNum(productId,used);
    }


}
