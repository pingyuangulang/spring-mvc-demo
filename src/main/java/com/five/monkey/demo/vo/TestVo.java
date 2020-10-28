package com.five.monkey.demo.vo;

import lombok.Data;

import java.util.List;

/**
 * @author jim
 * @date 2020/10/28 17:44
 */
@Data
public class TestVo {

    private String name;

    private int age;

    private String idNo;

    private List<String> hobby;
}
