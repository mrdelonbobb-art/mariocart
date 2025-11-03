package com.pluralsight;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;

public class Garage {
    private ArrayList<valuable> valuablesInTheGarage;

    public Garage() {
        this.valuablesInTheGarage = new ArrayList<valuable>();
    }

    public void add(valuable theValuableToAdd) {
        valuablesInTheGarage.add(theValuableToAdd);
    }

    public double getTotalValueOfGarageValuables() {
        //start our total as 0
        double total = 0;

        for (valuable theCurrentValuable : valuablesInTheGarage) {
            total += theCurrentValuable.getValue();
        }

        return total;
    }
}



