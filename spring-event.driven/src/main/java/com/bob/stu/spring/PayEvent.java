package com.bob.stu.spring;

import org.springframework.context.ApplicationEvent;

/**
 * 支付事件
 *
 * @author haibo.yang
 * @since 12 四月 2018
 */
public class PayEvent extends ApplicationEvent {
    public PayEvent(Object source) {
        super(source);
    }
}
