package com.pluralsight;

public class jetCart extends Cart {
    private int turboLevel;

    public jetCart(String name, double basePrice, int turboLevel) {
        super(name, basePrice);
        this.turboLevel = turboLevel;
    }

    @Override
    public double getValue() {
        return this.getBasePrice() +(turboLevel * 7);
    }
}
