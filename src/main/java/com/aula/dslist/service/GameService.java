package com.aula.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aula.dslist.dto.GameMinDTO;
import com.aula.dslist.repository.GameRepository;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        return gameRepository.findAll().stream().map(x -> new GameMinDTO(x)).toList();
    }
}
