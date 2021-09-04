package org.spring.tutorial.console;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.tutorial.*;
import org.spring.tutorial.config.AppConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);
    private static final String CONFIG_LOCATION = "bean.xml";

    public static void main(String[] args) {

        log.info("guess the number");
        log.debug("guess the number debug info");

        // create context (context)
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

        // this is the one of the way to create the object using spring container
        NumberGenerator numberGenerator = context.getBean(NumberGenerator.class);

        log.info("number is ={}", numberGenerator.next());
        // this the other way of getting the bean from spring container
        Game game = context.getBean(Game.class);
        //game.reset();

        MessageGenerator messageGenerator = context.getBean(MessageGeneratorImpl.class);
        log.info("getResultMessage method called ={} ", messageGenerator.getMainMessage());
        log.info("getResultMessage method called ={} ", messageGenerator.getResultMessage());


        //close context
        context.close();

    }
}
