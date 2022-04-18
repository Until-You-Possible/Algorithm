package com.example.algorithm.demos.Stack;

import java.util.LinkedList;

public class linkedListStack<E> implements Stack<E> {

    private LinkedList<E> list;

    public void LinkedListStack() {
        list = new LinkedList<>();
    }

    @Override
    public void push(E e) {
        list.addFirst(e);
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }

    @Override
    public E peek() {
        return list.getFirst();
    }

    @Override
    public int getSize() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Stack: top");
        stringBuilder.append(list);
        return stringBuilder.toString();
    }



}
