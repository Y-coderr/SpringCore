package com.springcore.lifecycle;

public class Samosa {


    private double price;
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }

    public Samosa(double price) {
        this.price = price;
    }
}
