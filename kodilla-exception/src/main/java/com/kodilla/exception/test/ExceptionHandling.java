package com.kodilla.exception.test;

import com.kodilla.exception.index.IndexExceptionRunner;

public class ExceptionHandling {



    public static void main(String[] args) {
      /*  SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String exceptionToWork = secondChallenge.probablyIWillThrowException(3,1);
        } catch (Exception  e) {
            System.out.println("Problem with data");
        }
       */

        FlightSearchEngine  flightSearchEngine = new FlightSearchEngine ();
        Flight fligt = new Flight ("Portugal", "Palermo");
        boolean doFly;
        try {  doFly = flightSearchEngine.findFlight(fligt);
        } catch (  RouteNotFoundException e) {
            System.out.println("Brak polaczenia na podanej lini");
        }
    }
}


