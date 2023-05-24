package com.yearup.dealership;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class Contract {
    protected String date;
    protected String name;
    protected String email;
    protected Vehicle vehicleSold;
    protected double totalPrice;
    protected double monthlyPayment;

    public Contract (String date, String name, String email) {
        this.date = date;
        this.name = name;
        this.email = email;

    }

    // getters and setters
    public String getDate(){
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    // abstract methods
    public abstract double getTotalPrice();
    public abstract double getMonthlyPayment();


    @Override
    public String toString() {
        return "Contract{" +
                "date='" + date + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
