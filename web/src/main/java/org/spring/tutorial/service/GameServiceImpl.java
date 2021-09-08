package org.spring.tutorial.service;

import lombok.extern.slf4j.Slf4j;
import org.spring.tutorial.Game;
import org.spring.tutorial.MessageGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Slf4j
@Service
public class GameServiceImpl implements GameService {

    private final Game game;
    private final MessageGenerator messageGenerator;

    @Autowired
    public GameServiceImpl(Game game, MessageGenerator messageGenerator) {

        this.game = game;
        this.messageGenerator = messageGenerator;
    }

    @PostConstruct
    public void init(){
        log.info("number ={}",game.getNumber());
        log.info("message is let see ={}",messageGenerator.getMainMessage());
    }

    @Override
    public boolean isGameOver() {
        return game.isGameLost();
    }

    @Override
    public String getMainMessage() {
        return messageGenerator.getMainMessage();
    }

    @Override
    public String getResultMessage() {
        return messageGenerator.getResultMessage();
    }

    @Override
    public void checkGuess(int guess) {

        game.setGuess(guess);
        game.check();
    }

    @Override
    public void reset() {
        game.reset();
    }
}
