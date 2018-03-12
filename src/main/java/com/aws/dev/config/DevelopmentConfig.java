package com.aws.dev.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.aws.dev.backend.service.EmailService;
import com.aws.dev.backend.service.MockEmailService;

@Configuration
@Profile("dev")
public class DevelopmentConfig {
   
	@Bean
	public EmailService emailservice() {
		return new MockEmailService();
	}
	
			
}
