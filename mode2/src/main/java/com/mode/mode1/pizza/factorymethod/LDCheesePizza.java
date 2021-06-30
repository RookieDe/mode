package com.mode.mode1.pizza.factorymethod;

/**
 * @author hongde
 * @version 1.0.0
 * @Description TODO
 * @ClassName LDCheesePizza.java
 * @createTime 2021-06-29 11:41:00
 */
public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦奶酪披萨");
        System.err.println("伦敦的奶酪披萨，准备原材料");
    }
}