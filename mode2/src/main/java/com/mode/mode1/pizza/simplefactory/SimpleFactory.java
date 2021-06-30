package com.mode.mode1.pizza.simplefactory;

/**
 * @author hongde
 * @version 1.0.0
 * @Description TODO
 * @ClassName SimpleFactory.java
 * @createTime 2021-06-25 11:08:00
 */
public class SimpleFactory {

    public Pizza createPizza(String orderType) {

        Pizza pizza = null;

        if ("fruit".equals(orderType)) {
            pizza = new FruitPizza();
            pizza.setName("greek");
        } else if ("cheese".equals(orderType)) {
            pizza = new CheesePizza();
            pizza.setName("cheese");
        }

        return pizza;
    }

    /**
     * 简单工厂模式 也叫 静态工厂模式
     * @param orderType
     * @return
     */
    public static Pizza createPizza2(String orderType) {

        Pizza pizza = null;

        if ("fruit".equals(orderType)) {
            pizza = new FruitPizza();
            pizza.setName("fruit");
        } else if ("cheese".equals(orderType)) {
            pizza = new CheesePizza();
            pizza.setName("cheese");
        }

        return pizza;
    }

}
