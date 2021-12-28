package com.example.algorithm.collection.insertOrder;

import java.util.Arrays;

public class Insert {

    public void insertArray() {
        int[] list = new int[]{3, 1, 5, 6, 2, 8, 9};
        for (int i = 0; i < list.length; i++) {
            for (int j = i+1; j < list.length; j++) {
                if (list[i] > list[j]) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        // System.out.println("result" + Arrays.toString(list));
        // 关于插入排序
        int[] list2 = new int[]{3, 1, 5, 6, 2, 8, 9};
        for (int i = 0; i < list2.length; i++) {
            for (int j = i; j - 1 >= 0; j--) {
                swap(list2, j, j - 1);
            }
        }
        System.out.println("result2： " + Arrays.toString(list2));
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Insert insertObject = new Insert();
         insertObject.insertArray();
    }

}
