package com.westos.Singleton;

public class Singleton2 {//懒汉模式，用到才创建，不用不创建
    private Singleton2(){

    }
    private static Singleton2 S2;
    //线程安全，上锁

    public static synchronized Singleton2 getInstance(){
        //通过判断，只new一次对象。
        if (S2 == null){
            S2 =new Singleton2();
        }
        return S2;
    }

}
