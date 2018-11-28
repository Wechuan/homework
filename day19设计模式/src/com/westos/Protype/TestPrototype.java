package com.westos.Protype;


import java.util.Date;

public class TestPrototype {
    //根据已经有的对象，创建新的对象
    //克隆
    public static void main(String[] args) throws CloneNotSupportedException {



    }

    private static void copy() throws CloneNotSupportedException {
        User user = new User();
        user.setName("张三");
        user.setAge(12);
        user.setBirthday(new Date());
        User cloneuser = (User) user.clone();
        cloneuser.setBirthday(new Date(28));
        System.out.println(user == cloneuser);//false  说明不知一个对象，克隆成功。
        System.out.println(cloneuser.getAge());//12
        System.out.println(cloneuser.getName());//张三
        //当对象属性非常多，希望新创建的对象属性从已有的复制过来
        // 而不是重新复制，使用原型模式（克隆）
        // 修改其中的属性
        System.out.println(cloneuser.getBirthday());
    }
}
