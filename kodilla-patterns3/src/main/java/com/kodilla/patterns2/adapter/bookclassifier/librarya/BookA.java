package com.kodilla.patterns2.adapter.bookclassifier.librarya;


import java.util.Objects;

public class BookA {

    private final String author;
    private final String title;
    private final int publicationYear;
    private final String signature;

    public BookA(final String author, final String title,
                 final int publicationYear, final String signature) {
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
        this.signature = signature;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getSignature() {
        return signature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookA book = (BookA) o;

        if (publicationYear != book.publicationYear) return false;
        if (!Objects.equals(author, book.author)) return false;
        if (!Objects.equals(title, book.title)) return false;
        return Objects.equals(signature, book.signature);
    }

    @Override
    public int hashCode() {
        int result = author != null ? author.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + publicationYear;
        result = 31 * result + (signature != null ? signature.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", publicationYear=" + publicationYear +
                ", signature='" + signature + '\'' +
                '}';
    }
}