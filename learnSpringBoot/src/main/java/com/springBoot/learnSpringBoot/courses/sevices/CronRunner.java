package com.springBoot.learnSpringBoot.courses.sevices;

import org.springframework.stereotype.Component;

@Component
public class CronRunner {

	// @Scheduled(cron = "${springBoot.cmd.command}")
	public void hello() {
		System.out.println("Cron has been enabled");

	}

}
