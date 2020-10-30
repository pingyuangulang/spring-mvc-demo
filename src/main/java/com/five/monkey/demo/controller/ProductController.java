package com.five.monkey.demo.controller;

import com.five.monkey.demo.cmd.ProductCmd;
import com.five.monkey.demo.entity.Product;
import com.five.monkey.demo.service.ProductService;
import com.five.monkey.demo.vo.base.BaseListResult;
import com.five.monkey.demo.vo.base.BaseSingleResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Optional;

/**
 * @author jim
 * @date 2020/10/30 16:18
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/find/by/{id}")
    public BaseSingleResult<Product> findById(@PathVariable("id") Long id) {
        Optional<Product> optional = productService.findById(id);
        return optional.map(BaseSingleResult::new).orElseGet(() -> new BaseSingleResult<>(null));
    }

    @PostMapping("/add")
    public BaseSingleResult<Product> add(@RequestBody ProductCmd cmd) {
        Product product = new Product();
        product.setName(cmd.getName());
        product.setPrice(new BigDecimal(cmd.getPrice() / 100.0f));
        product = productService.insert(product);
        return new BaseSingleResult<>(product);
    }
}
