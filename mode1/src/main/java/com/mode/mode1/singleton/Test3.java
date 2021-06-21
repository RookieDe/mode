package com.mode.mode1.singleton;

/**
 * @author hongde
 * @version 1.0.0
 * @Description TODO
 * @ClassName Test3.java
 * @createTime 2021-06-18 16:37:00
 */
public class Test3 {

    public static void main(String[] args) {

    }
}

class Singleton3{
    private static Singleton3 singleton3;

    private Singleton3(){

    }

    /**
     * 提供一个静态公有方法，当时用到该方法时，才去创建instance
     * 即懒汉式
     * @return
     */
    public static Singleton3 getInstance(){
        if (singleton3 == null){
            return new Singleton3();
        }
        return singleton3;
    }
}
