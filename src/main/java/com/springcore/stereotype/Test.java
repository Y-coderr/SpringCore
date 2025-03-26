package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("stereoconfig.xml");
        Student student = context.getBean("ob", Student.class);
        System.out.println(student.hashCode());
    }
}


// notes
//Bean Scope
// there are some types of scope
//1.singleton 2.prototype 3.request 4.session 5.GlobalSession
//1.Singleton (ByDefault):- in this scope the object of student return the same bean object repeatetly for the confirmation we havr to check hashcode of this bean object
