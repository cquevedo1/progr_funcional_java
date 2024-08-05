package main.java.com.cristianquevedo.funcional.v15_collect;


import java.util.Objects;

public class Book {

    private final String isbn;
    private final String title;
    private final int yearOfPublication;
    private final Genre genre;

    public Book(String isbn, String title, int yearOfPublication, Genre genre) {
        Objects.requireNonNull(isbn);
        Objects.requireNonNull(title);
        Objects.requireNonNull(genre);
        this.isbn = isbn;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.genre = genre;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", genre=" + genre +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Book book = (Book) object;
        return yearOfPublication == book.yearOfPublication &&
                Objects.equals(isbn, book.isbn) &&
                Objects.equals(title, book.title) &&
                genre == book.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, title, yearOfPublication, genre);
    }
}
