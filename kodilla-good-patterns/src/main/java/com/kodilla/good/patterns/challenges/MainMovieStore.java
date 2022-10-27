package com.kodilla.good.patterns.challenges;


import java.sql.SQLOutput;
import java.util.stream.Collectors;

public class MainMovieStore {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        String listOfMovis =  movieStore.getMovies().entrySet().stream()
                .flatMap(film->film.getValue().stream())
                 .collect(Collectors.joining("!","",""));

        System.out.println(listOfMovis);
    }
}