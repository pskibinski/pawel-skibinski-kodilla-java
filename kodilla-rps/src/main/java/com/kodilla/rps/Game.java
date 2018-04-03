package com.kodilla.rps;

public class Game {
    public boolean startGame() {

        User.greetings();
        User user = new User();
        String name = user.getUserName();
        WinCondition win = new WinCondition();
        int userScore = 0;
        int cpuScore = 0;

        while(true) {
            Shapes userShape = Moves.userMove();
            Shapes cpuShape = Moves.cpuMove();

            int n = win.winCondition(userShape, cpuShape);
            System.out.println("Your choice is: " + userShape + " Computer choice is: " + cpuShape);

            switch (n) {
                case 0:
                    System.out.println("It is tie.");
                    break;
                case 1:
                    System.out.println(name + " wins.");
                    userScore++;
                    break;
                case -1:
                    System.out.println("Computer wins.");
                    cpuScore++;
                    break;
                case -2:
                    return false;
            }
            System.out.println(name + " " + userScore + " : " + cpuScore + " Computer" + "\n");
        }
    }
}