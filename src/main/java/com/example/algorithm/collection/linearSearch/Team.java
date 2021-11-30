package com.example.algorithm.collection.linearSearch;


public class Team {

    private final String name;

    public Team(String name) {
        this.name = name;
    }

    // equal可以更具自己的业务继续增加逻辑

    @Override
    public boolean equals(Object team) {
        if (team == null) {
            return false;
        }
        if (this == team) {
            return true;
        }
        if (this.getClass() != team.getClass()) {
            return false;
        }
        Team another = (Team) team;
        return this.name.equals(another.name);
    }

}
