package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
public int  identificator;
public String userName;
public char sex;
public LocalDate dateOfBirth;
public int postsNumber;



    public ForumUser(int identificator, String userName, char sex, int yearOfBirth,
                     int monthOfBirth, int dayOfBirth , int postsNumber) {
        this.identificator = identificator;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postsNumber = postsNumber;
    }


        public int getIdentificator() {
            return identificator;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "identificator=" + identificator +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", postsNumber=" + postsNumber +
                '}';
    }
}
