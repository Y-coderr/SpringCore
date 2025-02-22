// stand alone collections
package com.springcore.collections;

import java.util.*;

public class Emp {
    private String name;
    private List<String> phones;
    private Set<String> addrresses;

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getAddrresses() {
        return addrresses;
    }

    public void setAddrresses(Set<String> addrresses) {
        this.addrresses = addrresses;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    private Map<String , String> courses;
    private Properties props;


}
