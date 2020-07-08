package irati.A5;

public class ElectroCar extends Vehicle {
    int timeCharge;
    public ElectroCar(String brand, String model, int numberOfWheels, int maxSpeed, int timeCharge){
        super(brand, model, numberOfWheels, maxSpeed);
        this.timeCharge = timeCharge;
    }
    public void printTimeCharge() {
        System.out.println("Time to charge is: " + this.timeCharge + " hours");
    }
}
