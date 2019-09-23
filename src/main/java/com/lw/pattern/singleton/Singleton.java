package com.lw.pattern.singleton;

/**
 * @author liwei-4
 * @description: 饿汉模式 在第一次引用该类的时候就创建对象实例，线程安全，但无法延迟加载
 * @date 2019-09-23
 */
public class Singleton {
    public static Singleton singleton = new Singleton();

    private Singleton(){
    }

    public Singleton getInstance(){
        return singleton;
    }
}
