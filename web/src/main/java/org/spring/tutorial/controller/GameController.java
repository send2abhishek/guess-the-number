package org.spring.tutorial.controller;

import lombok.extern.slf4j.Slf4j;
import org.spring.tutorial.service.GameService;
import org.spring.tutorial.utils.AttributesNames;
import org.spring.tutorial.utils.GameMappings;
import org.spring.tutorial.utils.ViewNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
public class GameController {

    private final GameService gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping(GameMappings.PLAY)
    public String play(Model model) {

        model.addAttribute(AttributesNames.MAIN_MESSAGE, gameService.getMainMessage());
        model.addAttribute(AttributesNames.RESULT_MESSAGE, gameService.getResultMessage());
        log.info("model value set ={}", model);

        if (gameService.isGameOver()) return ViewNames.GAME_OVER;

        return ViewNames.PLAY;
    }

    @PostMapping(GameMappings.PLAY)
    public String processMessage(@RequestParam int guess){

        log.info("guess received ={}",guess);
        gameService.checkGuess(guess);
        return GameMappings.REDIRECT_DIRECT;
    }


}
