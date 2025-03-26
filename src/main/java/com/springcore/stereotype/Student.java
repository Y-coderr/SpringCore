package com.springcore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("ob")   // for defining the object of the bean
@Scope("prototype")   // for declaring scope
public class Student {
    @Value("Yash Kadam")
    private String studentName;
    @Value("Pune")
    private String city;

    @Value("#{temp}")
    private List<String> address;
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
