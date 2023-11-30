package ru.hse.starthub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("ru.hse.starthub.model")
public class StarthubApplication {

    public static void main(String[] args) {
        SpringApplication.run(StarthubApplication.class, args);
    }

}
