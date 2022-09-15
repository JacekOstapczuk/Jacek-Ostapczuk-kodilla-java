package com.kodilla.testing.collection;


import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    String statement;

    @BeforeEach
    public void before() {
        System.out.println(statement);
    }

    @AfterEach
    public void after() {
        System.out.println(statement);
    }

    @DisplayName(
            "When list ist empty then exterminate should return empty list"
    )
    @Test
   public void  testOddNumbersExterminatorEmptyList() {
        statement = "When list ist empty then exterminate should return empty list";
        //Given
        List<Integer> emptyTestList = new ArrayList<>();

        //When
        OddNumbersExterminator  exterminator  = new OddNumbersExterminator();
        List<Integer> exterminatedEmptyTestList = new ArrayList<>(exterminator. exterminate(emptyTestList));

        int testListSize = exterminatedEmptyTestList.size();
        int expectetListSize = 0;
        //Then
        Assertions.assertEquals( testListSize, expectetListSize);

    }

    @DisplayName(
            "When list have 3 even numbers then exterminate should return list containing 3 numbers"
    )
    @Test
    public void testOddNumbersExterminatorNormalList() {
        statement ="When list have 3 even numbers then exterminate should return list containing 3 numbers";
        //Given
        List<Integer> filledTestList = new ArrayList<>();
        filledTestList.add(1);
        filledTestList.add(2);
        filledTestList.add(3);
        filledTestList.add(4);
        filledTestList.add(5);
        filledTestList.add(6);
        filledTestList.add(0);

        //When

      OddNumbersExterminator  exterminator  = new OddNumbersExterminator();
      List<Integer>  exterminatedTilledTestList =  new ArrayList<>(exterminator. exterminate(filledTestList));

        int testListSize = exterminatedTilledTestList.size();
        int expectetListSize = 3;

        //Then
        Assertions.assertEquals( testListSize, expectetListSize);
    }
}
