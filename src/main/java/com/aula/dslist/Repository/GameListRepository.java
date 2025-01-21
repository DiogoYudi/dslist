package com.aula.dslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aula.dslist.entity.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
    
}
