package com.kodilla.stream.world;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class WorldTestSuite {


    @Test
    void testGetSandBeansQuantity() {
        //Given
        Continent europe = new  Continent();
        Country poland= new Country( new BigDecimal("2")) ;
        Country germany= new Country( new BigDecimal("2"));
        Country france= new Country( new BigDecimal("2"));
        europe.continent.add( poland);
        europe.continent.add( germany);
        europe.continent.add( france);

        Continent america = new   Continent();
        Country mexico= new Country( new BigDecimal("2"));
        Country uSA= new Country( new BigDecimal("2"));
        Country canada= new Country( new BigDecimal("2"));
        america .continent.add(mexico);
        america .continent.add( uSA);
        america .continent.add(canada);


        Continent asia = new  Continent();
        Country egipt= new Country( new BigDecimal("2"));
        Country niger= new Country( new BigDecimal("2"));
        Country sudan= new Country( new BigDecimal("2"));
        asia.continent.add( egipt);
        asia.continent.add(  niger);
        asia.continent.add( sudan);

        World testWorld = new World();
        testWorld.world.add(europe);
        testWorld.world.add(america);
        testWorld.world.add(asia);

        //When

        BigDecimal testWorldPopulation = testWorld.getPeopleQuantity();


        //Then
        assertEquals( new BigDecimal("18"),testWorldPopulation);

    }
}
