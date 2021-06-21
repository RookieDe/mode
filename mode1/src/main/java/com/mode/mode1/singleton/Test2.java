package com.mode.mode1.singleton;

/**
 * @author hongde
 * @version 1.0.0
 * @Description TODO
 * @ClassName Tested.java
 * @createTime 2021-06-18 11:50:00
 */
public class Test2 {

    public static void main(String[] args) {
        Singleton2 instance = Singleton2.getInstance();
        Singleton2 instance1 = Singleton2.getInstance();
        System.err.println(instance == instance1);

        int i = instance.hashCode();
        int i1 = instance1.hashCode();
        System.err.println("instance的hashCode"+i);
        System.err.println("instance1的hashCode"+i1);
    }

}

/**
 * 饿汉式（静态代码块）
 */
class Singleton2{

    /**
     * 1.定义一个私有构造，防止外部new
     */
    private Singleton2() {

    }

    /**
     * 2.定义一个内部的对象实例
     */
    private static Singleton2 singleton2;

    /**
     * 在静态代码块中创建实例
     */
    static {
        singleton2 = new Singleton2();
    }

    /**
     * 3.提供一个供外部调用的公有静态方法，返回实例对象
     * @return
     */
    public static Singleton2 getInstance(){
        return singleton2;
    }
}
