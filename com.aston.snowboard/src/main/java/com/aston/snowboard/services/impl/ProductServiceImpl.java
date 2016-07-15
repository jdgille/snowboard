package com.aston.snowboard.services.impl;

import com.aston.snowboard.domain.Product;
import com.aston.snowboard.repositories.ProductRepository;
import com.aston.snowboard.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jonagill1 on 6/27/2016.
 */

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Iterable<Product> listAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Integer id) {
        return productRepository.findOne(id);
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Iterable<Product> saveProductList(Iterable<Product> productIterable) {
        return productRepository.save(productIterable);
    }

    @Override
    public void deleteProduct(Integer id) {
        productRepository.delete(id);
    }
}
