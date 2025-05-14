package com.springcore.autowiring;

public class Employee {
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }

    private Address address;

    public Employee(){
        super();
    }
    public Employee(Address address) {
        super();
        this.address = address;
    }
}
