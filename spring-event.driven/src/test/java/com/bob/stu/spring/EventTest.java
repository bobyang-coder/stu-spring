package com.bob.stu.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * TODO 又忘写注释啦!!!
 *
 * @author haibo.yang
 * @since 12 四月 2018
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application-context.xml")
public class EventTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void testPublishEvent() {
        applicationContext.publishEvent(new PayEvent("pay"));
    }

}