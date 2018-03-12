package com.aws.dev.backend.service;

import org.springframework.mail.SimpleMailMessage;

import com.aws.dev.web.frontend.feedback;


public interface EmailService {

	public void sendFeedbackEmail(feedback feedback );
	
	public void sendGenericEmailMessage(SimpleMailMessage message);
}
