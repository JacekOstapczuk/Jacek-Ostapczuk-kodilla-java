package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Board;
import com.kodilla.patterns.prototype.Task;
import com.kodilla.patterns.prototype.TasksList;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
public void  testGetBooks() {

        //given
        //creating the Library
        Library publicLibrary = new   Library("Publiczna biblioteka nr1");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> publicLibrary.books.add(new Book ("title" +n, "author" +n , LocalDate.now())));

        //making a shallow copy of object Library
        Library  shallowClonedLibrary = null;
        try {
            shallowClonedLibrary = publicLibrary.shallowCopy();
            shallowClonedLibrary .setName("Publiczna biblioteka nr2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object Library
        Library  deepClonedLibrary  = null;
        try {
            deepClonedLibrary  = publicLibrary.deepCopy();
            deepClonedLibrary.setName("Publiczna biblioteka nr3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        publicLibrary.getBooks().clear();

        //Then
        System.out.println(publicLibrary);
        System.out.println(shallowClonedLibrary);
        System.out.println(deepClonedLibrary);
        assertEquals(0, publicLibrary.getBooks().size());
        assertEquals(0, shallowClonedLibrary.getBooks().size());
        assertEquals(10,  deepClonedLibrary.getBooks().size());
        assertEquals(shallowClonedLibrary.getBooks(), publicLibrary.getBooks());
        assertNotEquals( deepClonedLibrary.getBooks(),publicLibrary.getBooks());
    }
}
