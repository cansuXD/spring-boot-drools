package com.yjc.springbootdrools.service;

import com.yjc.springbootdrools.entity.Order;

/**
 * @author IDEA-236
 * @since 2022/7/6
 */
public interface IRuleService {

    public Order executeOrderRule(Order order);
}
