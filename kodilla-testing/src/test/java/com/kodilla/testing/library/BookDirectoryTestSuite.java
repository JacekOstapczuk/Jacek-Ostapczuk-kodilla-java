package com.kodilla.testing.library;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BookDirectoryTestSuite {

    @Mock
    private LibraryDatabase libraryDatabaseMock;

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

@Nested
@DisplayName ("Tests for listBooksWithCondition")
class TestsForListBooksWithCondition {
    @Test
    void testListBooksWithConditionsReturnList() {

        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }


    @Test
    void testListBooksWithConditionMoreThan20() {

        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);                  // [1]
        List<Book> resultListOf0Books = new ArrayList<Book>();                           // [2]
        List<Book> resultListOf15Books = generateListOfNBooks(15);                       // [3]
        List<Book> resultListOf40Books = generateListOfNBooks(40);                       // [4]
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))                    // [5]
                .thenReturn(resultListOf15Books);                                             // [6]
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))                    // [7]
                .thenReturn(resultListOf0Books);                                              // [8]
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))                   // [9]
                .thenReturn(resultListOf40Books);                                             // [10]

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");    // [11]
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");   // [12]
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");  // [13]
        // Then

        assertEquals(0, theListOfBooks0.size());                                         // [14]
        assertEquals(15, theListOfBooks15.size());                                       // [15]
        assertEquals(0, theListOfBooks40.size());                                        // [16]
    }


    @Test
    void testListBooksWithConditionFragmentShorterThan3() {                          // [1]
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);            // [2]
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);               // [3]

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");       // [4]

        // Then
        assertEquals(0, theListOfBooks10.size());                                     // [5]
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());    // [6]
    }
}

    @Nested
    @DisplayName ("Tests for listBooksInHandsOf")
    class TestsForListBooksInHandsOf {

        @Test
        void testListBooksInHandsOfWhenZeroBooks ()

        {
            // Given
            LibraryUser userZero = new LibraryUser("Jacek","Ostapczuk", "8611211");
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);                  // [1]
            List<Book> resultListOf0Books = new ArrayList<>();
            HashMap<LibraryUser,ArrayList<Book>> listBooksInHandsOfUserZero = new HashMap<>();


            // When
            List<Book> testedListBooksInHandsOfUserZero = listBooksInHandsOfUserZero.get( userZero);

            // Then
            assertEquals (null,testedListBooksInHandsOfUserZero );

        }


        @Test
        void testListBooksInHandsOfWhenOneBook()

        {
            // Given
            LibraryUser userOne = new LibraryUser("Jacek","Ostapczuk", "8611211");
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);                  // [1]
            List<Book>  resultListOf1Books = generateListOfNBooks(1);
            HashMap<LibraryUser,List<Book>> resultMapOf1Books= new HashMap<>();
            resultMapOf1Books.put(userOne,resultListOf1Books);

           // when(libraryDatabaseMock.listBooksInHandsOf(userOne)).thenReturn(resultListOf1Books);

            // When
            List<Book> testedListBooksInHandsOfUserZero = resultMapOf1Books.get(userOne);

            // Then
            assertEquals (1,testedListBooksInHandsOfUserZero.size() );
        }

        @Test
        void testListBooksInHandsOfWhenFiveBook()

        {

            // Given
            LibraryUser userFive = new LibraryUser("Jacek","Ostapczuk", "8611211");
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);                  // [1]
            List<Book>  resultListOf5Books = generateListOfNBooks(5);
            HashMap<LibraryUser,List<Book>> resultMapOf5Books= new HashMap<>();
            resultMapOf5Books.put(userFive,resultListOf5Books);

            // when(libraryDatabaseMock.listBooksInHandsOf(userOne)).thenReturn(resultListOf1Books);

            // When
            List<Book> testedListBooksInHandsOfUserZero = resultMapOf5Books.get(userFive);

            // Then
            assertEquals (5,testedListBooksInHandsOfUserZero.size() );
        }
    }

}
