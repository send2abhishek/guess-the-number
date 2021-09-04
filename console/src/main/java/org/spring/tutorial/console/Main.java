package org.spring.tutorial.console;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.tutorial.config.AppConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);
    private static final String CONFIG_LOCATION = "bean.xml";

    public static void main(String[] args) {
        // create context (context)
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

        //close context
        context.close();

    }
}
