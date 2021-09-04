package org.spring.tutorial.config;

import org.spring.tutorial.GuessCount;
import org.spring.tutorial.MaxNumber;
import org.spring.tutorial.MinNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config/game.properties")
public class GameConfig {


    @Value("${game.maxNumber}")
    private int maxNumber;
    @Value("${game.guessCount}")
    private int guessCount;

    @Value("${game.minNumber:10}")
    private int minNumber;


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

    @Bean
    @MinNumber
    public int getMinNumber(){
        return minNumber;
    }
}
