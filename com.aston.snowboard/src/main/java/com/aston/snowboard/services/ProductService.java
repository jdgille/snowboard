package com.aston.snowboard.services;

import com.aston.snowboard.domain.Product;

/**
 * Created by jonagill1 on 6/27/2016.
 */
public interface ProductService {

    Iterable<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveProduct(Product product);

    Iterable<Product> saveProductList(Iterable<Product> productIterable);

    void deleteProduct(Integer id);
}
