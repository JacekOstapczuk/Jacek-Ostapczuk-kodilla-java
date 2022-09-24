package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        Forum forum = new Forum();
        Map<Integer, ForumUser> par = forum.getUserList().stream()
              .filter (sex -> sex.getSex()=='M')
              .filter ( age -> age.getDateOfBirth().getYear() <2002)
              .filter (postNumbet -> postNumbet.getPostsNumber()>0)
                   .collect(Collectors.toMap(ForumUser::getIdentificator, forumUser ->forumUser));


        System.out.println("# elements: " +par.size());
        par.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}