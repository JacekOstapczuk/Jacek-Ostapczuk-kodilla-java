package com.kodilla.good.patterns.AirLine;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class ConnectingFlights {



    public void connectingFlights(String startingairport, String destinationairport) {
        FlightList flightList = new FlightList();

        FlightsFrom flightsFrom = new FlightsFrom();
        FlightsTo flightsTo = new FlightsTo();
        Set<Flight> SetOfStartingAirport = flightsFrom.flightsFrom(startingairport);
        Set<Flight> SetOfDestinationAirport = flightsTo.flightsTo (destinationairport);

        for (Flight startingFlight : SetOfStartingAirport) {
            SetOfDestinationAirport.stream()
                    .filter(f -> f.getDepartureAirport().equals(startingFlight.arrivalAirport))
                    .forEach(a -> System.out.println("Lot przesiadkowy dla relacji "  + "z " + startingairport + " do " + destinationairport  +
                            "\n" + "jest możliwy poprzez wykonanie poniższych lotów :" +
                            "\n" + "lot początkowy: " + startingFlight +
                            "\n" + "lot końcowy: "        + a));
        }
    }
}