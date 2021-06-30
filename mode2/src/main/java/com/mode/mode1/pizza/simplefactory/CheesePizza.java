package com.mode.mode1.pizza.simplefactory;

/**
 * @author hongde
 * @version 1.0.0
 * @Description 芝士披萨
 * @ClassName CheesePizza.java
 * @createTime 2021-06-24 17:33:00
 */
public class CheesePizza extends Pizza{

    @Override
    public void prepare() {
        System.err.println("给芝士披萨准备原材料~");
    }
}
