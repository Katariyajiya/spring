package com.springcore.lifecycle;

public class Product {
    private double price;

    public double getprice(){
        return price;
    }
    public void setPrice(double price){
        System.out.println("Setting price");
        this.price=price;
    }

    public Product(){
        super();
    }

    public String toString(){
        return "Bucket [ price= "+price +"]";
    }

    public void init(){
        System.out.println("Inside init method");
    }

    public void destroy(){
        System.out.println("Inside destroy method");
    }
}
