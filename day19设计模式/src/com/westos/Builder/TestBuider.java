package com.westos.Builder;

public class TestBuider {
    public static void main(String[] args) {
        Person.PersonBuider personBuider = new Person.PersonBuider().name("Jim").sex("nan").height(185).weight(88);
        System.out.println(personBuider.toString());
        //PersonBuider{name='Jim', sex='nan', weight=88, height=185}

    }
}
