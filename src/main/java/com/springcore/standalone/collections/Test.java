package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import com.springcore.standalone.collections.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("aloneconfig.xml");
        Person person1 = (Person) context.getBean("person1",Person.class);
        System.out.println(person1);
    }
}
