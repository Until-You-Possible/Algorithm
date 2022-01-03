package com.example.algorithm.demos.queue;

import com.example.algorithm.demos.Array.IndexArray;

public class ArrayQueue<E> implements Queue<E> {

    private IndexArray<E> array;

    public ArrayQueue(int capacity) {
        array = new IndexArray<>(capacity);
    }

    public ArrayQueue() {
        array = new IndexArray<>();
    }

    public int getCapacity() {
        return array.getCapacity();
    }

    @Override
    public void enqueue(E e) {
        array.addLast(e);
    }

    @Override
    public E dequeue() {
        return array.removeFirst();
    }

    @Override
    public E getFront() {
        return array.getFirst();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Queue: ");
        stringBuilder.append("front [");
        for (int i = 0; i < array.getSize(); i++) {
            stringBuilder.append(array.get(i));
            if (i != array.getSize() - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("] tail");
        return stringBuilder.toString();
    }
}
