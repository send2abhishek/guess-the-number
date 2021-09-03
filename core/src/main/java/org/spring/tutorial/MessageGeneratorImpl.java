package org.spring.tutorial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class MessageGeneratorImpl implements MessageGenerator {

    private static final Logger log = LoggerFactory.getLogger(MessageGeneratorImpl.class);

    @Autowired
    private Game game;

    private int guessCount = 10;

    @PostConstruct
    public int guessCount() {
        return game.getGuess();
    }

    @Override
    public String getMainMessage() {
        log.info("this getMainMessage method called");
        return "Number is between " +
                game.getSmallest() +
                " and " +
                game.getBiggest() +
                ". Can you guess it?";
    }

    @Override
    public String getResultMessage() {

        if (game.isGameWon()) {
            return "You guessed it! The number was " + game.getNumber();
        } else if (game.isGameLost()) {
            return "You lost the game, the number was " + game.getNumber();
        } else if (!game.isValidNumberRange()) {
            return "Invalid number range !";
        } else if (game.getRemainingGuess() == guessCount) {
            return "what is your first guess ?";
        } else {

            String direction = "lower";
            if (game.getGuess() < game.getNumber()) {
                direction = "higher";
            }

            return direction + "!You have " + game.getRemainingGuess() + " guess left";
        }
    }
}
