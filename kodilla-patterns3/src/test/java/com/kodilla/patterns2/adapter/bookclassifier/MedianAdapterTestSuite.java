package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.BookA;
import com.kodilla.patterns2.adapter.company.SalaryAdapter;
import com.kodilla.patterns2.adapter.company.oldhrsystem.Workers;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.awt.print.Book;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

  //  publicationYearMedianTest

  String x= " w którym stwórz przykładowy zbiór Set<Book> i wywołaj metodę publicationYearMedian() klasy MedianAdapter." +
           "Napisz asercję sprawdzającą, czy wynik testu jest zgodny z oczekiwaniami.";

  @Test
  public void  publicationYearMedianTest() {
    // Given
    BookA bookA1= new BookA("a", "a", 2000, "a");
    BookA bookA2= new BookA("b", "b", 2000, "b");
    BookA bookA3= new BookA("c", "c", 2000, "c");
    BookA bookA4= new BookA("d", "d", 2020, "d");
    BookA bookA5= new BookA("e", "e", 2020, "e");
    BookA bookA6= new BookA("f", "f", 2020, "f");
    Set<BookA> bookASet = new HashSet<>();
    bookASet.add(bookA1);
    bookASet.add(bookA2);
    bookASet.add(bookA3);
    bookASet.add(bookA4);
    bookASet.add(bookA5);
    bookASet.add(bookA6);
    MedianAdapter medianAdapter= new MedianAdapter();

    // When
   int medianYear = medianAdapter.publicationYearMedian(bookASet);

    // Then
    assertEquals(2010, medianYear);
  }
}
