package com.five.monkey.demo.controller;

import com.five.monkey.demo.cmd.OrderCmd;
import com.five.monkey.demo.entity.Order;
import com.five.monkey.demo.service.OrderService;
import com.five.monkey.demo.vo.base.BaseListResult;
import com.five.monkey.demo.vo.base.BaseSingleResult;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jim
 * @date 2020/10/30 16:43
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/list/by/{productId}")
    public BaseListResult<Order> listByProductId(@PathVariable("productId") Long productId) {
        return new BaseListResult<>(orderService.findByProductId(productId));
    }

    @PostMapping("/add")
    public BaseSingleResult<Order> add(@RequestBody OrderCmd cmd) {
        Order order = new Order();
        BeanUtils.copyProperties(cmd, order);
        order = orderService.insert(order);
        return new BaseSingleResult<>(order);
    }
}
