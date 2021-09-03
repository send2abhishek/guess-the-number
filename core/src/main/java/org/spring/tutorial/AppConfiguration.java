package org.spring.tutorial;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.spring.tutorial")
public class AppConfiguration {

    @Bean
    public NumberGenerator getNumberGenerator() {
        return new NumberGeneratorImpl();
    }

    @Bean
    public Game getGame() {
        return new GameImpl();
    }

    @Bean
    public MessageGenerator getMessageGenerator() {
        return new MessageGeneratorImpl();
    }
}
