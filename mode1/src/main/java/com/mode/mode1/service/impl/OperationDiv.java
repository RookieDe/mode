package com.mode.mode1.service.impl;

import com.mode.mode1.entity.OperationEntity;
import com.mode.mode1.service.Operation;

import java.math.BigDecimal;

/**
 *
 *
 * @author RookieDe
 * @ClassName OperationDiv
 * @date 2020/6/11 18:38
 */
public class OperationDiv implements Operation {
    @Override
    public BigDecimal getResult(OperationEntity operationEntity) {
        if (operationEntity.getNumberB().compareTo(BigDecimal.ZERO) == 0){
            throw new RuntimeException("被除数不能为0");
        }
        return operationEntity.getNumberA().divide(operationEntity.getNumberB(),9,BigDecimal.ROUND_HALF_UP);
    }
}
