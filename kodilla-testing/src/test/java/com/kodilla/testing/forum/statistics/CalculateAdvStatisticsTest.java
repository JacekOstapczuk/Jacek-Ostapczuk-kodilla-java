package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

public class CalculateAdvStatisticsTest {
    @Mock
    private Statistics statisticsMock;

    @Test
    void testWhenNumberOfPostEqual0() {

        //Given
        Statistics statisticsFor0Posts =new Statistics() {
            @Override
            public List<String> usersNames() {
                List<String> usersNames = new ArrayList<>();
                usersNames.add("Jacek");
                return  usersNames;
            }
            @Override
            public int postsCount() {
                return 0;
            }
            @Override
            public int commentsCount() {
                return 1;
            }
        };

        CalculateAdvStatistics testedStatistics = new CalculateAdvStatistics();
        when (statisticsMock.postsCount()).thenReturn( statisticsFor0Posts.postsCount());
       testedStatistics.calculateAdvStatistics(statisticsMock);
        testedStatistics.showStatistics();

        //When


        //Then
       testedStatistics.showStatistics();
    }

    @Test
    void testWhenNumberOfPostEqual1000() {
        //Given

        //When

        //Then

    }

    @Test
    void testWhenNumberOfCommentsEqual0() {
        //Given

        //When

        //Then
    }

    @Test
    void testWhenNumberOfCommentsIsSmallerThanPosts() {
        //Given

        //When

        //Then
    }

    @Test
    void testWhenNumberOfCommentsIsBiggerThanPosts() {
        //Given

        //When

        //Then
    }

    @Test
    void testWhenNumberOfUsersEqual0() {
        //Given

        //When

        //Then
    }

    @Test
    void testWhenNumberOfUsersEqual100() {
        //Given

        //When

        //Then
    }
}