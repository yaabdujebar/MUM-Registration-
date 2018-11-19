package com.waa.project.mumregistration.controller.ui;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.waa.project.mumregistration.model.entity.Merchant;

import javax.servlet.http.HttpServletRequest;

@Controller
public class DashboardController {


    @RequestMapping(value={"/dashbaord"}, method=RequestMethod.GET)
    public ModelAndView loginForm(Model model, HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("common/usermasterlayout");//merchants/dashboard
        modelAndView.addObject(new Merchant());
        return modelAndView;
    }

}
