package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;



public class World {

    List<Continent> world= new ArrayList<>();


    BigDecimal getPeopleQuantity() {
        BigDecimal worldPopulation = world.stream()
                .flatMap(continent -> continent.continent.stream())
                .map( Country::getPeopleQuantity)
                .reduce (BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return worldPopulation;
    }



}

