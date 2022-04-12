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

    private Node head;
    private int size;

    public  linkedList() {
        head =  null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    // 返回链表是否为空
    public Boolean isEmpty() {
        return size == 0;
    }
}

// 在Java中 "==" 在基本数据类型中，值内容，应用类型，地址
// 对于equals的话  如果重写了equals，就是比较值内容，不重写的话就是地址