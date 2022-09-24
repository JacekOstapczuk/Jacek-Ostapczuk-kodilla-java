package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    public static List<ForumUser>  getUserList() {
       final List<ForumUser> userList = new ArrayList<>();

        ForumUser forumUser1 = new ForumUser(1001, "Jacek",  'M',  1999,9,21,  2);
        ForumUser forumUser2 = new ForumUser(1002, "Mateusz",  'M',  2001,12,1,  4);
        ForumUser forumUser3 = new ForumUser(1003, "Krystian",  'M',  1992,2,28,  3);
        ForumUser forumUser4 = new ForumUser(1004, "Eomek",  'M',  1976,3,18,  0);
        ForumUser forumUser5 = new ForumUser(1005, "Tadeusz",  'M',  1959,5,28,  1);
        ForumUser forumUser6 = new ForumUser(1006, "Ania",  'F',  2013,5,4,  0);
        ForumUser forumUser7 = new ForumUser(1007, "Iza",  'F',  1959,4,26,  11);
        ForumUser forumUser8 = new ForumUser(1008, "Iza",  'F',  2012,3,21,  9);
        ForumUser forumUser9 = new ForumUser(1009, "Klaudia",  'F',  1998,11,18,  5);
        ForumUser forumUser10 = new ForumUser(1010, "Marta",  'F',  2002,9,19,  3);

        userList.add(forumUser1);
        userList.add(forumUser2);
        userList.add(forumUser3);
        userList.add(forumUser4);
        userList.add(forumUser5);
        userList.add(forumUser6);
        userList.add(forumUser7);
        userList.add(forumUser8);
        userList.add(forumUser9);
        userList.add(forumUser10);

       return new  ArrayList<> (userList);

    }


}
