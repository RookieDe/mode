package com.mode.mode1.pizza.simplefactory.order;

import com.mode.mode1.pizza.simplefactory.CheesePizza;
import com.mode.mode1.pizza.simplefactory.FruitPizza;
import com.mode.mode1.pizza.simplefactory.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author hongde
 * @version 1.0.0
 * @Description 订购披萨
 * @ClassName OrderPizza.java
 * @createTime 2021-06-24 17:41:00
 */
public class OrderPizza {

    public  OrderPizza(){
        Pizza pizza = null;
		String orderType;

		orderType = getType();
		if ("fruit".equals(orderType)) {
			pizza = new FruitPizza();
			pizza.setName("fruit");
		} else if ("cheese".equals(orderType)) {
			pizza = new CheesePizza();
			pizza.setName("cheese");
		} else {
			System.err.println("没有这个披萨！！ ");
			return;
		}
		//披萨制作
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

	}


    /**
     * 获取订购的披萨
     * @return
     */
    private String getType() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.err.println("请输入要购买的披萨：");
		try {
			String s = bufferedReader.readLine();
			return s;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
