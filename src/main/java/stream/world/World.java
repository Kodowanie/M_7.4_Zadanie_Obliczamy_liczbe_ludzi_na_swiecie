package stream.world;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public final class World {

    private final List<Continent> listOfContinentA = new ArrayList<>();

    private final List<List<List<Country>>> listOfContinentB = new ArrayList<>();

    public void addContinentA (Continent continent){
        Continent continent1 = new Continent();
        listOfContinentA.add(continent);
    }

    public void addContinentB (Continent continent){
        Continent continent1 = new Continent();
        listOfContinentB.add(continent.sum);
    }

// stream zwraca w map getListOfContinentA wartość kolekcji continentA
    public void getListOfContinentA(){
        System.out.println(
                listOfContinentA.stream()
                .flatMap(listOfContinent -> listOfContinent.getContinentA().stream())
                .map(country -> country.getPeopleQuantity())
//                .forEach(System.out::println);
                .reduce(BigDecimal.ZERO,(sum,current) ->  sum = sum.add(current))
        );
    }

//stream zwraca map sumContinent i sumuje getPeopleQuantity ze wszystkich państw i kontynentów
//natomiast w miarę dodawania nowych krajów dodają się one: 1 kraj A + 1 kraj B
//czym więcej krajów tym więcej razy będzie trzeba dodawać add(c->c.get().getPeopleQuantity())
    public void getListOfContinentTotalA() {
        System.out.println(
                listOfContinentA.stream()
                        .flatMap(listOfContinent -> listOfContinent.sum.stream())
                        .map(country -> (country.get(0).getPeopleQuantity()
                                .add(country.get(1).getPeopleQuantity())
                                .add(country.get(2).getPeopleQuantity())))
//                        .collect(Collectors.toList())
                        .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current))
        );
    }

/*    public void getListOfContinentTotalB() {
        System.out.println(
                listOfContinentB.stream()
                        .flatMap(listOfContinent -> listOfContinent.sum.stream())
                        .map(country -> (country.get(0).getPeopleQuantity()
                                .add(country.get(1).getPeopleQuantity())
                                .add(country.get(2).getPeopleQuantity())))
//                        .collect(Collectors.toList())
                        .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current))
        );
    }*/





}
