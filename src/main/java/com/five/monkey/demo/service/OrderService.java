package com.five.monkey.demo.service;

import com.five.monkey.demo.entity.Order;

import java.util.List;

/**
 * @author jim
 * @date 2020/10/30 16:13
 */
public interface OrderService {

    List<Order> findByProductId(Long productId);

    Order insert(Order order);
}
