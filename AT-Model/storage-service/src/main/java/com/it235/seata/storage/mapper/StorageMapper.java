package com.it235.seata.storage.mapper;

import com.it235.seata.storage.model.Storage;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author zhaojiatao
 * @version 1.0.0
 * @date 2023/3/8 16:39
 * @Description
 * @ClassName StorageMapper
 * Copyright: Copyright (c) 2022-2023 All Rights Reserved.
 */
@Repository
public interface StorageMapper extends Mapper<Storage> {

    @Update("update tab_storage set total=total-#{currentUsed},used=used+#{currentUsed} where product_id=#{productId}")
    int updateUsed(@Param("productId") long productId,
                   @Param("currentUsed") long currentUsed);
}
