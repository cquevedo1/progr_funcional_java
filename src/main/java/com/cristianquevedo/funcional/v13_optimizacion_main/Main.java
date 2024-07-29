package main.java.com.cristianquevedo.funcional.v13_optimizacion_main;

import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    Random rand = new Random();

    private Main() {

            Flujo

                .proveer(10, this::randomInt)

                .filtrar(NumberUtils::esPrimo)

                .ordenar(Integer::compareTo)

                .transformar(NumberUtils::elevarAlCuadrado)

                .transformar(Descripcion::new)

                .actuar(System.out::println)

                .transformar(Descripcion::getValue)

                .max(Comparator.naturalOrder())

        //Si el flujo no está vacío imprime el valor máximo
                .ifPresentOrElse(valor -> System.out.println("Máximo: " + valor), () -> System.out.println("No maximo"));
    }

    private int randomInt() {
        return rand.nextInt(10);
    }

}
