package irati.A5;

public class Motorcycle extends Vehicle {
    boolean hasBox;
    public Motorcycle(String brand, String model, int numberOfWheels, int maxSpeed, boolean hasBox){
        super(brand, model, numberOfWheels, maxSpeed);
        this.hasBox = hasBox;
    }
    public void printHasBox() {
        System.out.println("Does it have a box?: " + this.hasBox);
    }
}
