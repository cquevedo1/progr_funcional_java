package main.java.com.cristianquevedo.funcional.v15_collect;


import java.util.Objects;

public record Book(String isbn, String title, int yearOfPublication, Genre genre) {

    public Book {
        Objects.requireNonNull(isbn);
        Objects.requireNonNull(title);
        Objects.requireNonNull(genre);
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

}
