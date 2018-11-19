package com.waa.project.mumregistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.waa.project.mumregistration.model.entity.Merchant;
import com.waa.project.mumregistration.model.entity.User;

@Repository("merchantRepository")
public interface IMerchantRepository extends JpaRepository<Merchant, Long> {

    Merchant findByMerchantId(long id);

    Merchant findByMerchantName(String merchantName);

    Merchant findByUser(User user);

//    Merchant findByEmail(String email);
//
//    Merchant findByUsername(String userName);
}
