package com.aula.dslist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aula.dslist.dto.GameDTO;
import com.aula.dslist.dto.GameMinDTO;
import com.aula.dslist.service.GameService;

@RestController
@RequestMapping("/games")
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        return gameService.findAll();
    }

    @GetMapping(value="/{id}")
    public GameDTO findById(@PathVariable Long id){
        return gameService.findById(id);
    }
}
