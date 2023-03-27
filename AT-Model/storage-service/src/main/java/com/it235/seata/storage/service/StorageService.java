package com.it235.seata.storage.service;

/**
 * @author zhaojiatao
 * @version 1.0.0
 * @date 2023/3/8 16:36
 * @Description
 * @ClassName StorageService
 * Copyright: Copyright (c) 2022-2023 All Rights Reserved.
 */
public interface StorageService {

    boolean updateUseNum(long productId,long used);

}
