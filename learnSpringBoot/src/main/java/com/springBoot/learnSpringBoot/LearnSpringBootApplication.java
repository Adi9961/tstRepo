package com.springBoot.learnSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class LearnSpringBootApplication {

//	@Scheduled(cron = "${springBoot.cmd.command}")
	public static void main(String[] args) {
		SpringApplication.run(LearnSpringBootApplication.class, args);

	}

}
