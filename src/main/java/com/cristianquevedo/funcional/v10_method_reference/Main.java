package main.java.com.cristianquevedo.funcional.v10_method_reference;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    Random rand = new Random();

    private Main() {

        Integer total = Flujo

//                .proveer(10, () -> randomInt())

                .proveer(10, this::randomInt)

//                .filtrar(valor -> esPrimo(valor))

                .filtrar(NumberUtils::esPrimo)

//                .transformar(valor -> elevarAlCuadrado(valor))

                .transformar(NumberUtils::elevarAlCuadrado)

//                .actuar(valor -> System.out.println(valor))

                .actuar(System.out::println)

//                .reducir(0, (valor1, valor2) -> Integer.sum(valor1, valor2));

                .reducir(0, Integer::sum);

        System.out.println("Suma de los valores: " + total);
    }

    private int randomInt() {
        return rand.nextInt(10);
    }

}
