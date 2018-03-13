package com.chuxin.designPattern.DecoratorPattern;

import java.util.ArrayList;
import java.util.List;

public class Person {
    String name;
    List list = new ArrayList();
    public Person(String name){
        this.name = name;
        list.add(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }
}
