package irati.A5;

public class A5 {
    public static void main(String[] args) {
        Bike bike = new Bike("Specialized", "Stumpjumper", 2, 30, 7);
        Car car = new Car("Opel", "Astra", 4, 260, 5);
        ElectroCar electro = new ElectroCar("MoAZ", "1.00", 4, 20, 2);
        Motorcycle motor = new Motorcycle("Yamaha", "125ccc YA-1", 2, 280, true);
        bike.printBrand();
        bike.printModel();
        bike.printNumberOfWheels();
        bike.printMaxSpeed();
        bike.printNumChanges();

        car.printBrand();
        car.printModel();
        car.printNumberOfWheels();
        car.printMaxSpeed();
        car.printNumSits();

        electro.printBrand();
        electro.printModel();
        electro.printNumberOfWheels();
        electro.printMaxSpeed();
        electro.printTimeCharge();

        motor.printBrand();
        motor.printModel();
        motor.printNumberOfWheels();
        motor.printMaxSpeed();
        motor.printHasBox();

    }
}
