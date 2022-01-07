package com.example.algorithm.demos.queue;

// 对于循环队列的入队和出队 实现

import java.util.Objects;

public class LoopQueue<E> implements Queue<E> {

    private E[] data;
    private int front;
    private int tail;
    private int size;

    public LoopQueue (int capacity) {
        data = (E[]) new Object[capacity + 1];
        front = 0;
        tail = 0;
        size = 0;
    }

    public LoopQueue() {
        this(10);
    }

    public int getCapacity() {
        return data.length - 1;
    }


    @Override
    public void enqueue(E e) {
        // 如何判断当前的队列是否是满的
        // ["", "", "1", "2", "3", "4"]
        if ((tail + 1) % data.length == front) {
            resize(getCapacity() * 2);
        }
        data[tail] = e;
        tail = (tail + 1) % data.length;
        size++;
    }

    private void resize(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity + 1];
        for (int i = 0; i < size; i++) {
            newData[i] = data[(i + front) % data.length];
        }
        data = newData;
        front = 0;
        tail  = size;
    }


    @Override
    public E dequeue() {

        if (isEmpty()) {
            throw new IllegalArgumentException("can not dequeue from empty queue");
        }
        E result = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size--;
        if (size == getCapacity() / 4 && getCapacity() / 2 != 0) {
            resize(getCapacity() / 2);
        }
        return result;
    }

    @Override
    public E getFront() {
        return null;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return front == tail;
    }
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size= %d capacity= %d\n", size, getCapacity()));
        res.append("[");
        for (int i = 0; i != tail; i = (i + 1) % data.length) {
            res.append(data[i]);
            if ( (i + 1) % data.length != tail) {
                res.append(", ");
            }
        }
        res.append("]");
        return res.toString();
    }

}
