package main.java.com.cristianquevedo.funcional.v8_lambdas_con_main_limpio;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    private Main() {

        Integer total = Flujo

                .proveer(10, () -> {
                    final Random rand = new Random();
                   return rand.nextInt(10);
                })

                .filtrar(valor -> valor % 2 == 0)

                .transformar(valor -> valor * valor)

                .actuar(valor -> System.out.println(valor))
                
                .reducir(0, (valor1, valor2) -> valor1 + valor2);

        System.out.println("Suma de los valores: " + total);
    }
}
