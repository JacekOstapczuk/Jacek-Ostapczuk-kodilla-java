package com.kodilla.exception.test;

public class ExceptionHandling {



    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String exceptionToWork = secondChallenge.probablyIWillThrowException(3,1);
        } catch (Exception  e) {
            System.out.println("Problem with data");
        }
    }
}


