package com.example.algorithm.collection.linearSearch;

public class Search {

    // linear search
    public static int linearSearch (int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] data = {1,2,4,5,6,7,8,9};
        int res = Search.linearSearch(data, 9);
        System.out.println("res" + res);
    }

}
