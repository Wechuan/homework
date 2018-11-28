package com.westos.Decorator;


//装饰模式
//给一类对象增加新的功能，装饰方法与具体的内部逻辑无关
interface Source{void mathod();}
public class Decorator implements Source {
    private Source source;
    public void decotate1(){
        System.out.println("decorate");
    }
    @Override
    public void mathod() {
        decotate1();
        source.mathod();
    }





}
