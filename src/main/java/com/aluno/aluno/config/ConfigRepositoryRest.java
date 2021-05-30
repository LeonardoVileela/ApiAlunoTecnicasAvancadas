package com.aluno.aluno.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.aluno.aluno.aluno.Student;

@Configuration
public class ConfigRepositoryRest implements RepositoryRestConfigurer {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
		// config.exposeIdsFor(Task.class);
		config.exposeIdsFor(Student.class);
		// Liberar api para front end que está em outro
		// resolução do problema do projeto da fabrica
		cors.addMapping("/**")// end points liberados
				.allowedOrigins("*")// posso restringir a ip ou algum client
				.allowedMethods("GET", "POST", "PUT", "DELETE");// Métodos liberados
	}

}
