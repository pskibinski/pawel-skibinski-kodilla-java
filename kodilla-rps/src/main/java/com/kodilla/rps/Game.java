package com.kodilla.rps;

public class Game {

    public void startGame() {
        System.out.println("Hello what is your name?");
        User user = new User();
        System.out.println("What is your move? Rock, paper or scissors?");
        user.getMove();
    }
}
