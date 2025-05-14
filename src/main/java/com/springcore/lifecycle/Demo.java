package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String args[]){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycleconfig.xml");

        context.registerShutdownHook();
////        Product p1 = (Product) context.getBean("p1");
////        System.out.println(p1);
//
//        System.out.println("---------------------------------");
//        Product1 p2 =(Product1) context.getBean("p2");
//        System.out.println(p2);

         Product2 p3=(Product2) context.getBean("p3");
        System.out.println(p3);


    }
}
