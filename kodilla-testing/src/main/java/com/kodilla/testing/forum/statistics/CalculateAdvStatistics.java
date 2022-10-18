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
         averagePostPerUser = numberOfPosts / numberOfUsers;
         averageCommentsPerUser = numberOfComments / numberOfUsers;
         averageCommentsPerPost = numberOfComments / numberOfPosts;
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
