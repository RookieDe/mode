package com.mode.mode1.pizza.simplefactory.order;

import com.mode.mode1.pizza.simplefactory.Pizza;
import com.mode.mode1.pizza.simplefactory.SimpleFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author hongde
 * @version 1.0.0
 * @Description TODO
 * @ClassName OrderPizza2.java
 * @createTime 2021-06-25 11:07:00
 */
public class OrderPizza2 {

    Pizza pizza = null;
    String orderType = "";
    public OrderPizza2() {

        do {
            orderType = getType();
            pizza = SimpleFactory.createPizza2(orderType);

            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("没有找到披萨种类！！");
                break;
            }
        } while (true);
    }

    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 披萨类型:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
