package com.yjc.springbootdrools.service.impl;


import com.yjc.springbootdrools.entity.Order;
import com.yjc.springbootdrools.service.IRuleService;
import org.kie.api.KieBase;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yujiacheng
 * @since 2022/7/6
 */
@Service
public class RuleServiceImpl implements IRuleService {
    @Autowired
    private KieBase kieBase;
    /*** 执⾏订单⾦额积分规则 */
    public Order executeOrderRule(Order order){
        KieSession kieSession = kieBase.newKieSession();
        kieSession.insert(order);
        kieSession.fireAllRules();
        kieSession.dispose();
        return order;
    }
}
