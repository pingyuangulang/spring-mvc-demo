package com.five.monkey.demo.controller;

import com.five.monkey.demo.cmd.UserCmd;
import com.five.monkey.demo.entity.User;
import com.five.monkey.demo.service.UserService;
import com.five.monkey.demo.vo.base.BaseListResult;
import com.five.monkey.demo.vo.base.BaseSingleResult;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author jim
 * @date 2020/10/28 20:56
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public BaseListResult<User> userList(@RequestParam("name") String name, @RequestParam("age") int age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        return new BaseListResult<>(userService.findByNameAndAge(user));
    }

    @PostMapping("/add")
    public BaseSingleResult<User> add(@RequestBody UserCmd cmd) {
        User user = new User();
        Date currentTime = new Date();
        BeanUtils.copyProperties(cmd, user);
        user.setCreateTime(currentTime);
        user.setUpdateTime(currentTime);
        user.setId(null);
        user = userService.insert(user);
        return new BaseSingleResult<>(user);
    }
}
