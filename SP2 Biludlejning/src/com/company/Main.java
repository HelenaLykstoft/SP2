package com.company;

public class Main {

    public static void main(String[] args) {
	/*Skriv en Main-klasse med en main-metode der instantierer et FleetOfCars-objekt og et antal bilobjekter af de 3 konkrete typer. Tilføj bilerne til flåden. Skriv alle bilerne ud, og kald også
getTotalRegistrationFeeForFleet() -metoden og skriv resultatet ud*/
        FleetOfCars fleet = new FleetOfCars();
        Car audiA5 = new GasolineCar("GIGACHAD","audi","A5",4,10);
        Car alfa = new DieselCar("Mors dyt","Alfa Romeo","Mito",4,15,false);
        Car tesla =  new ElectricCar("ChuChuu","Tesla","JeNeSaisPas",2,100,200);
        fleet.addCar(alfa);
        fleet.addCar(audiA5);
        //fleet.addCar(tesla);
        System.out.println(audiA5);
        System.out.println(alfa);
        System.out.println(tesla);
        System.out.println("The total registrationfee is = "+fleet.getTotalRegistrationFeeForFleet());

    }
}
