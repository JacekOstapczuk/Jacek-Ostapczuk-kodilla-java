    package com.kodilla.testing.forum.statistics;

public class CalculateAdvStatistics {
    int numberOfUsers;
    int numberOfPosts;
    int numberOfComments;
    int averagePostPerUser;
    int averageCommentsPerUser;
    int averageCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
         numberOfUsers = statistics.usersNames().size();
         numberOfPosts = statistics.postsCount();
         numberOfComments = statistics.commentsCount();

         if ( numberOfUsers ==0){
             averagePostPerUser =0;
             averageCommentsPerUser =0;
             System.out.println("Brak użytkowników, nie można policzyć statystyk");
         }  else {
             averagePostPerUser = numberOfPosts / numberOfUsers;
             averageCommentsPerUser = numberOfComments / numberOfUsers;
         }

        if (  numberOfPosts ==0) {
            averageCommentsPerPost = 0;
            System.out.println("Brak postów, nie można policzyć statystyk");
        } else averageCommentsPerPost = numberOfComments / numberOfPosts;
    }

    public void showStatistics() {
            System.out.println(numberOfUsers);
            System.out.println(numberOfPosts);
            System.out.println(numberOfComments);
            System.out.println(averagePostPerUser);
            System.out.println(averageCommentsPerUser);
            System.out.println(averageCommentsPerPost);
        }
    }
