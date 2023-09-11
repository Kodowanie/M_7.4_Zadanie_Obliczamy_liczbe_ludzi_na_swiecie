package stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class Continent {

    List<Country> continentA = new ArrayList<>();
    List<Country> continentB = new ArrayList<>();

    List<List<Country>> sum = new ArrayList<>();


    public void addContinentA(Country country){
        Country countryA = new Country(country.getCountryName() , country.getPeopleQuantity());
        continentA.add(countryA);

//        continentA.add(new Country("A",new BigDecimal("10")));
    }

    public void addContinentB (Country country){
        Country countryB = new Country(country.getCountryName() , country.getPeopleQuantity());
        continentB.add(countryB);

//        continentB.add(new Country("B",new BigDecimal("10")));
    }

    public void sumContinent(){
        sum.add(continentA);
        sum.add(continentB);
    }

   /* public List <List <Country>> sumContinent(){
        sum.add(continentA);
        sum.add(continentB);
        return sum;
    }*/

    public List<Country> getContinentA() {
        return continentA;
    }

    public List<Country> getContinentB() {
        return continentB;
    }

    public List<List<Country>> getSum(){
        return sum;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "continentA=" + continentA +
                ", continentB=" + continentB +
                '}';
    }

}
