package com.aluno.aluno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@SpringBootApplication
public class AlunoApplication implements RepositoryRestConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(AlunoApplication.class, args);
	}

}
