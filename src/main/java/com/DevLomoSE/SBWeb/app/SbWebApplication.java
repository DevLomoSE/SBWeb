package com.DevLomoSE.SBWeb.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbWebApplication.class, args);

		System.out.println("init");
	}

}
