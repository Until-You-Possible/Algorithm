package com.example.algorithm.demos.linearSearch;

public class Search {

    // linear search
    public static <E> int linearSearch (E[] data, E target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(target)) {
                return i;
            }
        }
        return -1;
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
