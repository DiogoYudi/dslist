package com.aula.dslist.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aula.dslist.entity.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long>{ 
}
