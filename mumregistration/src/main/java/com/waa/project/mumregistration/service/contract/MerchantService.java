package com.waa.project.mumregistration.service.contract;

import com.waa.project.mumregistration.model.entity.Merchant;
import com.waa.project.mumregistration.model.entity.User;


public interface MerchantService  extends AbstractService<Merchant>{
    public Merchant findByEmail(String email);
    public Merchant findByUsername(String userName);
    public Merchant findByMerchantName(String merchantName);
    public Merchant findUser(User user);
}
