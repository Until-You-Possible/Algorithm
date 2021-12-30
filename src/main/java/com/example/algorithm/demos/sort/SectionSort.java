package com.example.algorithm.demos.sort;

import java.util.Arrays;

public class SectionSort {

    public SectionSort() {}

    public static <E extends Comparable<E>> void sort(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find min index
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
                swap(arr, i, minIndex);
            }
        }
    }

    private static <E> void swap(E[] arr, int i, int j) {
        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;

    }

    public static <E> void main(String[] args) {
        Integer[] arr = {1,2,6,8,7,9};
        SectionSort.sort(arr);
        System.out.println("arr"+ Arrays.toString(arr));
    }

}
