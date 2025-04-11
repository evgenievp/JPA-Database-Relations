package com.example.jpaRelations.jpaInterfaces;

import com.example.jpaRelations.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
    void saveAll();

}
