package com.example.algorithm.demos.Stack;


import com.example.algorithm.demos.Array.IndexArray;

public class ArrayStack<E> implements Stack<E> {

    IndexArray<E> array;

    public ArrayStack(int capacity) {
        array = new IndexArray<>();
    }

    public ArrayStack() {
        array = new IndexArray<>();
    }


    @Override
    public void push(E e) {
        array.addLast(e);
    }

    @Override
    public E peek() {
        return array.getLast();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    public int getCapacity() {
        return array.getCapacity();
    }

    @Override
    public E pop() {
       return array.removeLast();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Stack: ");
        stringBuilder.append("[");
        for (int i = 0; i < array.getSize(); i++) {
            stringBuilder.append(array.get(i));
            if (i != array.getSize() - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("], top");
        return stringBuilder.toString();
    }

}
