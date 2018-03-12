package com.aws.dev.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

import com.aws.dev.web.frontend.feedback;

public abstract class AbstractEmailService implements EmailService {
	
	@Autowired
	private MailSender mailSender;
	
	private String ToAddress = "pranavadurai@gmail.com";
	
	protected SimpleMailMessage prepareSimpleMailMessageFromFeedback(feedback feedback) {
        SimpleMailMessage message = new SimpleMailMessage();
        System.out.println("I'm here");
        message.setTo(ToAddress);
        message.setFrom(feedback.getEmail());
        message.setReplyTo(feedback.getEmail());
        message.setSubject("Mail received from " + feedback.getFirstName() + " " + feedback
                .getLastName() + "!");
        message.setText("User with email: " + feedback.getEmail() + " left this feedback:\n" + feedback.getFeedback());
        return message;
}
	 @Override
	    public void sendFeedbackEmail(feedback feedback) {
	        mailSender.send(prepareSimpleMailMessageFromFeedback(feedback));
	}
	 
}
