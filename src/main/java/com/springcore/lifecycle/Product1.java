package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Product1 implements InitializingBean, DisposableBean {
    private double price;

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
     public Product1(){
        super();
     }

     public String toString(){
        return "Bottle [ price" + price +"]";
     }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bottle purchased : init");
    }

    /**
     * @throws Exception
     */
    @Override
    public void destroy() throws Exception {
        System.out.println("Bottle purchase cancelled : destroy");
    }
}




