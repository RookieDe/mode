package com.mode.mode1.pizza.factorymethod.order;

/**
 * @author hongde
 * @version 1.0.0
 * @Description TODO
 * @ClassName PizzaStore.java
 * @createTime 2021-06-30 09:58:00
 */
public class PizzaStore {

    public static void main(String[] args) {
        new OrderPizza(new LDFactory());
    }
}
