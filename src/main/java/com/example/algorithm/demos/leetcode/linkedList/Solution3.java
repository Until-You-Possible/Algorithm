package com.example.algorithm.demos.leetcode.linkedList;

public class Solution3 {
    public  ListNode removeElements(ListNode head, int val) {
        // 边界判断
        if (head ==  null) {
            return null;
        }
       ListNode res = removeElements(head.next, val);
        if (head.val == val) {
            return res;
        } else {
            head.next = res;
            return head;
        }
        // 优化代码
        // head.next = removeElements(head.next, val)
        // return head.val == val ? head.next : head;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8};
//        System.out.println(sum(nums));
    }
}

