package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Moves {

    public static Shapes userMove() {
        System.out.println("What is your move? \n 1. Rock \n 2. Paper \n 3. Scissors \n 4. Lizard \n 5. Spock \n 6. Exit");
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String number = scanner.nextLine();
            switch(number) {
                case "1": return Shapes.ROCK;
                case "2": return Shapes.PAPER;
                case "3": return Shapes.SCISSORS;
                case "4": return Shapes.LIZARD;
                case "5": return Shapes.SPOCK;
                case "6": return Shapes.EXIT;
                default:
                    System.out.println("Wrong selection. Choose one more time.");
            }
        }
    }

    public static Shapes cpuMove() {
        Random random = new Random();
        int rng = random.nextInt(5);

        Shapes shapes[] = Shapes.values();

        return shapes[rng];
    }
}





