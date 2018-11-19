package com.waa.project.mumregistration.controller.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomepageController {

//	@RequestMapping(value={"/home","/","/index",""}, method=RequestMethod.GET)
//	public String homepage() {
//		return "home/index";
//	}


	@RequestMapping(value={"/userlayout"}, method=RequestMethod.GET)
	public String userlayout() {
		return "common/usermasterlayout";
	}
}
