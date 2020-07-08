package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.entity.Feedback;
import com.service.AppService;

@Controller
public class FeedbackAppController {

	@Autowired
	private AppService appService;
	
	@GetMapping("/feedback")
	public String feedback() {
		return "feedback";
	}
	
	@PostMapping("/feedback")
	public String userFeedback(@RequestParam("uname") String uname , @RequestParam("feedback_data") String feedback_data){
		Feedback f = new Feedback(uname , feedback_data);
			boolean data = appService.fillFeedback(f);
			
			if(data){
			return "success";
			}
			else{
			return "error";
	}
	}
	
}
