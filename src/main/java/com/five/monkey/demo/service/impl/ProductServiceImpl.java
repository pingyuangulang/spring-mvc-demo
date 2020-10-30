package com.five.monkey.demo.service.impl;

import com.five.monkey.demo.entity.Product;
import com.five.monkey.demo.mapper.ProductMapper;
import com.five.monkey.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * @author jim
 * @date 2020/10/30 16:10
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public Optional<Product> findById(Long id) {
        return Optional.ofNullable(productMapper.selectByPrimaryKey(id));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Product insert(Product product) {
        productMapper.insertSelective(product);
        return product;
    }
}
