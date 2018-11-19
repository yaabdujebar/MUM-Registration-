package com.waa.project.mumregistration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waa.project.mumregistration.model.Product;
import com.waa.project.mumregistration.repository.IProductRepository;
import com.waa.project.mumregistration.service.contract.ProductService;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private IProductRepository productRepository;

    @Override
    public Product create(Product product) {
        product.setStatus("Active");
        return productRepository.save(product);
    }

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findByStatus("Active");
    }

    @Override
    public void delete(Product product) {
        product.setStatus("Deleted");
        productRepository.save(product);
    }

    @Override
    public void deleteById(long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Product update(Product product) {
        return productRepository.save(product);
    }
}
