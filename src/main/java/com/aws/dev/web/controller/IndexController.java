package com.aws.dev.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aws.dev.backend.service.EmailService;
import com.aws.dev.web.frontend.feedback;

@Controller
public class IndexController {
	
	@Autowired
	private EmailService emailservice;

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "about";
	}
	
	@RequestMapping("/contact")
	public String getcontact(ModelMap model) {
		model.addAttribute("contact", new feedback());
		return "contact";
	}
	
	@RequestMapping(value = "/contact", method=RequestMethod.POST)
	public String postcontact(@ModelAttribute("contact") feedback feedback) {
        emailservice.sendFeedbackEmail(feedback);
		return "index";
	}
}
