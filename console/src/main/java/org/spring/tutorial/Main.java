package org.spring.tutorial;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        log.info("guess the number game");

        SpringApplication.run(Main.class,args);
    }
}
