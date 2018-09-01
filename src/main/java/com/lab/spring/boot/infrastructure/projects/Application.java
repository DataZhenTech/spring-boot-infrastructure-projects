package com.lab.spring.boot.infrastructure.projects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.SpringVersion;

/**
 * 
 * Application Starter
 * 
 * @author Martin
 * @since 1.0.0
 */
@SpringBootApplication(scanBasePackages = {"com.lab.spring.boot.infrastructure.projects"})
public class Application {

    /**
     * LOG
     */
    private final static Logger LOGGER = LogManager.getLogger(Application.class);

    /**
     * main run
     * 
     * @param args
     */
    public static void main(String[] args) {

        LOGGER.info("Spring version: " + SpringVersion.getVersion());
        SpringApplication springApplication = new SpringApplication(Application.class);

        // Startup
        springApplication.run(args);

    }
}
