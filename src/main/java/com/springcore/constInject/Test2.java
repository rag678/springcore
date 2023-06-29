package com.springcore.constInject;

import com.springcore.ref.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("refconfig.xml");
        A temp =(A) context.getBean("aref");
        System.out.println(temp.getX());

        System.out.println(temp.getObj().getY());

        System.out.println(temp);
    }
}