package main.java.com.cristianquevedo.funcional.v15_collect;


public class Book {

    private final String isbn;
    private final String title;
    private final int yearOfPublication;
    private final Genre genre;

    public Book(String isbn, String title, int yearOfPublication, Genre genre) {
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
}
