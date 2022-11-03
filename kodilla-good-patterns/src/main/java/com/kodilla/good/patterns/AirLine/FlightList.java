package com.kodilla.good.patterns.AirLine;

import java.util.HashSet;
import java.util.Set;

import static com.kodilla.good.patterns.AirLine.Airports.*;

public class FlightList {

    Set <Flight> flightSet() {
        Set<Flight> flightSet = new HashSet<>();
            flightSet.add(new Flight(WARSZAWA_OKECIE, 12,KRAKOW_BALICE,13,  90 ));
        flightSet.add(new Flight(GDANSK_WALESY, 9, KRAKOW_BALICE,11,100));
        flightSet.add(new Flight(POZNAN,6, WARSZAWA_MODLIN,7,75));
        flightSet.add(new Flight(KATOWICE, 16, GDANSK_WALESY, 18, 350));
        flightSet.add(new Flight(OLSZTYN_SZYMANY, 18, GDANSK_WALESY, 19, 45));
        flightSet.add(new Flight(RADOM, 13, KRAKOW_BALICE,14, 450));
        flightSet.add(new Flight(LODZ, 19,GDANSK_WALESY,20, 245));
        flightSet.add(new Flight(KATOWICE, 11, OLSZTYN_SZYMANY, 12, 301));
        flightSet.add(new Flight(POZNAN, 10, LODZ, 11, 103));
        flightSet.add(new Flight(KRAKOW_BALICE, 22, WARSZAWA_OKECIE, 23, 194));
        flightSet.add(new Flight(POZNAN,5, OLSZTYN_SZYMANY,6, 24 ));
        flightSet.add(new Flight(WARSZAWA_MODLIN,17, GDANSK_WALESY,18, 231 ));
        flightSet.add(new Flight(WARSZAWA_OKECIE, 11, KRAKOW_BALICE, 12, 241));
        flightSet.add(new Flight(RADOM, 17, LODZ, 18, 14));
        flightSet.add(new Flight(OLSZTYN_SZYMANY, 13, KRAKOW_BALICE,15, 532));
        flightSet.add(new Flight(OLSZTYN_SZYMANY, 14, POZNAN, 16, 151));
        flightSet.add(new Flight(GDANSK_WALESY, 4, KRAKOW_BALICE,6, 246));
        flightSet.add(new Flight(KRAKOW_BALICE, 23, KATOWICE, 24, 15));
        flightSet.add(new Flight(POZNAN, 19, GDANSK_WALESY, 20, 371));
        flightSet.add(new Flight(WARSZAWA_OKECIE, 15, KRAKOW_BALICE, 16, 54));
    return flightSet;
    }
}
