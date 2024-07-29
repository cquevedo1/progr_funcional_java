package main.java.com.cristianquevedo.funcional.v12_optional;

import java.util.Comparator;
import java.util.Optional;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    Random rand = new Random();

    private Main() {

        Optional<Integer> maximo = Flujo

                .proveer(10, this::randomInt)

                .filtrar(NumberUtils::esPrimo)

                .ordenar(Integer::compareTo)

                .transformar(NumberUtils::elevarAlCuadrado)

                .transformar(Descripcion::new)

                .actuar(System.out::println)

                .transformar(Descripcion::getValue)

//                opciones:
//                .max((valor1, valor2) -> valor1 - valor2);
//                .max(Integer::compare);
//                .max(Integer::compareTo);

                .max(Comparator.naturalOrder());

//                .reducir(0, Integer::sum);

//        System.out.println("Máximo: " + maximo);

        //Si el flujo no está vacío imprime el valor máximo
        maximo.ifPresentOrElse(valor -> System.out.println("Máximo: " + valor), () -> System.out.println("No maximo"));
    }

    private int randomInt() {
        return rand.nextInt(10);
    }

}
