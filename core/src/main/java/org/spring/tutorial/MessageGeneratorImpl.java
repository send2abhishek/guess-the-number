package org.spring.tutorial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class MessageGeneratorImpl implements MessageGenerator{

    private static final Logger log= LoggerFactory.getLogger(Main.class);

    @Autowired
    private Game game;

    @PostConstruct
    public int guessCount(){
       return game.getGuess();
    }

    @Override
    public String getMainMessage() {
        log.info("this getMainMessage method called");
        return "called main method";
    }

    @Override
    public String getResultMessage() {
        log.info("this getResultMessage method called");
        return "called result message";
    }
}
