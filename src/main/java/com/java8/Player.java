package com.module1;

public class Player implements Comparable<Player>{
    private int ranking;
    private int age;
    private String name;

    public Player(int ranking, int age, String name) {
        this.ranking = ranking;
        this.age = age;
        this.name = name;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "ranking=" + ranking +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

//    @Override
//    public int compareTo(Player o) {
//        return Integer.compare(getRanking(),o.getRanking());
//    }

    @Override
    public int compareTo(Player o) {
        return Integer.compare(getAge(),o.getAge());
    }
}
