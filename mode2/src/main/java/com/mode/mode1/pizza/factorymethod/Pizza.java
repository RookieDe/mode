package com.mode.mode1.pizza.factorymethod;

/**
 * @author hongde
 * @version 1.0.0
 * @Description TODO
 * @ClassName Pizza.java
 * @createTime 2021-06-29 11:42:00
 */
public abstract class Pizza {
    /**
     * 披萨名称
     */
    protected String name;

    /**
     * 准备阶段制作方法
     */
    public abstract void prepare();

    /**
     * 烧烤制作披萨
     */
    public void bake() {
        System.out.println(name + " baking;");
    }

    /**
     *  切披萨
     */
    public void cut() {
        System.out.println(name + " cutting;");
    }

    /**
     * 盒子打包
     */
    public void box() {
        System.out.println(name + " boxing;");
    }


    public void setName(String name) {
        this.name = name;
    }
}
