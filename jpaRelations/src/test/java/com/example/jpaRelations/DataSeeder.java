package com.example.jpaRelations;

import com.example.jpaRelations.jpaInterfaces.PlayerRepository;
import com.example.jpaRelations.jpaInterfaces.TeamRepository;
import com.example.jpaRelations.model.Player;
import com.example.jpaRelations.model.Team;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataSeeder {
    private final TeamRepository teamRepo;
    private final PlayerRepository playerRepo;


    public DataSeeder(TeamRepository t, PlayerRepository p) {
        this.teamRepo = t;
        this.playerRepo = p;

    }

    @PostConstruct
    public void init() {
        Team barca = new Team();
        barca.setName("Barcelona");

        Team real = new Team();
        real.setName("Real Madrid");

        teamRepo.saveAll(List.of(barca, real));

        Player p1 = new Player("Messi", "Forward", barca);
        Player p2 = new Player("Modric", "Midfield", real);

        playerRepo.saveAll(List.of(p1, p2));

        playerRepo.save(p1);
        playerRepo.save(p2);
        teamRepo.save(barca);
        teamRepo.save(real);

        System.out.println("Data saved.");
    }
}
