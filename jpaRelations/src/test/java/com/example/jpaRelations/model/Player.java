package com.example.jpaRelations.model;

public class Player {

    private String name;
    private String position;
    private Team team;

    public Player() {}

    public Player(String name, String position, Team team) {
        this.name = name;
        this.team = team;
        this.position = position;
    }


    public String getName(){
        return this.name;
    }

    public String getPosition() {
        return this.position;
    }


    public Team getTeam() {
        return this.team;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setTeam(Team team) {
        this.team = team;
    }




}
