package com.example.jpaRelations.jpaInterfaces;


import com.example.jpaRelations.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {}
