package com.mode.mode1.pizza.factorymethod;

/**
 * @author hongde
 * @version 1.0.0
 * @Description TODO
 * @ClassName BJPepperPizza.java
 * @createTime 2021-06-29 11:41:00
 */
public class BJPepperPizza extends Pizza{
    @Override
    public void prepare() {
        setName("北京胡椒披萨");
        System.err.println("北京的胡椒披萨，准备原材料");
    }
}
