package main.java.com.cristianquevedo.funcional.v11_method_reference_avanzado;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    Random rand = new Random();

    private Main() {

        Integer total = Flujo

                .proveer(10, this::randomInt)

                .filtrar(NumberUtils::esPrimo)

//                .ordenar((valor1, valor2) -> valor1.compareTo(valor2))

                .ordenar(Integer::compareTo)

                .transformar(NumberUtils::elevarAlCuadrado)

//                .transformar(valor -> new Descripcion(valor))

                .transformar(Descripcion::new)

                .actuar(System.out::println)

//                .transformar(descripcion -> descripcion.getValue())

                .transformar(Descripcion::getValue)

                .reducir(0, Integer::sum);

        System.out.println("Suma de los valores: " + total);
    }

    private int randomInt() {
        return rand.nextInt(10);
    }

}
