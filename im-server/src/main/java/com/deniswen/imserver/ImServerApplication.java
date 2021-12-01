package com.deniswen.imserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ImServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImServerApplication.class, args);
    }

}
