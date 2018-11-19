package com.waa.project.mumregistration.controller.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {
	@RequestMapping(value={"/admin/home"}, method=RequestMethod.GET)
	public String homepage() {
		return "admin/index";
	}
}
