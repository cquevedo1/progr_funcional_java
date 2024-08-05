package main.java.com.cristianquevedo.funcional.v15_collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        new Main();
    }
    public Main() {
        List<Book> myBooks = Arrays.asList(
                new Book("345-89", "Los ojos del dragon", 2018, Genre.TERROR),
                new Book("923-45", "Puente al infinito", 1998, Genre.NOVELA),
                new Book("978-25", "The Hobbit", 2017, Genre.THRILLER),
                new Book("923-45", "Puente al infinito", 1998, Genre.NOVELA),
                new Book("978-25", "The Hobbit", 2017, Genre.THRILLER)
        );

        Map<String, Book> result = myBooks.stream()
                .filter(book -> book.getYearOfPublication() < 2000)
//                .collect((Collectors.toList()));
//                .collect((Collectors.toSet()));
//        .collect(Collectors.toMap(book -> book.getIsbn(), book -> book));
                //Con referencia a método
//                .collect(Collectors.toMap(Book::getIsbn, book -> book));

                //otra opción, al tener la misma clave los agrupa
                .collect(Collectors.toMap(Book::getIsbn, Function.identity(),
                        (book1, book2) -> new Book(book1.getIsbn(),
                                book1.getTitle() + "+",
                                book1.getYearOfPublication(),
                                book1.getGenre())));
        System.out.println(result);
    }
}
