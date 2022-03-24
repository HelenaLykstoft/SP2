package com.company;

import java.util.ArrayList;

public class FleetOfCars {
    /*Der skal laves en klasse FleetOfCars, der indeholder en ArrayList<Car>, der kan indeholde alle
bilerne, som udlejningsfirmaet råder over. Klassen skal indeholde en metode til at tilføje en bil til
flåden. Den skal overskrive toString(), så den returnerer en String, der lister alle bilerne i flåden.
Sidst men ikke mindst skal den have en metode, getTotalRegistrationFeeForFleet(), der beregner
den samlede registreringsafgift for hele bilflåden.
*/


    ArrayList<Car> fleet;
    public FleetOfCars() {
        this.fleet = new ArrayList<Car>();
    }
    public void addCar(Car car){
    fleet.add(car);
    }
    int getTotalRegistrationFeeForFleet() {
        int sum = 0;
        for (Car car:fleet){
            sum +=car.getRegistrationFee();
        }
        return sum;
    }
}
