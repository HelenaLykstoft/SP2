package com.company;

public class ElectricCar extends ACar {
    /*Klasse ElectricCar. Denne klasse nedarver fra ACar. Den skal tilføje metoderne:
a. getBatteryCapacityKWh(); // returns the battery capacity in kilowatt hours
b. getMaxRangeKm(); // returns the maximum range in kilometres.
c. getWhPrKm(); // returns the power consumption in watt hours per driven kilometre.
Lav attributer til battery capacity og max range, som initialiseres i konstruktøren. Beregn
watt-timer per kilometer ud fra disse to attributter. */
    int batteryCapacity;
    int maxRange;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    int getMaxRangeKm(){

    }

    int getBatteryCapacityKWh(){
        return batteryCapacity;
    }

    int getWhPrKm() {
        return (getBatteryCapacityKWh()*1000)/maxRange;
    }

    @Override
    public int getRegistrationFee() {
        int kmPrLitre = (int) (100/(getWhPrKm() / 91.25));
        System.out.println("Kilometer per litre " +kmPrLitre);
        if (kmPrLitre < 5) {
            return 10470;
        } else if (kmPrLitre >= 5 && kmPrLitre < 10) {
            return 5500;
        } else if (kmPrLitre >= 10 && kmPrLitre < 15) {
            return 2340;
        } else if (kmPrLitre >= 15 && kmPrLitre < 20) {
            return 1050;
        } else if (kmPrLitre >= 20 && kmPrLitre < 50) {
            return 330;
        }
        return 0;
    }

    public String toString(){
            return (registrationNumber+" "+make+" "+model+" "+numberOfDoors+" "+batteryCapacity+" "+maxRange);
        }
    }

