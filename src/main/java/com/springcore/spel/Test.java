package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Demo d1 = context.getBean("demo",Demo.class);
        System.out.println(d1);
    }
}

// Spring expression language SpEL
// @Value(#{expression})
//it will solve the expression which is in the curly brackets and inject it into the given variable
//we can pass static methods , object methods and variables

//Now lets start with the invoking the static function and varibles using the SpEL(Spring Expression Language)
//Eg. @Value("#{T(ClassName).function()}")

// now lets use boolean value inside the @Value("#{8<3}") yes it returns true so it stores true ins ide the variable
// by defalut value of the boolean datatype is "false"