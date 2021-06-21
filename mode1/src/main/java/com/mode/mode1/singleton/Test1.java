package com.mode.mode1.singleton;

class Test1{
    public static void main(String[] args) {
        Singleton1 instance = Singleton1.getInstance();
        Singleton1 instance1 = Singleton1.getInstance();
        System.err.println(instance == instance1);

        int i = instance.hashCode();
        int i1 = instance1.hashCode();
        System.err.println("instance的hashCode"+i);
        System.err.println("instance1的hashCode"+i1);
    }
}

/**
 * 饿汉式（静态变量）
 */
class Singleton1{
    /**
     * 1.定义一个私有构造，防止外部new
     */
    private Singleton1(){

    }

    /**
     * 2.定义一个内部的对象实例
     */
    private final static Singleton1 instance = new Singleton1();

    /**
     * 3.提供一个供外部调用的公有静态方法，返回实例对象
     * @return
     */
    public static Singleton1 getInstance() {
        return instance;
    }
}
