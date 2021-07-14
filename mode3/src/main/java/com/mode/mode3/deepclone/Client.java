package com.mode.mode3.deepclone;

/**
 * @author hongde
 * @version 1.0.0
 * @Description TODO
 * @ClassName Client.java
 * @createTime 2021-07-14 14:37:00
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
// TODO Auto-generated method stub
        DeepProtoType p = new DeepProtoType();
        p.name = "宋江";
        p.deepCloneableTarget = new DeepCloneableTarget("大牛", "小牛");

        //方式1 完成深拷贝

		DeepProtoType p2 = (DeepProtoType) p.clone();

		System.out.println("p.name=" + p.name + "p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
		System.out.println("p2.name=" + p.name + "p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());

        //方式2 完成深拷贝
//        DeepProtoType p2 = (DeepProtoType) p.deepClone();
//
//        System.out.println("p.name=" + p.name + "p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
//        System.out.println("p2.name=" + p.name + "p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());
    }

}
