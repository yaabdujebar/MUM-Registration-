package com.waa.project.mumregistration.controller.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class StudentController {
	@RequestMapping(value={"/student/home"}, method=RequestMethod.GET)
	public String homepage() {
		return "student/index";
	}
}
