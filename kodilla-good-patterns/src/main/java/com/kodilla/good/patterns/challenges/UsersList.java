package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

public class UsersList {
    //User johnWahokwsky = new User("John", "Wachowski", 1);
    static User tomHardy = new User("Tom", "Hardy", 2);
    static User tomCruise = new User("Tom", "Cruise", 3);
    static User eltonJohn = new User("Elton", "John", 4);
    static User monikaLevinski = new User("Monika", "Levinski", 5);

    public static List usersList () {
        List<User> userList = new ArrayList<>();
        userList.add(tomHardy);
       userList.add(tomHardy);
       userList.add(tomCruise);
       userList.add(eltonJohn);
       userList.add(monikaLevinski);
       return userList;
   }
}
