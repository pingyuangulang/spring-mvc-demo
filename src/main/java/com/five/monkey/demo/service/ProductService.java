package com.five.monkey.demo.service;

import com.five.monkey.demo.entity.Product;

import java.util.Optional;

/**
 * @author jim
 * @date 2020/10/30 16:07
 */
public interface ProductService {

    Optional<Product> findById(Long id);

    Product insert(Product product);
}
