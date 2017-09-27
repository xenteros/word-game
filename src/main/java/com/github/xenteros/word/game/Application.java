package com.github.xenteros.word.game;

import com.github.xenteros.word.game.model.User;
import com.github.xenteros.word.game.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.password.PasswordEncoder;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Objects;

import static springfox.documentation.builders.PathSelectors.regex;

/**
 * Created by agurgul on 26.09.2017.
 */
@SpringBootApplication
@EnableJpaRepositories
@EnableSwagger2
public class Application implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public Docket newsApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Spring Boot")
                .apiInfo(apiInfo())
                .select()
                .paths(regex("/api/.*"))
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot REST Api with Swagger")
                .description("Api allows modifying different values")
                .termsOfServiceUrl("http://www-03.ibm.com/software/sla/sladb.nsf/sla/bm?Open")
                .contact("Niklas Heidloff")
                .license("Apache License Version 2.0")
                .licenseUrl("https://github.com/IBM-Bluemix/news-aggregator/blob/master/LICENSE")
                .version("2.0")
                .build();
    }

    @Override
    public void run(String... args) throws Exception {
        User one = new User();
        one.setLogin("one");
        one.setPassword(passwordEncoder.encode("one"));
        one = userRepository.save(one);

        User two = new User();
        two.setLogin("two");
        two.setPassword(passwordEncoder.encode("two"));
        two = userRepository.save(two);
        System.out.println(Objects.toString(one));
        System.out.println(Objects.toString(two));
    }
}
