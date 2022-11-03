package com.kodilla.good.patterns.AirLine;

import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;


public class ConnectingFlights {

    public void connectingFlights(String startingairport, String destinationairport) {
        FlightList flightList = new FlightList();
        FlightsFrom flights = new FlightsFrom();

        List<Set<Flight>> ListOfStartingairport= flightList.flightSet().stream()
               .filter(sf->sf.getDepartureAirport().equals(startingairport))
               .map(sf -> sf.getDepartureAirport())
               .map(flights::flightsFrom)
              .collect(Collectors.toList());

        ListOfStartingairport.stream()
                .forEach(System.out::println);

        for ( Set<Flight> singleSetOfFlights: ListOfStartingairport) {
            System.out.println("Dla lotu przesiadkowego z " +startingairport +" do " + destinationairport + " dostępne są następujące polaczenia");
                singleSetOfFlights.stream()
                        .map(df -> df.getArrivalAirport())
                        .map(flights::flightsFrom)
                        .flatMap(s->s.stream())
                        .filter(df->df.getArrivalAirport().equals(destinationairport))
                        .forEach(System.out::println);
        }


        }
        }


