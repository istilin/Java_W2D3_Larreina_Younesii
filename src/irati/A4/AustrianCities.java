package irati.A4;
import java.util.*;

public class AustrianCities {
    ArrayList<City> cities;

    public AustrianCities(ArrayList<City> cities) {
        this.cities = cities;
    }
    ArrayList<String> returnCityNames(){
        ArrayList <String> names = new ArrayList<>();
        for (City city : cities){
            names.add(city.name);
        }
        return names;
    }
    void printCityNames(){
        for (City city : cities){
            System.out.println(city.name);
        }
    }

    void printCityCitizenNumbers(){
        for (City city : cities){
            System.out.println(city.citizensNum);
        }

    }
    void printAllCityData(){
        System.out.println("Main cities and their inhabitants:");
        for (City city : cities){
            System.out.println(city.name + " has " + city.citizensNum + " inhabitants.");
        }
    }

    void printTotalNumberOfCitizens(){
        int sum = 0;
        for (City city : cities){
            System.out.println(city.name + " ............... " + city.citizensNum);
            sum += city.citizensNum;
        }
        System.out.println("==========================");
        System.out.println("TOTAL: ............... " + sum);

    }
}
