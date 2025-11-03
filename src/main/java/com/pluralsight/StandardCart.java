package com.pluralsight;

public class StandardCart extends Cart {
    private int relatabilty;

    public StandardCart(String name, double basePrice, int relatabilty) {
        super(name, basePrice);
        this.relatabilty = relatabilty;
    }
    @Override public double getValue(){
        //alternative way to calculate the value for this cart
        return  this.getBasePrice() + (relatabilty * 10);


    }
}
