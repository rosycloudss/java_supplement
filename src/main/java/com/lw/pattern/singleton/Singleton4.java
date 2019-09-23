package com.lw.pattern.singleton;

/**
 * @author liwei-4
 * @description: 静态类部类
 * 线程安全的
 * @date 2019-09-23
 */
public class Singleton4 {
    private static class SingletonHolder {
        private static final Singleton4 INSTANCE = new Singleton4();
    }

    private Singleton4(){

    }
    public Singleton4 getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
