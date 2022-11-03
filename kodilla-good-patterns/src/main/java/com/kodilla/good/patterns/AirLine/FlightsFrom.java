package com.kodilla.good.patterns.AirLine;

import java.util.Set;
import java.util.stream.Collectors;

public class FlightsFrom {

  public Set<Flight> flightsFrom(String airport){
      FlightList flightList = new FlightList();

      Set<Flight> flightsFrom = flightList.flightSet().stream()
              .filter(f->f.getDepartureAirport().equals(airport))
              .collect(Collectors.toSet());
return flightsFrom;
  }




}
