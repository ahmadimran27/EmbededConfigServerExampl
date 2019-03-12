package com.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class EmbededConfigServerExamplApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmbededConfigServerExamplApplication.class, args);
	}

}
