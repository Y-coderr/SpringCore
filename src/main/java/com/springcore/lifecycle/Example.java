package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
    private String subjet;

    public String getSubjet() {
        return subjet;
    }

    public void setSubjet(String subjet) {
        this.subjet = subjet;
    }

    @Override
    public String toString() {
        return "Example{" +
                "subjet='" + subjet + '\'' +
                '}';
    }

    public Example(String subjet) {
        this.subjet = subjet;
    }

    @PostConstruct
    public void start(){
        System.out.println("Starting method");
    }

    @PreDestroy
    public void end(){
        System.out.println("ending method");
    }
}
// For using this two annotations we have to add one dependancy in pom.xml
// <dependency>
//   <groupId>javax.annotation</groupId>
//   <artifactId>javax.annotation-api</artifactId>
//   <version>1.3.2</version>
//</dependency>