package com.kodilla.rps;


import static com.kodilla.rps.Shapes.*;

public class WinCondition {

    public String winCondition(Shapes userShape, Shapes cpuShape) {
        String i = "";

        if(userShape.equals(cpuShape)) {
            return "0";
        } else {
            switch(userShape) {
                case ROCK:
                    i = cpuShape.equals(SCISSORS) || cpuShape.equals(LIZARD) ? "1" : "-1";
                    break;
                case PAPER:
                    i= cpuShape.equals(ROCK) || cpuShape.equals(Shapes.SPOCK) ? "1" : "-1";
                    break;
                case SCISSORS:
                    i = cpuShape.equals(PAPER) || cpuShape.equals(LIZARD) ? "1" : "-1";
                    break;
                case LIZARD:
                    i = cpuShape.equals(Shapes.SPOCK) || cpuShape.equals(PAPER) ? "1" : "-1";
                    break;
                case SPOCK:
                    i = cpuShape.equals(ROCK) || cpuShape.equals(SCISSORS) ? "1" : "-1";
                    break;
                case EXIT:
                    i = "-2";
            }
            return i;
        }
    }
}
