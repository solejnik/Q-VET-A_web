package com.capgemini.solejnik.qveta.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
/*
 * author: Crunchify.com
 * 
 */
 
@Controller
public class SampleController {
 
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		String message = "This is a sample message";
		return new ModelAndView("welcome", "message", message);
	}
}