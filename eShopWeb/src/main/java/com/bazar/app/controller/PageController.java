package com.bazar.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	@RequestMapping(value = "/contactus")
	public String showContactUsPage() {
		
		return "ContactUs";
	}
	

}
