package com.mode.mode1.singleton;

/**
 * @author hongde
 * @version 1.0.0
 * @Description TODO
 * @ClassName Test6.java
 * @createTime 2021-06-18 17:40:00
 */
public class Test6 {

    public static void main(String[] args) {

    }
}

/**
 * 静态内部类
 */
class Singleton6{

    private Singleton6(){

    }

    /**
     * 静态内部类，只有在调用本类的时候，才会创建；
     * （类加载是线程安全的）
     */
    private static class SingletonInstance{
        private static final Singleton6 INSTANCE = new Singleton6();
    }

    public static Singleton6 getInstance(){
        Singleton6 instance = SingletonInstance.INSTANCE;
        return instance;
    }

}
