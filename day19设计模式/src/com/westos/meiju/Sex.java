package com.westos.meiju;

public enum Sex {
    MALE("男"),

    FEMALE("女");
    private String cnName;



    private String cnName() {return this.cnName;}



    Sex(String cnName) {//枚举类的构造方法不能是公共的
        this.cnName=cnName;

    }
}
