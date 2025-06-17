package com.Nivi.Proyecto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.Nivi.Proyecto.persistence.repository")
@EntityScan("com.Nivi.Proyecto.persistence.entity")
public class ProyectoNiviApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProyectoNiviApplication.class, args);
	}
}