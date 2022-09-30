package com.kodilla.exception.test;

import com.kodilla.exception.index.IndexExceptionRunner;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FlightSearchEngine {
    String city;
    Boolean activeAirport;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightSearchEngine that = (FlightSearchEngine) o;

        return Objects.equals(city, that.city);
    }

    @Override
    public int hashCode() {
        return city != null ? city.hashCode() : 0;
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        boolean doFly;
        Map<String, Boolean> flightsPlan = new HashMap<>();
        flightsPlan.put("Toulouse", true);
        flightsPlan.put("Tenerife", true);
        flightsPlan.put("Alsace", true);
        flightsPlan.put("Palermo", false);
        flightsPlan.put("Athens", true);
        flightsPlan.put("Istanbul", true);
        flightsPlan.put("Cairo", false);
        flightsPlan.put("Rabat", true);
        flightsPlan.put("Marrakesh", false);
        flightsPlan.put("Casablanca", true);


        if (!flightsPlan.containsKey(flight.getDepartureAirport())) {
            throw new RouteNotFoundException();
        } else {
            doFly = flightsPlan.get(flight.getDepartureAirport());
        }
        return doFly;
    }
}