package com.westos.Singleton;

public class Singleton1 {//饿汉模式
    //单例1：让构造方法私有，自己new对象给调用
    private Singleton1(){

    }//构造方法私有
    private static final Singleton1 singleton1 = new Singleton1();
     public static Singleton1 getInstance() {
        return singleton1;
    }//给出实例去调用
}
