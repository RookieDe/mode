package com.mode.mode1.pizza.factorymethod.order;

import com.mode.mode1.pizza.factorymethod.LDCheesePizza;
import com.mode.mode1.pizza.factorymethod.LDPepperPizza;
import com.mode.mode1.pizza.factorymethod.Pizza;

/**
 * @author hongde
 * @version 1.0.0
 * @Description TODO
 * @ClassName LDFactory.java
 * @createTime 2021-06-30 09:58:00
 */
public class LDFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new LDCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
