package com.example.algorithm.demos.linkedList;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class linkedList<E> {

    private class Node {
        public E e;
        public Node next;
        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            // this得调用 在JDK1.7以上支持的新功能， 对构造方法的调用
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public  String toString() {
            return e.toString();
        }
    }

    private Node dummyHead;
    private int size;

    public  linkedList() {
        dummyHead =  new Node(null, null);
        size = 0;
    }

    public int getSize() {
        return size;
    }

    // 返回链表是否为空
    public Boolean isEmpty() {
        return size == 0;
    }
    // 向链表中间添加元素
    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("add failed, Illegal index");
        }
        // x
        if (index == 0) {
            addFirst(e);
        } else {
            // 上一个节点(非第一个)
            Node prev = dummyHead;
            // 循环来查找插入之前 最后的节点 从而确定他的next
            for (int i = 0; i < index; i++) {
                prev = prev.next;
            }
            // Node node = new Node(e);
            // node.next = prev.next;
            // prev.next = node;
            prev.next = new Node(e, prev.next);
            size++;
        }
    }
    // 向链表头部添加元素
    public void addFirst(E e) {
        add(0, e);
    }
    // 向末尾添加元素
    public void addLast(E e) {
        add(size, e);
    }
}




// 在Java中 "==" 在基本数据类型中，值内容，应用类型，地址
// 对于equals的话  如果重写了equals，就是比较值内容，不重写的话就是地址