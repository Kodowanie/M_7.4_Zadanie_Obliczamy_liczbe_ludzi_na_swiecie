package stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;


public class WorldTestSuite {

@Test
    public void testGetPeopleQuantity(){
    //Given
    Country countryA = new Country("A", BigDecimal.valueOf(10));
    Country countryAa = new Country("Aa", BigDecimal.valueOf(20));
    Country countryAaa = new Country("Aaa", BigDecimal.valueOf(30));
    Country countryB = new Country("B", BigDecimal.valueOf(40));
    Country countryBb = new Country("Bb", BigDecimal.valueOf(50));
    Country countryBbb = new Country("Bbb", BigDecimal.valueOf(60));

    Continent continent = new Continent();

    continent.addContinentA(countryA);
    continent.addContinentA(countryAa);
    continent.addContinentA(countryAaa);
    continent.addContinentB(countryB);
    continent.addContinentB(countryBb);
    continent.addContinentB(countryBbb);


    World world = new World();

    world.addContinentA(continent);
    world.addContinentB(continent);

    System.out.println(continent);

    List<List<Country>> sum = new ArrayList<>();
    continent.sumContinent();

    //When
    BigDecimal result = world.getListOfContinentTotalA();
    System.out.println(result);

    //Then
    Assertions.assertEquals(new BigDecimal("210"),result);
}

}
