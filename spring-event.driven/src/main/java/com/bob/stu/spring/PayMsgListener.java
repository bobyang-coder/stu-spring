package com.bob.stu.spring;

import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * TODO 又忘写注释啦!!!
 *
 * @author haibo.yang
 * @since 12 四月 2018
 */
@Component
public class PayMsgListener implements ApplicationListener<PayEvent> {

    @Async
    public void onApplicationEvent(PayEvent payEvent) {
        System.out.println("支付完成-【发送消息】");
    }
}
