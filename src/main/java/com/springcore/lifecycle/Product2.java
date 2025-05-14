package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Product2 {
    public String getCategory() {
        return category;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return "Product [ category : " + category +"]";
    }

    public void setCategory(String category) {
        this.category = category;
    }

    private String category;

    public Product2(){
        super();
    }

    @PostConstruct
    public void start(){
        System.out.println("Starting method");
    }
    @PreDestroy
    public void end(){
        System.out.println("ending method");
    }
}
