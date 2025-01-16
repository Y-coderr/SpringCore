package com.springcore.ci;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("ciconfig.xml");
        Addition add=(Addition)context.getBean("add");
        add.doSum();
    }
}
