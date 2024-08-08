package main.java.com.cristianquevedo.funcional.v15_collect;

import java.util.*;
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
//
//        Map<String, Book> result = myBooks.stream()
//                .filter(book -> book.getYearOfPublication() < 2000)
//                .collect((Collectors.toList()));
//                .collect((Collectors.toSet()));
//        .collect(Collectors.toMap(book -> book.getIsbn(), book -> book));
        //Con referencia a método
//                .collect(Collectors.toMap(Book::getIsbn, book -> book));

        //otra opción, al tener la misma clave los agrupa
//                .collect(Collectors.toMap(Book::getIsbn, Function.identity(),
//                        (book1, book2) -> new Book(book1.getIsbn(),
//                                book1.getTitle() + " + ",
//                                book1.getYearOfPublication(),
//                                book1.getGenre()),
//                        () -> new TreeMap<>(String.CASE_INSENSITIVE_ORDER))
//                );
//        System.out.println(result);

        //Stream hacia array

//        Book[] result = myBooks.stream()
//                .filter(book -> book.getYearOfPublication() > 2000)
//                .distinct()
//                .toArray(Book[]::new);
//        Arrays.stream(result).forEach(System.out::println);


        //Stream a string
//        String result = myBooks.stream()
//                .distinct()
//                .map(Book::getTitle)
//                .collect(Collectors.joining(", ","[","]"));
//        System.out.println(result);

        //Stream a string 2da opcion (menos optimizada)
//        String result = myBooks.stream()
//                .distinct()
//                .collect(Collectors.mapping(Book::getTitle, Collectors.joining(", ")));
//        System.out.println(result);


        //Collect de un stream con agrupacion
//      Map<Integer,List<Book>> result = myBooks.stream()
//                .collect(Collectors.groupingBy(Book::getYearOfPublication));
//        System.out.println(result );

        //Collect de un stream con agrupación que solo muestra los titulos de los libros
//        Map<Integer, String> result = myBooks.stream()
//                .collect(Collectors.groupingBy(Book::getYearOfPublication,
//                        Collectors.mapping(Book::getTitle,
//                                Collectors.joining(",","[","]"))));
//        System.out.println(result);
        
        //Recolector de reduccion simple (queremos contar la cantidad de libros en cada año
//        Map<Integer, Long> result = myBooks.stream()
//                .collect(Collectors.groupingBy(Book::getYearOfPublication,
//                        Collectors.counting()));
//        System.out.println(result);

        //Recolector de reduccion simple (suma de años)
//        Map<Genre, Integer> result = myBooks.stream()
//                .collect(Collectors.groupingBy(Book::getGenre,
//                        Collectors.summingInt(Book::getYearOfPublication)));
//        System.out.println(result);

        //Recolector de reduccion simple (menor año según genero)
//        Map<Genre, Optional<Book>> result = myBooks.stream()
//                .collect(Collectors.groupingBy(Book::getGenre,
//                        Collectors.minBy(Comparator.comparing(Book::getYearOfPublication))));
//        System.out.println(result);

        //Recolector de reducción simple (estadística)
//        Map<Genre, IntSummaryStatistics> result = myBooks.stream()
//                .collect(Collectors.groupingBy(Book::getGenre,
//                        Collectors.summarizingInt(Book::getYearOfPublication)));
//        System.out.println(result);

        //Recolección de un stream con partición (separa en dos grupos según un predicado)
//        Map<Boolean, List<Book>> result = myBooks.stream()
//                .collect(Collectors.partitioningBy(book -> book.getYearOfPublication() < 2000));
//        System.out.println(result);

        //En el caso de que solo queramos saber el total de libros se podría realizar lo siguiente
        Map<Boolean, Long> result = myBooks.stream()
                .collect(Collectors.partitioningBy(book -> book.getYearOfPublication() < 2000, Collectors.counting()));
        System.out.println(result);
    }
}
