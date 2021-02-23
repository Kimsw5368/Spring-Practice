package com.kimsw.week04review;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableJpaAuditing
@SpringBootApplication
public class Week04reviewApplication {

    public static void main(String[] args) {
        SpringApplication.run(Week04reviewApplication.class, args);
    }

}
