package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
    private double price;

    public Pepsi() {
    }

    public Pepsi(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pepsi{" +
                "price=" + price +
                '}';
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // init
        System.out.println("taking Pepsi");
    }

    @Override
    public void destroy() throws Exception {
        //destroy
        System.out.println("Going to Put Bottle back to shop : destroy");
    }
}
