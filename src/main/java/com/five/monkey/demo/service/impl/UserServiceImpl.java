package com.five.monkey.demo.service.impl;

import com.five.monkey.demo.entity.User;
import com.five.monkey.demo.entity.UserExample;
import com.five.monkey.demo.mapper.UserMapper;
import com.five.monkey.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 * @author jim
 * @date 2020/10/28 20:27
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findByNameAndAge(User user) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andAgeEqualTo(user.getAge());
        criteria.andNameEqualTo(user.getName());
        userExample.or(criteria);
        return userMapper.selectByExample(userExample);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public User insert(User user) {
        userMapper.insert(user);
        return user;
    }
}
