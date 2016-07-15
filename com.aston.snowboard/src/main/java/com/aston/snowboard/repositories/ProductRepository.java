package com.aston.snowboard.repositories;

import com.aston.snowboard.domain.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jonagill1 on 6/27/2016.
 */
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
