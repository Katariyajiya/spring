package com.springcore.standalonecollections;

import com.springcore.ci.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo1 {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("scconfig.xml");
        People p1 = (People) context.getBean("people1");
        System.out.println(p1.getFriends());
        People p2 =(People) context.getBean("people2");
        System.out.println(p2.getFeestructure());
        System.out.println(p1.getFriends().getClass().getName());
        System.out.println(p2.getProperties());
    }
}
