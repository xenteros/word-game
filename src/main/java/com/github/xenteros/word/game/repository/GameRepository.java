package com.github.xenteros.word.game.repository;

import com.github.xenteros.word.game.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by agurgul on 27.09.2017.
 */
@Repository
public interface GameRepository extends JpaRepository<Game, Long>{

    Game findByBlackIsNull();
}
