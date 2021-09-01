package org.spring.tutorial;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

  private static final Logger log=LoggerFactory.getLogger(Main.class);
  private static final String CONFIG_LOCATION="bean.xml";

    public static void main(String[] args) {

        // create context (context)
        ConfigurableApplicationContext context=new ClassPathXmlApplicationContext(CONFIG_LOCATION);

        NumberGeneratorImpl numberGenerator=context.getBean("nuberGenerator",NumberGeneratorImpl.class);

        log.info("number is ={}",numberGenerator.next());

        //close context
        context.close();

    }
}
