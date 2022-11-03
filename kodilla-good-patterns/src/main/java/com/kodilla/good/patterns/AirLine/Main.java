package com.kodilla.good.patterns.AirLine;


import java.util.Set;

import static com.kodilla.good.patterns.AirLine.Airports.*;

public class Main {
    public static void main(String[] args) {


        System.out.println("Lista wylotów z" + KRAKOW_BALICE);
        FlightsFrom flightsFrom = new FlightsFrom();
        Set<Flight> flightsFromKrakow = flightsFrom.flightsFrom(KRAKOW_BALICE);
        flightsFromKrakow.stream()
                .forEach(System.out::println);
        System.out.println("");

        System.out.println("Lista przylotów do " + GDANSK_WALESY);
        FlightsTo  flightsTo = new FlightsTo();
        Set<Flight> flightsToKrakow = flightsTo.flightsTo( GDANSK_WALESY);
        flightsToKrakow.stream()
                .forEach(System.out::println);
        System.out.println("");

        ConnectingFlights connectingFlights = new ConnectingFlights();
        connectingFlights.connectingFlights(KRAKOW_BALICE, GDANSK_WALESY);
    }
}

