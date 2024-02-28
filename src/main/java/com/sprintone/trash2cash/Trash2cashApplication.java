package com.sprintone.trash2cash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Trash2cashApplication {

	public static void main(String[] args) {
		SpringApplication.run(Trash2cashApplication.class, args);
	}

}
