package com.springcore.annotation;

import com.springcore.autowiring.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Dummy {
    public static void main(String[] args) {
         ApplicationContext context = new ClassPathXmlApplicationContext("awannotationconfig.xml");
         Emp emp = context.getBean("emp1",Emp.class);
         System.out.println(emp);
    }
}

