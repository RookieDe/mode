package com.mode.mode1.entity;

import java.math.BigDecimal;

/**
 *
 *
 * @author RookieDe
 * @ClassName OperationEntity
 * @date 2020/6/11 18:34
 */
public class OperationEntity {
    private BigDecimal numberA;

    private BigDecimal numberB;

    public OperationEntity(BigDecimal numberA, BigDecimal numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }

    public BigDecimal getNumberA() {
        return numberA;
    }

    public void setNumberA(BigDecimal numberA) {
        this.numberA = numberA;
    }

    public BigDecimal getNumberB() {
        return numberB;
    }

    public void setNumberB(BigDecimal numberB) {
        this.numberB = numberB;
    }
}
