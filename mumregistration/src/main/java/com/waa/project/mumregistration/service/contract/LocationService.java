package com.waa.project.mumregistration.service.contract;

import com.waa.project.mumregistration.model.entity.Location;
import com.waa.project.mumregistration.model.entity.Merchant;
import com.waa.project.mumregistration.model.entity.User;


public interface LocationService extends AbstractService<Location>{
    public Location findByLocationName(String locationName);
    public Location findMerchant(Merchant merchant);
}
