package com.five.monkey.demo.cmd;

import lombok.Data;

/**
 * @author jim
 * @date 2020/10/30 16:42
 */
@Data
public class OrderCmd {

    private Long userId;

    private Integer num;

    private Long productId;
}
