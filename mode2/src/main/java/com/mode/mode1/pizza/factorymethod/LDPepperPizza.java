package com.mode.mode1.pizza.factorymethod;

/**
 * @author hongde
 * @version 1.0.0
 * @Description TODO
 * @ClassName LDPepperPizza.java
 * @createTime 2021-06-29 11:42:00
 */
public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦胡椒披萨");
        System.err.println("伦敦的胡椒披萨，准备原材料");
    }
}