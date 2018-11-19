package com.waa.project.mumregistration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waa.project.mumregistration.model.entity.Merchant;
import com.waa.project.mumregistration.model.entity.User;
import com.waa.project.mumregistration.model.page.Login;
import com.waa.project.mumregistration.service.contract.MerchantService;
import com.waa.project.mumregistration.service.contract.UserService;

@Service
public class LoginService {

    private final UserService userService;
    private final MerchantService merchantService;

    @Autowired
    public LoginService(UserService userService,MerchantService merchantService){
        this.userService = userService;
        this.merchantService = merchantService;
    }

    public Merchant login(Login login){
        User user = userService.findByUserNameAndPassword(login.getUsername(),login.getPassword());
        if(user!=null){
            return merchantService.findUser(user);
        }
        return null;
    }
}
