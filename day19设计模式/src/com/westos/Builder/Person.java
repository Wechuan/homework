package com.westos.Builder;

public class Person {
    private String name;
    private String sex;
    private Integer weight;
    private Integer height;

    public Person(String name, String sex, Integer weight, Integer height) {

    }

    //建造器
    public static class PersonBuider{
        private String name;
        private String sex;
        private Integer weight;
        private Integer height;
        //返回值不再是void 而是建造器本身
        public PersonBuider name(String name){
            this.name=name;
            return this;
        }
        public PersonBuider sex(String sex){
            this.sex=sex;
            return this;
        }
         public PersonBuider weight(Integer weight){
            this.weight=weight;
            return this;
            }

        @Override
        public String toString() {
            return "PersonBuider{" +
                    "name='" + name + '\'' +
                    ", sex='" + sex + '\'' +
                    ", weight=" + weight +
                    ", height=" + height +
                    '}';
        }

        public PersonBuider height(Integer height){
                this.height=height;
                return this;
          }
          public Person build(){
            //需要的信息收集齐了
            return new Person(this.name,this.sex,this.weight,this.height);
        }
    }
    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public Integer getWeight() {
        return weight;
    }

    public Integer getHeight() {
        return height;
    }
}
