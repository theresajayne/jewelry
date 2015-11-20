package com.github.theresajayne.jewelry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main Entry point into the application
 * Created by Theresa on 17/11/2015.
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude = {org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration.class})

public class Jewelry {

    public static void main(String[] args) {
        SpringApplication.run(Jewelry.class, args);
    }
}

