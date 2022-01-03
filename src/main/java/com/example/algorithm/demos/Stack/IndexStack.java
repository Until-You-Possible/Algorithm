package com.example.algorithm.demos.Stack;

import com.example.algorithm.demos.Array.Index;
import com.example.algorithm.demos.Array.IndexArray;

public class IndexStack {

    // 实现一个基本的栈
    public static void main(String[] args) {
        ArrayStack<Integer> arrayStack = new ArrayStack<Integer>();
        for (int i = 0; i < 2; i++) {
            arrayStack.push(i);
            System.out.println(arrayStack);
        }
        arrayStack.pop();
        System.out.println(arrayStack);
    }

}
