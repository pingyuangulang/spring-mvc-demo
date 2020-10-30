package com.five.monkey.demo.service;

import com.five.monkey.demo.entity.User;

import java.util.List;

/**
 * @author jim
 * @date 2020/10/28 20:26
 */
public interface UserService {

    List<User> findByNameAndAge(User user);

    User insert(User user);
}
