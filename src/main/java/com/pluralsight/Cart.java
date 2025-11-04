package com.pluralsight;

public abstract class Cart implements valuable, Comparable<Cart>{
    private  String name;
    private double basePrice;

    public Cart(String name,double basePrice){
        this.name = name;
        this.basePrice = basePrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
    @Override
    public double getValue(){
        return getBasePrice();

    }
    @Override
    public String toString(){
        return getClass().getSimpleName() + (name) + getValue();
    }
    @Override
    //  compare to helps sort lists
    public int compareTo(Cart someOtherCart){
        return this.getName().compareToIgnoreCase(someOtherCart.getName());
    }
}
