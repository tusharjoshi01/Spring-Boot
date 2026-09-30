package com.example.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootApplication {
	private Notification notification;

	public BootApplication(Notification notification) {
		this.notification = notification;
	}

	BootApplication(){
		
	}

	public static void main(String[] args) {
		SpringApplication.run(BootApplication.class, args);
	}

}
