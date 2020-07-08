package Farzaneh.A1_A2_A3;

public class City {
    String name;
    int temperature;



    //Constructor
    public City(String name, int temperature) {
        this.name = name;
        this.temperature = temperature;
    }
    public String toString() {
        return name + " " + temperature + "\u2103";
    }
}
