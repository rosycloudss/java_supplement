package com.lw.pattern.singleton;

/**
 * @author liwei-4
 * @description: 懒汉模式（线程不安全） 在工厂方法中对singleton进行null判断，如果为null 则创建对象实例，可以实现懒加载，
 * 但是当多个线程同时调用 getInstance()方法时，可能重复创建对象
 * @date 2019-09-23
 */
public class Singleton1 {
    public static Singleton1 singleton;

    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        if (singleton == null) {
            singleton = new Singleton1();
        }
        return singleton;
    }

}
