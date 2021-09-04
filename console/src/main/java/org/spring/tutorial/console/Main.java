package org.spring.tutorial.console;

import lombok.extern.slf4j.Slf4j;
import org.spring.tutorial.config.GameConfig;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class Main {

//    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        log.info("guess the number game");
        // create context (context)
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class);

        //close context
        context.close();

    }
}
