package stream.world;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        //Tworzenie obiektów country
        Country countryA = new Country("A", BigDecimal.valueOf(10));
        Country countryAa = new Country("Aa", BigDecimal.valueOf(20));
        Country countryAaa = new Country("Aaa", BigDecimal.valueOf(30));
        Country countryB = new Country("B", BigDecimal.valueOf(40));
        Country countryBb = new Country("Bb", BigDecimal.valueOf(50));
        Country countryBbb = new Country("Bbb", BigDecimal.valueOf(60));

        //Dodawanie obiektów Country to obiektu Continent
        Continent continent = new Continent();

        continent.addContinentA(countryA);
        continent.addContinentA(countryAa);
        continent.addContinentA(countryAaa);
        continent.addContinentB(countryB);
        continent.addContinentB(countryBb);
        continent.addContinentB(countryBbb);

        //Dodawanie obiektów Continent to obiketu World
        World world = new World();

        world.addContinentA(continent);
        world.addContinentB(continent);


        //Drukowanie wyników
        System.out.println("World listOfContinent:  " + world);

        System.out.println("List continentA: " + continent.continentA);
        System.out.println("List continentB: " + continent.continentB);


        System.out.println("List sumContinent: " + continent.sum);
        continent.sumContinent();


        System.out.println("Stream getListOfContinentA: " );
        world.getListOfContinentA();


        System.out.println("Stream getListOfContinentTotalA: " );
        world.getListOfContinentTotalA();


        System.out.println("Stream getListOfContinentTotalB: " );
//        world.getListOfContinentTotalB();


    }
}