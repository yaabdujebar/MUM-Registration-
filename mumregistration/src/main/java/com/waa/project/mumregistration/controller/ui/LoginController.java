package com.waa.project.mumregistration.controller.ui;

//import com.waa.project.mumregistration.model.entity.Merchant;
//import com.waa.project.mumregistration.model.entity.User;
//import com.waa.project.mumregistration.model.page.Login;
//import com.waa.project.mumregistration.service.LoginService;
//import com.waa.project.mumregistration.utils.WebUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import javax.validation.Valid;
//import java.security.Principal;
//
//@Controller
//public class LoginController {
//
//    private final LoginService loginService;
//
//    @Autowired
//    public LoginController(LoginService loginService) {
//        this.loginService = loginService;
//    }
//
//    @RequestMapping(value = {"/login"}, method = RequestMethod.GET)
//    public String loginForm(Model model) {
//        model.addAttribute("login", new Login());
//        return "common/login";
//    }
//
//    @RequestMapping(value = "/admin", method = RequestMethod.GET)
//    public String adminPage(Model model, Principal principal) {
//
//        User loginedUser = (User) ((Authentication) principal).getPrincipal();
//
//        String userInfo = WebUtils.toString(loginedUser);
//        model.addAttribute("userInfo", userInfo);
//
//        return "adminPage";
//    }
//
//    @RequestMapping(value = "/logoutSuccessful", method = RequestMethod.GET)
//    public String logoutSuccessfulPage(Model model) {
//        model.addAttribute("title", "Logout");
//        return "logoutSuccessfulPage";
//    }
//
//    @RequestMapping(value = "/userInfo", method = RequestMethod.GET)
//    public String userInfo(Model model, Principal principal) {
//
//        // After user login successfully.
//        String userName = principal.getName();
//
//        System.out.println("User Name: " + userName);
//
//        User loginedUser = (User) ((Authentication) principal).getPrincipal();
//
//        String userInfo = WebUtils.toString(loginedUser);
//        model.addAttribute("userInfo", userInfo);
//
//        return "userInfoPage";
//    }
//
//
//
//    @RequestMapping(value = "/403", method = RequestMethod.GET)
//    public String accessDenied(Model model, Principal principal) {
//
//        if (principal != null) {
//            User loginedUser = (User) ((Authentication) principal).getPrincipal();
//
//            String userInfo = WebUtils.toString(loginedUser);
//
//            model.addAttribute("userInfo", userInfo);
//
//            String message = "Hi " + principal.getName() //
//                    + "You do not have permission to access this page!";
//            model.addAttribute("message", message);
//
//        }
//
//        return "403Page";
//    }
//
//
//    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
//    public String login(@Valid @ModelAttribute("login") Login login,
//                        BindingResult bindingResult, Model model) {
//        if (bindingResult.hasErrors()) {
//            model.addAttribute("errors", bindingResult.getAllErrors());
//            return "common/login";
//        }
//        Merchant merchant = loginService.login(login);
//        if (merchant != null) {
//            return "redirect:/dashbaord";
//        } else {
//            return "redirect:/login";
//        }
//    }
//
//}
