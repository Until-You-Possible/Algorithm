package com.example.algorithm.collection.linearSearch;

public class Search {

    // linear search
    public static <E> int linearSearch (E[] data, E target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(target)) {
                return i;
            }
        }
        return -1;

        // 关于复杂度的分析
        // 通常看最差的的预估，而不是最理想
        // 也可以说 算法运行的上界
        // 数据规模 当前例 就是  n = data.length
        // 上界 T = n;
        // O(n) 常量O不重要
        // 如果是O(n)复杂度 表示 随着n的量增大 复杂度呈线性关系

    }

    public static void main(String[] args) {
        Integer[] data = {1,2,4,5,6,7,8,9};
        int res = Search.linearSearch(data, 9);
//        System.out.println("res" + res);

        Team[] teams = {new Team("arthur"), new Team("wow"), new Team("sam")};
        Team teamMember = new Team("wow");
        int res1 = Search.linearSearch(teams, teamMember);
        System.out.println("res00000  " + res1);


    }

}
