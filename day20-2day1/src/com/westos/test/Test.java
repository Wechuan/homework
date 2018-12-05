package com.westos.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(me(list));

    }
    public static List<Integer>me(List<Integer> list){
        ArrayList<Integer> list2 = new ArrayList<>();
        for (Integer integer : list) {
            if (integer%2==0){
                list2.add(integer);
            }
        }
        return list2;
    }

}
