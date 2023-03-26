package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.BookA;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookB;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter  extends  MedianAdaptee implements Classifier {

    public int publicationYearMedian(Set<BookA> bookSet) {
        Map<BookSignature, BookB> books = new HashMap<>();
        for (BookA book : bookSet) {
            books.put(new BookSignature(book.getSignature()), new BookB(book.getAuthor(), book.getTitle(), book.getPublicationYear()));
        }
        return averagePublicationYear(books);
    }
}
