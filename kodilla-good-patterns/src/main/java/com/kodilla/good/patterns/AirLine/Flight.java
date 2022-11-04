package com.kodilla.good.patterns.AirLine;

import java.util.Objects;

public class Flight {
    public String departureAirport;
    public int departureTime;
    public String arrivalAirport;
    public int arrivalTime;
    public int internationalFlightNumber;

    public Flight(String departureAirport, int departureTime, String arrivalAirport, int arrivalTime, int internationalFlightNumber) {
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.arrivalAirport = arrivalAirport;
        this.arrivalTime = arrivalTime;
        this.internationalFlightNumber = internationalFlightNumber;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (departureTime != flight.departureTime) return false;
        if (arrivalTime != flight.arrivalTime) return false;
        if (internationalFlightNumber != flight.internationalFlightNumber) return false;
        if (!Objects.equals(departureAirport, flight.departureAirport))
            return false;
        return Objects.equals(arrivalAirport, flight.arrivalAirport);
    }

    @Override
    public int hashCode() {
            if (internationalFlightNumber >= 0 && internationalFlightNumber <= 99) {
                return 0;
            }
            if (internationalFlightNumber >= 100 && internationalFlightNumber <= 199) {
                return 1;
            }
            if (internationalFlightNumber >= 200 && internationalFlightNumber <= 299) {
                return 2;
            }else {return 3;
            }
    }

    @Override
    public String toString() {
        return "Lot z miasta '" + departureAirport + '\'' +
                " wylatujący o godzinie " + departureTime +
                " zmierzający do miasta '" + arrivalAirport + '\'' +
                " dotrze o godzinie " + arrivalTime;
    }
}
