package com.Nivi.Proyecto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.Nivi.Proyecto.Persistence.repository")
@EntityScan("com.Nivi.Proyecto.Persistence.entity")
public class ProyectoNiviApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProyectoNiviApplication.class, args);
	}
}