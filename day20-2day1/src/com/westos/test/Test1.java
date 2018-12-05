package com.westos.test;

import java.util.Arrays;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        list.stream().filter(x -> x % 2 == 0).forEach(s-> System.out.println(s));
    }
}
