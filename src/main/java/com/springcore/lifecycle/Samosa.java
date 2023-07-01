package com.springcore.lifecycle;

public class Samosa {
    private double price;

    public Samosa(double price) {
        this.price = price;
    }

    public Samosa() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("setting property");
        this.price = price;
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }
    public void init(){
        System.out.println("Inside Init Method");
    }
    public void destroy(){
        System.out.println("Inside destroy Method");
    }
}
