package Farzaneh.A1_A2_A3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList< String > cities = new ArrayList < String > ();

        cities.add("Graz");
        cities.add("Salzburg");
        cities.add("Linz");
        cities.add("Innsbruck");
        cities.add("Vienna");
        System.out.println(cities);

        ////////////////////////////////////////////////////////////////////////////
        ArrayList< Integer > temperatures = new ArrayList < Integer> ();

        temperatures.add(20);
        temperatures.add(13);
        temperatures.add(30);
        temperatures.add(15);
        temperatures.add(17);
        System.out.println(temperatures);
        ///////////////////////////////////////////////////////////////////////////

        City city01 = new City (cities.get(0),temperatures.get(0));
        City city02 = new City(cities.get(1),temperatures.get(1));
        City city03 = new City(cities.get(2),temperatures.get(2));
        City city04 = new City(cities.get(3),temperatures.get(3));
        City city05 = new City(cities.get(4),temperatures.get(4));

        ArrayList< City > myCities = new ArrayList < City > ();

        myCities.add(city01);
        myCities.add(city02);
        myCities.add(city03);
        myCities.add(city04);
        myCities.add(city05);
        System.out.println(myCities);

        // A2 - sort
        System.out.println("\n////////////////////  A2 - sort /////////////////////////");
        System.out.println("Before sorting city names: " + cities);
        Collections.sort(cities);
        System.out.println("After sorting city names: " + cities);

        //A2 new array + modifications
        System.out.println("\n////////////////////  A2 -  join two ArrayList + modifications’///////////");

        ArrayList< String > villages = new ArrayList < String > ();
        villages.add("Hallstatt");
        villages.add("Gmunden");
        villages.add("Millstatt");
        System.out.println("Befor modification: " + cities);
        cities.addAll(villages);
        System.out.println("After modification: " + cities);

        //A2
        System.out.println("\n/////////////////A2 - ArrayList- for Loop -iteration//////////////////////////////////");
        for (String element: cities) {
            System.out.println(element);
        }
        System.out.println("\n////////////////////////A2 - for each loop//////////////////");
        for (int i = 0; i < villages.size(); i++) {
            System.out.println(villages.get(i));
        }

        System.out.println("\n//////////////////////A2 - arraylist method////////////////");

        System.out.println(cities.size());
        System.out.println(myCities.get(3));


        System.out.println("\n///////A2 - insert an element into the first position//////");
        System.out.println("Before adding element to the first position: " + cities);
        cities.add(0, "Baden");
        System.out.println("After adding element to the first position:" + cities);


        System.out.println("\n//////////////////////// A3 ////////////////////////////////////");
        System.out.println("\n/////////update specific array element by given element/////////");
        System.out.println("Before updating: " + villages);
        System.out.println(villages.set(2,"tuln"));
        System.out.println("After updating: " + villages);













    }
}
