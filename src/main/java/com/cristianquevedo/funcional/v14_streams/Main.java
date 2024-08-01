package main.java.com.cristianquevedo.funcional.v14_streams;

import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    Random rand = new Random();

    private Main() {

        rand
                .ints(10, 1, 10)

                .boxed()

                .distinct()

                .filter(NumberUtils::esPrimo)

                .sorted()

                .map(NumberUtils::elevarAlCuadrado)

                .map(Descripcion::new)

                .peek(System.out::println)

                .map(Descripcion::getValue)

                .toList()

                .stream().max(Comparator.naturalOrder())

                .ifPresentOrElse(valor -> System.out.println("Máximo: " + valor), () -> System.out.println("No maximo"));
    }
}
