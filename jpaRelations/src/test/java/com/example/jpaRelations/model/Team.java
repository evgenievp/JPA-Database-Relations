package com.example.jpaRelations.model;

import jakarta.persistence.*;

import java.util.List;

public class Team {
    private String name;



    public void setName(String name) {
        this.name = name;
    }

    @Entity
    public static class Team {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;

        @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
        private List<Player> players;
    }
}
