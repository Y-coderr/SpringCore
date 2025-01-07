package com.springcore.ci;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
        Addition add=(Addition)context.getBean("add");
        add.doSum();
    }
}
