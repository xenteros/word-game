package com.github.xenteros.word.game.service.impl;

import com.github.xenteros.word.game.GameDTO;
import com.github.xenteros.word.game.exception.GameNotFoundException;
import com.github.xenteros.word.game.model.Game;
import com.github.xenteros.word.game.model.User;
import com.github.xenteros.word.game.repository.GameRepository;
import com.github.xenteros.word.game.repository.UserRepository;
import com.github.xenteros.word.game.security.LoggedUserUtils;
import com.github.xenteros.word.game.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sun.rmi.runtime.Log;

import java.time.LocalDate;
import java.util.HashSet;

/**
 * Created by agurgul on 27.09.2017.
 */
@Service
@Transactional
public class GameServiceImpl implements GameService {

    @Autowired
    private GameRepository gameRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public GameDTO joinGame() {

        Game game = gameRepository.findByBlackIsNull();
        if (game == null) {
            return createNewGame();
        }
        return null;
    }

    private GameDTO createNewGame() {

        User loggedUser = LoggedUserUtils.getLoggedUser();

        User white = userRepository.findOne(loggedUser.getId());
        Game game = new Game();
        game.setWhite(white);
        game.setCompleted(false);
        game.setCreatedOn(LocalDate.now());
        game.setRounds(new HashSet<>());
        game = gameRepository.save(game);
        return GameDTO.fromGame(game);
    }

    private Game joinUserToExistingGame() {

        Game existingGame = gameRepository.findByBlackIsNull();
        if (existingGame != null) {
            throw new GameNotFoundException();
        }

        return null;
    }
}
