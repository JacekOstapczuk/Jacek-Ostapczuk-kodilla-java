package com.kodilla.good.patterns.AirLine;

import java.util.Set;
import java.util.stream.Collectors;

public class FlightsTo {

    public Set <Flight>flightsTo(String airport){
        FlightList flightList = new FlightList();

        Set<Flight> flightsTo = flightList.flightSet().stream()
                .filter(f->f.getArrivalAirport().equals(airport))
                .collect(Collectors.toSet());

        return flightsTo;
    }
}

