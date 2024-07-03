package com.subrat.GraphQLProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.subrat.GraphQLProject.query", "com.subrat.GraphQLProject.service",
"com.subrat.GraphQLProject.resolver", "com.subrat.GraphQLProject.mutation"})
@EntityScan("com.subrat.GraphQLProject.entity")
@EnableJpaRepositories("com.subrat.GraphQLProject.repository")
public class GraphQlProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphQlProjectApplication.class, args);
	}

}
