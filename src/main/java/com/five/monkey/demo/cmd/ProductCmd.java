package com.five.monkey.demo.cmd;

import lombok.Data;

/**
 * @author jim
 * @date 2020/10/30 16:36
 */
@Data
public class ProductCmd {

    private String name;

    /** 入库数据为23.88,则此处入参为2388。入参除100即为真实价格 */
    private Integer price;
}
