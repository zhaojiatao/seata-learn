package com.it235.seata.storage.service.impl;

import com.it235.seata.storage.mapper.StorageMapper;
import com.it235.seata.storage.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zhaojiatao
 * @version 1.0.0
 * @date 2023/3/8 16:37
 * @Description
 * @ClassName StorageServiceImpl
 * Copyright: Copyright (c) 2022-2023 All Rights Reserved.
 */
@Slf4j
@Service
public class StorageServiceImpl implements StorageService {
    @Autowired
    private StorageMapper storageMapper;

    @Override
    @Transactional
    public boolean updateUseNum(long productId, long used) {
        System.out.println(100/0);
        int index=storageMapper.updateUsed(productId,used);
        return index>0;
    }
}
