package com.example.algorithm.collection;

import java.util.Arrays;

public class SectionSort {

    public SectionSort() {}

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find min index
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
                swap(arr, i, minIndex);
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,6,8,7,9};
        SectionSort.sort(arr);
        System.out.println("arr"+ Arrays.toString(arr));
    }

}
