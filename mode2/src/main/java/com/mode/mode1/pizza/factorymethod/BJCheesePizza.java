package com.mode.mode1.pizza.factorymethod;

/**
 * @author hongde
 * @version 1.0.0
 * @Description TODO
 * @ClassName BJCheesePizza.java
 * @createTime 2021-06-29 11:22:00
 */
public class BJCheesePizza  extends Pizza{
    @Override
    public void prepare() {
        setName("北京奶酪披萨");
        System.err.println("北京的奶酪披萨，准备原材料");
    }
}
