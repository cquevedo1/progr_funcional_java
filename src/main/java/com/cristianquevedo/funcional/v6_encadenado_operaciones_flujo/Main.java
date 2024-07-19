package main.java.com.cristianquevedo.funcional.v6_encadenado_operaciones_flujo;

import main.java.com.cristianquevedo.funcional.v6_encadenado_operaciones_flujo.interfaces.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    private Main() {

        Integer total = Flujo

                .proveer(10, new Proveedor<Integer>() {
                    final Random rand = new Random();

                    @Override
                    public Integer obtener() {
                        return rand.nextInt(10);
                    }
                })

                .filtrar(new Predicado<>() {
                             @Override
                             public boolean test(Integer valor) {
                                 return valor % 2 == 0;
                             }
                         })

                .transformar(new OperadorUnario<>() {
                    @Override
                    public Integer aplicar(Integer valor) {
                        return valor * valor;
                    }
                })

                .actuar(new Consumidor<>() {
                    @Override
                    public void aceptar(Integer valor) {
                        System.out.println(valor);
                    }
                })
                
                .reducir(0, new OperadorBinario<>() {
                    @Override
                    public Integer aplicar(Integer valor1, Integer valor2) {
                        return valor1 + valor2;
                    }
                });

        System.out.println("Suma de los valores: " + total);
    }
}
