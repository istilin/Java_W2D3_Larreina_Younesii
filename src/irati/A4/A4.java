package irati.A4;

import java.util.*;


public class A4 {
    public static void main(String[] args) {
        ArrayList <City> cities = new ArrayList <City>();
        City city1 = new City("Eisenstadt", 14339);
        City city2 = new City("Klagenfurt", 99790);
        City city3 = new City("Sankt Pölten", 155446);
        City city4 = new City("Linz", 203012);
        City city5 = new City("Salzburg", 152367);
        City city6 = new City("Graz", 443066);
        City city7 = new City("Innsbruck", 311428);
        City city8 = new City("Bregenz", 29574);
        City city9 = new City("Vienna", 1888776);
        cities.add(city1);
        cities.add(city2);
        cities.add(city3);
        cities.add(city4);
        cities.add(city5);
        cities.add(city6);
        cities.add(city7);
        cities.add(city8);
        cities.add(city9);

        for ( City city : cities){
            System.out.println(city.name + " has " + city.citizensNum + " inhabitants.");
        }

        AustrianCities cities2 = new AustrianCities(cities);
        cities2.printCityNames();
        cities2.printCityCitizenNumbers();
        cities2.printAllCityData();
        cities2.printTotalNumberOfCitizens();
        System.out.println(cities2.returnCityNames());

        //Collections.sort(cities2, cities2.returnCityNames().iterator())
    }
}
