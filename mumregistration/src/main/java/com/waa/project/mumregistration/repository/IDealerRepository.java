package com.waa.project.mumregistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.waa.project.mumregistration.model.entity.Dealer;

@Repository(value = "dealerRepository")
public interface IDealerRepository extends JpaRepository<Dealer, Long> {
}
