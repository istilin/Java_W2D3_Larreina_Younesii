package irati.A5;

public class Car extends Vehicle {
    int numSits;
    public Car(String brand, String model, int numberOfWheels, int maxSpeed, int numSits){
        super(brand, model, numberOfWheels, maxSpeed);
        this.numSits = numSits;
    }

    public void printNumSits() {
        System.out.println("Number of sits is: " + this.numSits);
    }
}
