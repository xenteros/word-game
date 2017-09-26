package com.github.xenteros.word.game;

import com.github.xenteros.word.game.model.User;
import com.github.xenteros.word.game.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by agurgul on 26.09.2017.
 */
@SpringBootApplication
@EnableJpaRepositories
public class Application implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        User one = new User();
        one.setLogin("one");
        one.setPassword("one");
        userRepository.save(one);

        User two = new User();
        two.setLogin("two");
        two.setPassword("two");
        userRepository.save(two);
    }
}
