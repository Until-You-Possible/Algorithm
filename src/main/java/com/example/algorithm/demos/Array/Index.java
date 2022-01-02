package com.example.algorithm.demos.Array;

public class Index {

    public static void main(String[] args) {
        IndexArray indexArray = new IndexArray(20);
        for (int i = 0;i < 10; i++) {
            indexArray.addLast(i);
        }
        System.out.println(indexArray);
        indexArray.add(1, 300);
        System.out.println(indexArray);
        indexArray.addFirst(-1);
        System.out.println(indexArray);
    }
}
