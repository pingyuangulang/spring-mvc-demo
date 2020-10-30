package com.five.monkey.demo.cmd;

import lombok.Data;

/**
 * @author jim
 * @date 2020/10/28 21:01
 */
@Data
public class UserCmd {

    private String name;

    private Integer age;

    private Byte sex;

    private Byte deleted;
}
