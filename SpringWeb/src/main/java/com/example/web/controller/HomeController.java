package com.example.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
	@RequestMapping("/index")
	public String adsf() {
		return "home.index";
	}
	
	@RequestMapping("/help")
	public String aaaa() {
		return "home.help";
	}

}
