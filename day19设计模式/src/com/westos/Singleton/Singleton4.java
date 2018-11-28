package com.westos.Singleton;

public class Singleton4 {
    private Singleton4(){//懒汉模式，JVM管理内部类，不会出现线程安全
        System.out.println("构造");
    }
    static{
        System.out.println("S4");
    }
    //静态内部类
    private static class Hoder{
        static {
            System.out.println("Hoder ");
        }
        static Singleton4 S4 = new Singleton4();
    }
    public static Singleton4 getInstance() {
        return Hoder.S4;
    }
    public static void test(){
        System.out.println("test");
    }

    public enum  Singleton3 {
        //枚举类，实现单例,属于饿汉模式，
        S3;
    }
}
