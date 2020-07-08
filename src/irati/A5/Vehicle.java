package irati.A5;

public class Vehicle {
    String brand;
    String model;
    int numberOfWheels;
    int maxSpeed;

    public Vehicle(String brand, String model, int numberOfWheels, int maxSpeed){
        this.brand = brand;
        this.model = model;
        this.numberOfWheels = numberOfWheels;
        this.maxSpeed = maxSpeed;
    }

    public void printBrand() {
        System.out.println("Brand is: " + this.brand);
    }
    public void printModel() {
        System.out.println("Model is: " + this.model);
    }
    public void printNumberOfWheels() {
        System.out.println("Number of wheels is: " + this.numberOfWheels);
    }
    public void printMaxSpeed() {
        System.out.println("Maximum speed is: " + this.maxSpeed + "km/h");
    }
}
