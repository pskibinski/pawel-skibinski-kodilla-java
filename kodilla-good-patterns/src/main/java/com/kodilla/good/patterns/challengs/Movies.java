package com.kodilla.good.patterns.challengs;

public class Movies {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();


        String movie = movieStore.getMovies().entrySet().stream()
                .flatMap(m -> m.getValue().stream())
                .reduce("", (s, c) -> s = s + " ! " + c);

        System.out.println(movie);
    }
}
