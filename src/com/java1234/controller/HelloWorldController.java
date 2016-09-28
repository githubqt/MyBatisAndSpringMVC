package com.java1234.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/helloWorld")
public class HelloWorldController {

	@RequestMapping("/helloWorld")
	public String helloWorld(Model model){
		model.addAttribute("message", "你好世界！");
		return "index/helloWorld";
	}
}
