package com.pluralsight;

public class MarioCartApp {
    public static void main(String[] args) {
        Garage myGarage = new Garage();

        //lets create 2 carts
        StandardCart newStandardCart = new StandardCart("bob Kart",100,0);
        jetCart newJetCart = new jetCart("fastjetkart",1000,10);
        coinPile theCoinPile = new coinPile(1500);

        //add valuables to the garage (carts and coins)
        myGarage.add(newStandardCart);
        myGarage.add(newJetCart);
        myGarage.add(theCoinPile);

        System.out.println("my garage is worth"+ myGarage.getTotalValueOfGarageValuables());
    }
}
