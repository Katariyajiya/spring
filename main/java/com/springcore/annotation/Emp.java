package com.springcore.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
    @Autowired
    @Qualifier("address2")
    private Adress adress;
    public Adress getAddress() {
        return adress;
    }

    public void setAddress(Adress adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + adress +
                '}';
    }
    public Emp(){
        super();
    }
    public Emp(Adress adress) {
        super();
        this.adress = adress;
    }
}
