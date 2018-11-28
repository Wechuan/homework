package com.westos.Protype;

import javax.xml.crypto.Data;
import java.util.Date;

public class User implements Cloneable {
    //实现接口，
    //浅拷贝
    private String name;
    private  int age;
    private Data Birthday;


    public Data getBirthday() { return Birthday;
    }
    public void setBirthday(Date birthday) { Birthday = (Data) birthday;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    // 重写父类Obj的一个方法（克隆方法g）
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
