package com.mode.mode1.pizza.factorymethod.order;

import com.mode.mode1.pizza.factorymethod.Pizza;

/**
 * @author hongde
 * @version 1.0.0
 * @Description TODO
 * @ClassName AbsFactory.java
 * @createTime 2021-06-30 09:46:00
 */
public interface AbsFactory {

    Pizza createPizza(String orderType);
}
