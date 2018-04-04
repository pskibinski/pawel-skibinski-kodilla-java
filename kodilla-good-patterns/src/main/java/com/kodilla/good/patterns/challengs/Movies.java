package com.kodilla.good.patterns.challengs;

import java.util.stream.Collectors;

public class Movies {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        String movie = movieStore.getMovies().entrySet().stream()
                .flatMap(m -> m.getValue().stream())
                .collect(Collectors.joining(" ! "));

        System.out.println(movie);
    }
}
