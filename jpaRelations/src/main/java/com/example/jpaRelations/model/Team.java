package com.example.jpaRelations.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
    private List<Player> players;

    public Team() {}

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }


}
