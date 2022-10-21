package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

public class CalculateAdvStatisticsTest {

    private Statistics statisticsMock= Mockito.mock( Statistics.class);

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
        when (statisticsMock.commentsCount()).thenReturn( statisticsFor0Posts.commentsCount());
        when (statisticsMock. usersNames()).thenReturn( statisticsFor0Posts. usersNames());

        //When
        testedStatistics.calculateAdvStatistics(statisticsMock);
            int expextedNumberOfPosts =  testedStatistics.numberOfPosts;
        //Then
        assertEquals(0,expextedNumberOfPosts);
    }


    @Test
    void testWhenNumberOfPostEqual1000() {
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
                return 1000;
            }
            @Override
            public int commentsCount() {
                return 1;
            }
        };

        CalculateAdvStatistics testedStatistics = new CalculateAdvStatistics();
        when (statisticsMock.postsCount()).thenReturn( statisticsFor0Posts.postsCount());
        when (statisticsMock.commentsCount()).thenReturn( statisticsFor0Posts.commentsCount());
        when (statisticsMock. usersNames()).thenReturn( statisticsFor0Posts. usersNames());

        //When
        testedStatistics.calculateAdvStatistics(statisticsMock);
        int expextedNumberOfPosts =  testedStatistics.numberOfPosts;
        //Then
        assertEquals(1000,expextedNumberOfPosts);
    }

    @Test
    void testWhenNumberOfCommentsEqual0() {
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
                return 1;
            }
            @Override
            public int commentsCount() {
                return 0;
            }
        };

        CalculateAdvStatistics testedStatistics = new CalculateAdvStatistics();
        when (statisticsMock.postsCount()).thenReturn( statisticsFor0Posts.postsCount());
        when (statisticsMock.commentsCount()).thenReturn( statisticsFor0Posts.commentsCount());
        when (statisticsMock. usersNames()).thenReturn( statisticsFor0Posts. usersNames());

        //When
        testedStatistics.calculateAdvStatistics(statisticsMock);
        int expextedNumberOfComments =  testedStatistics.numberOfComments;
        //Then
        assertEquals(0,expextedNumberOfComments);
    }

    @Test
    void testWhenNumberOfCommentsIsSmallerThanPosts() {
        Statistics statisticsFor0Posts =new Statistics() {
            @Override
            public List<String> usersNames() {
                List<String> usersNames = new ArrayList<>();
                usersNames.add("Jacek");
                usersNames.add("Tomek");
                usersNames.add("Krzysiek");
                return  usersNames;
            }
            @Override
            public int postsCount() {
                return 200;
            }
            @Override
            public int commentsCount() {
                return 100;
            }
        };

        CalculateAdvStatistics testedStatistics = new CalculateAdvStatistics();
        when (statisticsMock.postsCount()).thenReturn( statisticsFor0Posts.postsCount());
        when (statisticsMock.commentsCount()).thenReturn( statisticsFor0Posts.commentsCount());
        when (statisticsMock. usersNames()).thenReturn( statisticsFor0Posts. usersNames());

        //When
        testedStatistics.calculateAdvStatistics(statisticsMock);
        int expextedNumberOfAverageCommentsPerPost =  testedStatistics.averageCommentsPerPost;
        //Then
        assertTrue(expextedNumberOfAverageCommentsPerPost<1);
    }

    @Test
    void testWhenNumberOfCommentsIsBiggerThanPosts() {
        Statistics statisticsFor0Posts =new Statistics() {
            @Override
            public List<String> usersNames() {
                List<String> usersNames = new ArrayList<>();
                usersNames.add("Jacek");
                usersNames.add("Tomek");
                usersNames.add("Krzysiek");
                return  usersNames;
            }
            @Override
            public int postsCount() {
                return 100;
            }
            @Override
            public int commentsCount() {
                return 1000;
            }
        };

        CalculateAdvStatistics testedStatistics = new CalculateAdvStatistics();
        when (statisticsMock.postsCount()).thenReturn( statisticsFor0Posts.postsCount());
        when (statisticsMock.commentsCount()).thenReturn( statisticsFor0Posts.commentsCount());
        when (statisticsMock. usersNames()).thenReturn( statisticsFor0Posts. usersNames());

        //When
        testedStatistics.calculateAdvStatistics(statisticsMock);
        int expextedNumberOfAverageCommentsPerPost =  testedStatistics.averageCommentsPerPost;
        //Then
        assertTrue(expextedNumberOfAverageCommentsPerPost>1);

    }

    @Test
    void testWhenNumberOfUsersEqual0() {
        Statistics statisticsFor0Posts =new Statistics() {
            @Override
            public List<String> usersNames() {
                List<String> usersNames = new ArrayList<>();
                return  usersNames;
            }
            @Override
            public int postsCount() {
                return 1;
            }
            @Override
            public int commentsCount() {
                return 1;
            }
        };

        CalculateAdvStatistics testedStatistics = new CalculateAdvStatistics();
        when (statisticsMock.postsCount()).thenReturn( statisticsFor0Posts.postsCount());
        when (statisticsMock.commentsCount()).thenReturn( statisticsFor0Posts.commentsCount());
        when (statisticsMock. usersNames()).thenReturn( statisticsFor0Posts. usersNames());

        //When
        testedStatistics.calculateAdvStatistics(statisticsMock);
        int expextedNumberOfUsers =  testedStatistics.numberOfUsers;
        //Then
        assertEquals(0,expextedNumberOfUsers);
    }


    @Test
    void testWhenNumberOfUsersEqual100() {
        Statistics statisticsFor0Posts =new Statistics() {
            @Override
            public List<String> usersNames() {
                List<String> usersNames = new ArrayList<>();
                for (int i=0;i<100; i++) {
                    usersNames.add("Jacek"+i);
                }
                return  usersNames;
            }
            @Override
            public int postsCount() {
                return 1;
            }
            @Override
            public int commentsCount() {
                return 0;
            }
        };

        CalculateAdvStatistics testedStatistics = new CalculateAdvStatistics();
        when (statisticsMock.postsCount()).thenReturn( statisticsFor0Posts.postsCount());
        when (statisticsMock.commentsCount()).thenReturn( statisticsFor0Posts.commentsCount());
        when (statisticsMock. usersNames()).thenReturn( statisticsFor0Posts. usersNames());

        //When
        testedStatistics.calculateAdvStatistics(statisticsMock);
        int expextedNumberOfUsers =  testedStatistics.numberOfUsers;
        //Then
        assertEquals(100,expextedNumberOfUsers);
    }
}