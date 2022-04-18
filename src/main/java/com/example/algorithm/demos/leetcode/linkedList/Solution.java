package com.example.algorithm.demos.leetcode.linkedList;

class Solution {
    public  ListNode removeElements(ListNode head, int val) {
        // 删除操作
        // 边界情况
        while (head != null && head.val == val) {
            ListNode deleteNode =  head;
            head = head.next;
            deleteNode.next = null;
        }
        if (head == null) {
            return null;
        }
        // 中间部分
        ListNode previous = head;
        while (previous.next != null) {
            // confirm which will be removed
            if (previous.next.val == val) {
                ListNode deleteNode = previous.next;
                previous.next = deleteNode.next;
                deleteNode = null;
            } else {
                previous = previous.next;
            }
        }
        return head;
    }
}
