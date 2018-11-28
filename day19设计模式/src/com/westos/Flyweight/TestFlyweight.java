package com.westos.Flyweight;

public class TestFlyweight {
    public static void main(String[] args) {
        //享元模式，
        //提倡多次使用已有的对象，而不是创建新的对象
        //如 Interger的享元范围是-128/127
        //Byte Short long Charater.
        System.out.println(Integer.valueOf(10) == Integer.valueOf(10));
        System.out.println(Integer.valueOf(100) == Integer.valueOf(100));
        System.out.println(Integer.valueOf(1000) == Integer.valueOf(1000));

    }
}
