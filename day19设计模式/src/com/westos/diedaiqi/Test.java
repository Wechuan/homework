package com.westos.diedaiqi;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        //定义：以一种一致的对集合内的元素进行遍历，忽略底层数据结构
        //ArratList    底层    数组
        //LinkedList           链表
        //HashSet             数组+链表
        //Treeset       二叉搜索树->红黑树
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(3);
        integers.add(5);
        //两种遍历模式
        for (Integer integer : integers) {
            System.out.println(integer);
        }
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        }
    }

