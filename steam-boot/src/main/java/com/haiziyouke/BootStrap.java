package com.haiziyouke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ImportResource(
		locations = {"classpath*:mvc-config.xml" })
@EnableScheduling
@EnableAsync
public class BootStrap {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(BootStrap.class, args);
	}
}
