package irati.A1;
import java.util.*;


public class A1 {
    public static void main(String[] args) {
        ArrayList <String> cities = new ArrayList <String>();
        cities.add("Vienna");
        cities.add("Salzburg");
        cities.add("Graz");
        cities.add("Linz");
        cities.add("Innsbruck");
        cities.add("Grieskirchen");



        ArrayList <Integer> temperatures = new ArrayList <Integer>();

        temperatures.add(36);
        temperatures.add(28);
        temperatures.add(30);
        temperatures.add(26);
        temperatures.add(31);
        temperatures.add(29);
        for (String city : cities){
            System.out.println(city);
        }

        for (int i=0; i < cities.size(); i++){
            System.out.println("The temperature in " + cities.get(i) + " is " + temperatures.get(i) + " degrees.");
        }
        City city1 = new City(cities.get(0), temperatures.get(0));
        City city2 = new City(cities.get(1), temperatures.get(1));
        City city3 = new City(cities.get(2), temperatures.get(2));
        City city4 = new City(cities.get(3), temperatures.get(3));
        City city5 = new City(cities.get(4), temperatures.get(4));
        City city6 = new City(cities.get(5), temperatures.get(5));

        ArrayList <City> cities2 = new ArrayList <City>();
        cities2.add(city1);
        cities2.add(city2);
        cities2.add(city3);
        cities2.add(city4);
        cities2.add(city5);
        cities2.add(city6);
        for (City city : cities2){
            System.out.println("The temperature in " + city.name + " is " + city.temperature + " degrees.");
        }


    }
}
