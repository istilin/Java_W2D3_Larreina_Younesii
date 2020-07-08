package irati.A5;

public class Bike extends Vehicle {
    int numChanges;
    public Bike(String brand, String model, int numberOfWheels, int maxSpeed, int numChanges){
        super(brand, model, numberOfWheels, maxSpeed);
        this.numChanges = numChanges;
    }
    public void printNumChanges() {
        System.out.println("Number of changes: " + this.numChanges);
    }

}
