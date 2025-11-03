package com.pluralsight;

public class coinPile implements valuable{
    private  int coins;

    public coinPile(int coins) {
        this.coins = coins;
    }
    @Override
    public double getValue(){
        return  this.coins;
    }
}
