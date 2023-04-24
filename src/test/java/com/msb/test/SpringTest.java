package com.msb.test;
import com.msb.pojo.User;
import org.junit.Test;

import java.applet.AppletContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void test1(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) app.getBean("user1" +
                "" +
                "");



        System.out.println(user);
    }
}
