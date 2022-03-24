package com.company;

public class GasolineCar extends AFuelCar{
    /*Klasse GasolineCar. Denne klasse nedarver fra AFuelCar og skal implementere de to
abstrakte metoder getFuelType() og getRegistrationFee(). Registreringsafgiften skal
beregnes ud fra beskrivelsen i toppen af opgaven.
*/
    // CONSTRUCTOR

    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }


    // METHODS

    public int getRegistrationFee() {
        if (kmPrLitre<5){
            return 10470;
        }
        if (kmPrLitre>=5&&kmPrLitre<10) {
            return 5500;
        }
        if (kmPrLitre>=10&&kmPrLitre<15){
            return 2340;
        }
        if (kmPrLitre>=15&&kmPrLitre<20){
            return 1050;
        }
        if (kmPrLitre>=20&&kmPrLitre<50){
            return 330;
        }
        return 0;
    }

    @Override
    String getFuelType() {
        return "gasoline";
    }

    public String toString(){
        return (registrationNumber+" "+make+" "+model+" "+numberOfDoors+" "+kmPrLitre);
    }
}
