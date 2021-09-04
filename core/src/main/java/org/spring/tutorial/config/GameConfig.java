package org.spring.tutorial.config;

import org.spring.tutorial.GuessCount;
import org.spring.tutorial.MaxNumber;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfig {


    private int maxNumber = 20;
    private int guessCount = 8;

    @Bean
    @MaxNumber
    public int getMaxNumber() {
        return maxNumber;
    }

    @Bean
    @GuessCount
    public int getGuessCount() {
        return guessCount;
    }
}
