package com.mode.mode1.singleton;

/**
 * @author hongde
 * @version 1.0.0
 * @Description TODO
 * @ClassName Test4.java
 * @createTime 2021-06-18 17:05:00
 */
public class Test4 {

    public static void main(String[] args) {

    }
}

/**
 * 懒汉式（线程安全，同步方法）
 */
class Singleton4{
    private static Singleton4 singleton4;

    private Singleton4(){

    }

    /**
     * 提供一个静态公有方法，当时用到该方法时，才去创建instance
     * 即懒汉式
     * 加入synchronized，同一时间只能又一个线程进入
     * @return
     */
    public static synchronized Singleton4 getInstance(){
        if (singleton4 == null){
            return new Singleton4();
        }
        return singleton4;
    }
}
