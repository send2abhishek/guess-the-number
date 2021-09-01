package org.spring.tutorial;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

  private static final Logger log=LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        log.info("this is the info log i can see on the screen2 ");
        log.debug("this is the debug message you are seeing on the screen");
//        System.out.println("this is the demo");
    }
}
