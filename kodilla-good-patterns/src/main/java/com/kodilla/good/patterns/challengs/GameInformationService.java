package com.kodilla.good.patterns.challengs;

public class GameInformationService implements InformationService {

    @Override
    public void inform(User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " purchased a new game.");
    }
}
