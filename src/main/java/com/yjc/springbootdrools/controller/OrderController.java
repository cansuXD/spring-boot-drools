package com.yjc.springbootdrools.controller;


import com.yjc.springbootdrools.entity.Order;
import com.yjc.springbootdrools.service.IRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yujiacheng
 * @since 2022/7/6
 */
@Controller
public class OrderController {


    @Autowired
    private IRuleService ruleService;

    @GetMapping("/saveOrder")
    public Order saveOrder(Order order){
        System.out.println("hello,world");
        return ruleService.executeOrderRule(order);
    }

}
