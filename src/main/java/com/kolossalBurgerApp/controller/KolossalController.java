package com.kolossalBurgerApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KolossalController {
	
	@GetMapping("/")
	public String olaMundo() {
		return "index";
	}

}