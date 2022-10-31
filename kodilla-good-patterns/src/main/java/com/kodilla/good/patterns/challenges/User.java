package com.kodilla.good.patterns.challenges;

public class User {
private String name;
private String surname;
private int userNumber;
    public User(String name, String surname, int userNumber) {
        this.name = name;
        this.surname = surname;
        this.userNumber = userNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getUserNumber() {
        return userNumber;
    }
}
