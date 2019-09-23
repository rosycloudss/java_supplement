package com.lw.pattern.singleton;

/**
 * @author liwei-4
 * @description: 饿汉模式（双重检查锁）线程安全
 * @date 2019-09-23
 */
public class Singleton2 {

    public static volatile Singleton2 singleton;

    private Singleton2() {

    }
    public static Singleton2 getInstance() {
        if (singleton == null) {
            synchronized (Singleton2.class) {
                if (singleton == null) {
                    singleton = new Singleton2();
                }
            }
        }
        return singleton;
    }

}
