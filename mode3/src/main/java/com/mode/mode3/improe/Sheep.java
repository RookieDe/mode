package com.mode.mode3.improe;

import lombok.*;

/**
 * @author hongde
 * @version 1.0.0
 * @Description TODO
 * @ClassName Sheep.java
 * @createTime 2021-07-14 11:39:00
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Sheep implements Cloneable{

    private String name;

    private int age;

    private String color;

    private String address = "蒙古羊";

    //是对象, 克隆是会如何处理
    public Sheep friend;

    public Sheep(String name, int age, String color) {
        super();
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    protected Object clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep)super.clone();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        // TODO Auto-generated method stub
        return sheep;
    }
}
