package com.five.monkey.demo.service.impl;

import com.five.monkey.demo.entity.Order;
import com.five.monkey.demo.entity.OrderExample;
import com.five.monkey.demo.mapper.OrderMapper;
import com.five.monkey.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author jim
 * @date 2020/10/30 16:14
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> findByProductId(Long productId) {
        OrderExample example = new OrderExample();
        OrderExample.Criteria criteria = example.createCriteria();
        criteria.andProductIdEqualTo(productId);
        return orderMapper.selectByExample(example);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Order insert(Order order) {
        orderMapper.insertSelective(order);
        return order;
    }
}
