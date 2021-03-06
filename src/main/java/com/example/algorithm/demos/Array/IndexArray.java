package com.example.algorithm.demos.Array;

public class IndexArray<E> {
    private E[] data;
    private int size;

    public IndexArray(int capacity) {
        data = (E[]) new Object[capacity];
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

    // 时间复杂度 O(1)
    public void addLast(E e) {
        add(size, e);
    }

    // 时间复杂度 O(n)
    public void addFirst(E e) {
        add(0, e);
    }

    // 在array中 添加e到index
    // 时间复杂度 严格需要概率论严格的计算
    // O(n/2) = O(n)

    // 以上 添加的操作在算法复杂度上 总结可以是 O(n)的复杂度
    // 在算法中 考虑最糟糕的情况
    public void add(int index, E e) {
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
    public E get(int index) {
        // 检查参数
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("add failed, Required index >= 0 and index <= size");
        }
        return data[index];
    }

    public void set(int index, E e) {
        // 检查参数
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("add failed, Required index >= 0 and index <= size");
        }
        data[index] = e;
    }

    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(data[i])) {
                return true;
            }
        }
        return false;
    }

    public int find(E e) {
        if (contains(e)) {
            for (int i = 0; i < size; i++) {
                if (data[i].equals(e)) {
                  return i;
                }
            }
        }
        return -1;
    }

    public E remove(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("add failed, Required index >= 0 and index <= size");
        }
        E current = data[index];
        for (int i = 0; i < size; i++) {
            data[i] = data[i+1];
            size--;
            data[size] = null;
        }
        return current;
    }

    public E removeFirst() {
        return remove(0);
    }

    public E removeLast() {
        return remove(size - 1);
    }

    public void removeElement(E e) {
        int index = find(e);
        if (index != -1) {
            remove(index);
        }
    }

    public E getFirst() {
        return get(0);
    }

    public E getLast() {
        return get(size - 1);
    }

    // 将数组空间的容量变成newCapacity大小removeLast
    private void resize(int newCapacity){

        E[] newData = (E[])new Object[newCapacity];
        for(int i = 0 ; i < size ; i ++) {
            newData[i] = data[i];
        }
        data = newData;
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
