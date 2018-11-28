package com.westos.meiju;

public class Enum1 {

    //枚举类
    //一定的对象，只有固定的几个对象。如：性别，星期
    public static void main(String[] args) {
        System.out.println(Sex.MALE.ordinal());//获取枚举对象的序号
        System.out.println(Sex.FEMALE.ordinal());

        System.out.println(Sex.MALE.name());//把枚举对象转还为字符串

        System.out.println(String.valueOf("MALE")==Sex.MALE.name());//把字符串转换为枚举，要再枚举中有。
        for (int i = 0; i < Sex.values().length; i++) {
            System.out.println(Sex.values()[i]);//遍历枚举对象
        }

    }
}
