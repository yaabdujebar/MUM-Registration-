package com.waa.project.mumregistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.waa.project.mumregistration.model.Product;

import java.util.List;

@Repository(value = "productRepository")
public interface IProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByStatus(String status);
}
