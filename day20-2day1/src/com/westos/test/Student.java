package com.westos.test;

public class Student {
private String name;
private String sex;
private String loc;
private int sco;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public int getSco() {
        return sco;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", loc='" + loc + '\'' +
                ", sco=" + sco +
                '}';
    }

    public  void setSco(int sco) {
        this.sco = sco;
    }

    public Student(String name, String sex, String loc, int sco) {

        this.name = name;
        this.sex = sex;
        this.loc = loc;
        this.sco = sco;
    }



}
