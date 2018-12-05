package com.westos.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestStudent {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("张", "男", "西安",89),
                new Student("李", "男", "西安",99),
                new Student("王", "女", "北京",45),
                new Student("赵", "女", "上海",25),
                new Student("周", "男", "北京",66));
        Map<Boolean, List<Student>> collect = students.stream().collect(Collectors.partitioningBy(s -> s.getSco() >= 50));
        List<Student> studentList = collect.get(false);//输出小于50分的
        collect.get(true);//输出大于等于50分的
        System.out.println(studentList);//输出小于50分的
    }
}
