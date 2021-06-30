package com.mode.mode1.pizza.simplefactory;

/**
 * @author hongde
 * @version 1.0.0
 * @Description 水果披萨
 * @ClassName GreekPizza.java
 * @createTime 2021-06-24 17:35:00
 */
public class FruitPizza extends Pizza{


    @Override
    public void prepare() {
        System.err.println("给水果披萨准备原材料~");
    }
}
