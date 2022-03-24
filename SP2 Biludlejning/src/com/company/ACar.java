package com.company;

public abstract class ACar implements Car {
    /*Abstrakt klasse ACar. Skal implementere Car interfacet og alle metoderne i dette, undtagen
getRegistrationFee(), som skal implementers i de konkrete klasser (i punkt 4,5 og 6). Lav
klasse attributter til at holde styr på registreringsnummer (nummerplade), mærke, model
og antal døre. (Husk at bruge engelske navne til alt). Overvej hvilke attributter det giver
mening at lave final.*/
    String registrationNumber;
    String make;
    String model;
    int numberOfDoors;

    public ACar(String registrationNumber, String make, String model, int numberOfDoors){
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    public String getRegistrationNumber(){
        return registrationNumber;
    }
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getNumberOfDoors(){
        return numberOfDoors;
    }
}
