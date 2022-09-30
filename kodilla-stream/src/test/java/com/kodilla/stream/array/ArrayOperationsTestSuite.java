package com.kodilla.stream.array;


import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {


    @Test
   void  testGetAverage() {


        //Given
        int []testTable = {2,2,2,2,2,4,4,4,4,4,6,6,6,6,6,8,8,8,8,8,};

        //When

        double average =  ArrayOperations.getAverage(testTable);

        //Then
        assertEquals(average ,5);
    }


}
