package com.example.algorithm.demos.Array;

public class IndexArray {
    private int[] data;
    private int size;

    /**
     *
     */
    public IndexArray(int capacity) {
        data =  new int[capacity];
        size = 0;
    }

    public IndexArray() {
        this(10);
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return data.length;
    }

    public Boolean isEmpty() {
        return  size == 0;
    }

    public void addLast(int e) {
        add(size, e);
    }

    public void addFirst(int e) {
        add(0, e);
    }

    // 在array中 添加e到index
    public void add(int index, int e) {
        // 查看是否还有容量
        if (size == data.length) {
            throw new IllegalArgumentException("params is full");
        }
        // 检查参数
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("add failed, Required index >= 0 and index <= size");
        }

        // 循环size， 先调整下标的值， 再设置值
        for (int i = size -1 ; i >= size; i--) {
            data[i+i] = data[i];
        }
        data[index] = e;
        size++;
    }

    // get data
    public int get(int index) {
        // 检查参数
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("add failed, Required index >= 0 and index <= size");
        }
        return data[index];
    }

    public int set(int index, int e) {
        // 检查参数
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("add failed, Required index >= 0 and index <= size");
        }
        data[index] = e;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("Array: size= %d capacity= %d\n", size, data.length));
        stringBuilder.append("[");
        for (int i = 0; i < size; i++) {
            stringBuilder.append(data[i]);
            if (i != size - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
