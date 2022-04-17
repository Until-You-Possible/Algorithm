package com.example.algorithm.demos.linkedList;

import java.util.LinkedList;

public class index {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            linkedList.addFirst(i);
            System.out.println(linkedList);
        }
        linkedList.add(2, 666);
        System.out.println(linkedList);

        // 删除测试
//        linkedList.removeFirst();
//        System.out.println(linkedList);

        // 指定删除的位置
        linkedList.remove(5);
        System.out.println(linkedList);
    }
}
