package com.aravind.ipldashboard.repository;

import com.aravind.ipldashboard.model.Team;

import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team,Long>{

    Team findByTeamName(String teamName);
    
    
}
