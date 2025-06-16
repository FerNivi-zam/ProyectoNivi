package com.Nivi.Proyecto.web.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class Pizza2Application {

    public static void main(String[] args) {

        SpringApplication.run(Pizza2Application.class, args);
    }

}
