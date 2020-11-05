package com.five.monkey.demo.algorithm;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

/**
 * @author jim
 * @date 2020/11/5 17:53
 */
public class UserAlgorithm implements PreciseShardingAlgorithm<Integer> {


    /**
     * Sharding.
     *
     * @param availableTargetNames available data sources or tables's names
     * @param shardingValue        sharding value
     * @return sharding result for data source or table's name
     */
    @Override
    public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<Integer> shardingValue) {
        int age = shardingValue.getValue();
        int index = age % 5;
        return "user_" + index;
    }
}
