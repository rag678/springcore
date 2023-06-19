package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("collectionconfig.xml");
        Emp emp = (Emp) applicationContext.getBean("emp1");
        System.out.println(emp);
        System.out.println(emp.getAddress());
        System.out.println(emp.getName());
        System.out.println(emp.getPhones());
        System.out.println(emp.getCourses());
    }
}
