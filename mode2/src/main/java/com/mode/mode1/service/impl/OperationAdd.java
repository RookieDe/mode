package com.mode.mode1.service.impl;

import com.mode.mode1.entity.OperationEntity;
import com.mode.mode1.service.Operation;

import java.math.BigDecimal;

/**
 *
 *
 * @author RookieDe
 * @ClassName OperationAdd
 * @date 2020/6/11 18:32
 */
public class OperationAdd implements Operation {
    @Override
    public BigDecimal getResult(OperationEntity operationEntity) {
        return operationEntity.getNumberA().add(operationEntity.getNumberB());
    }
}
