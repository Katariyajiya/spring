package com.springcore.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Dummy {
    public static void main(String[] args) {
         ApplicationContext context = new ClassPathXmlApplicationContext("autowireconfig.xml");
         Employee emp = context.getBean("emp1",Employee.class);
        System.out.println(emp);

    }
}
