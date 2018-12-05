package com.westos.day21;

public class Heroes {
    private int id;
    private String name;
    private String loc;
    private String sex;
    private int bir;
    private int dea;
    private int level;

    @Override
    public String toString() {
        return "Heroes{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", loc='" + loc + '\'' +
                ", sex='" + sex + '\'' +
                ", bir=" + bir +
                ", dea=" + dea +
                ", level=" + level +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getBir() {
        return bir;
    }

    public void setBir(int bir) {
        this.bir = bir;
    }

    public int getDea() {
        return dea;
    }

    public void setDea(int dea) {
        this.dea = dea;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Heroes(int id, String name, String loc, String sex, int bir, int dea, int level) {

        this.id = id;
        this.name = name;
        this.loc = loc;
        this.sex = sex;
        this.bir = bir;
        this.dea = dea;
        this.level = level;
    }
}
