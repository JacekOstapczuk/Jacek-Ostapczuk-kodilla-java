package com.kodilla.patterns2.adapter.bookclassifier.libraryb;

import java.util.Objects;

public class BookB {

    private final String author;
    private final String title;
    private final int yearOfPublication;

    public BookB(final String author, final String title, final int yearOfPublication) {
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookB book = (BookB) o;

        if (yearOfPublication != book.yearOfPublication) return false;
        if (!Objects.equals(author, book.author)) return false;
        return Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        int result = author != null ? author.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + yearOfPublication;
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                '}';
    }
}