package com.kodilla.rps;

import java.util.Scanner;

public class User {
    Scanner scanner = new Scanner(System.in);
    String userName = scanner.nextLine();

    public static void greetings() {
        System.out.println("Hello! What is your name?");
    }

    public String getUserName() {
        return userName;
    }
}
