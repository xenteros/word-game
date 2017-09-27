package com.github.xenteros.word.game.controller;

import com.github.xenteros.word.game.dto.GameDTO;
import com.github.xenteros.word.game.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by agurgul on 27.09.2017.
 */
@RestController
@RequestMapping("/api/game")
public class GameController {

    @Autowired
    private GameService gameService;

    @PostMapping("/join-game")
    public GameDTO joinGame() {
        return gameService.joinGame();
    }

    @GetMapping
    public String ok() {
        return "OK";
    }
}
