package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
        Samosa s1=(Samosa) context.getBean("samosa1");
        System.out.println(s1);
    }
}
