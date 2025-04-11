package com.example.jpaRelations.model;

public class Player {

    private String name;
    private String position;
    private int number;
    private Team team;

    public Player() {}

    public Player(String name, String position, int number, Team tema) {
        this.name = name;
        this.team = tema;
        this.number = number;
        this.position = position;
    }


    public String getName(){
        return this.name;
    }

    public String getPosition() {
        return this.position;
    }

    public int getNumber() {
        return this.number;
    }

    public Team getTeam() {
        return this.team;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setTeam(Team team) {
        this.team = team;
    }




}
