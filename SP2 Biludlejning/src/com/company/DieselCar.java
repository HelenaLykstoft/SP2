package com.company;

public class DieselCar extends AFuelCar{
    /*Klasse DieselCar. Denne klasse nedarver også fra AFuelCar og skal også implementere de to
abstrakte metoder getFuelType() og getRegistrationFee(). Herudover skal der være en
metode, hasParticleFilter(), der fortæller om bilen har et partikelfilter monteret.
Registreringsafgiften skal beregnes ud fra beskrivelsen i toppen af opgaven.*/
    boolean particleFilter;

    // CONSTRUCTOR

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.particleFilter = particleFilter;
    }


    // METHODS


    @Override
    public int getRegistrationFee() {
        int sum=0;
        if (kmPrLitre<5){
            sum=10470+15260;
        }
        else if (kmPrLitre>=5&&kmPrLitre<10) {
            sum=5500+2770;
        }
        else if (kmPrLitre>=10&&kmPrLitre<15){
            sum=2340+1850;
        }
        else if (kmPrLitre>=15&&kmPrLitre<20){
            sum=1050+1390;
        }
        else if (kmPrLitre>=20&&kmPrLitre<50){
            sum= 330+130;
        } if (particleFilter) {
            return sum;
        }else {
            return sum+1000;
            }
        }

    @Override
    public String getFuelType() {
        return "diesel";
    }
    public String toString(){
        return (registrationNumber+" "+make+" "+model+" "+numberOfDoors+" "+kmPrLitre+" "+particleFilter);
    }
}
