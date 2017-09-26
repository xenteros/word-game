package com.github.xenteros.word.game.repository;

import com.github.xenteros.word.game.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by agurgul on 26.09.2017.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findOneByLogin(String login);
}
