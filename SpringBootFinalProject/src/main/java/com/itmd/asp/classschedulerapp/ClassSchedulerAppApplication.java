package com.itmd.asp.classschedulerapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ClassSchedulerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClassSchedulerAppApplication.class, args);
	}
}
