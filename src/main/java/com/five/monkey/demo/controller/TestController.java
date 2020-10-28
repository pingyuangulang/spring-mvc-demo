package com.five.monkey.demo.controller;

import com.five.monkey.demo.cmd.TestCmd;
import com.five.monkey.demo.vo.TestVo;
import com.five.monkey.demo.vo.base.BaseSingleResult;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;

/**
 * @author jim
 * @date 2020/10/28 11:30
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @PostMapping("/valid")
    public BaseSingleResult<TestVo> test(@RequestBody @Valid TestCmd cmd) {
        TestVo vo = new TestVo();
        BeanUtils.copyProperties(cmd, vo);
        return new BaseSingleResult<>(vo);
    }
}
