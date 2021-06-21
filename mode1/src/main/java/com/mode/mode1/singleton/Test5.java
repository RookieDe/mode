package com.mode.mode1.singleton;

/**
 * @author hongde
 * @version 1.0.0
 * @Description TODO
 * @ClassName Test5.java
 * @createTime 2021-06-18 17:20:00
 */
public class Test5 {

    public static void main(String[] args) {

    }
}

/**
 * 懒汉式（线程安全，同步代码块）
 */
class Singleton5{
    private static volatile Singleton5 singleton5;

    private Singleton5(){

    }

    /**
     * 提供一个静态公有方法，当时用到该方法时，才去创建instance
     * 即懒汉式 双重检查
     * 加入synchronized代码块和volatile，保证线程安全
     * @return
     */
    public static synchronized Singleton5 getInstance(){
        if (singleton5 == null){
            synchronized (Singleton5.class){
                if (singleton5 == null){
                    return new Singleton5();
                }
            }
        }
        return singleton5;
    }
}
