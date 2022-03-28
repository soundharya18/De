package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.logging.Logger;



@SpringBootApplication
public class ApplicationService {
    static Logger log =Logger.getLogger(ApplicationService.class.getName());
public static void main(String[]args){
    log.info("Hello World with Log4j");
    log.info("Information");

    }
}
