package com.mode.mode1.service;

import com.mode.mode1.entity.OperationEntity;

import java.math.BigDecimal;

/**
 *
 *
 * @author RookieDe
 * @ClassName Operation
 * @date 2020/6/11 18:29
 */
public interface Operation {

    BigDecimal getResult(OperationEntity operationEntity);
}
