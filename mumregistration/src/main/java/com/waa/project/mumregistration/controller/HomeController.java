package com.waa.project.mumregistration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value= {"/"})
	public String gethome() {
		return "home";
	}
}
