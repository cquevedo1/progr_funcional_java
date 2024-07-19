package main.java.com.cristianquevedo.funcional.v3_superFunciones_inline_clases;

import main.java.com.cristianquevedo.funcional.v2_superFunciones_clases.clases.*;
import main.java.com.cristianquevedo.funcional.v3_superFunciones_inline_clases.interfaces.*;

import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    private Main() {

//        Objetivos:
//                1- Crear una lista de enteros
        List<Integer> numeros = SuperFunciones.proveer(10, new Proveedor() {
            final Random rand = new Random();

            @Override
            public Integer obtener() {
                return rand.nextInt(10);
            }
        });
        System.out.println(numeros);
        
//                2- Quedarme solo con los pares (ahora con las
//                nuevas clases puedo filtrar también solo impares
        List<Integer> filtrados = SuperFunciones.filtrar(numeros, new Predicado() {
            @Override
            public boolean test(Integer valor) {
                return valor % 2 == 0;
            }
        });
        System.out.println(filtrados);

//                3- Obtener el cuadrado de cada número
        List<Integer> transformados = SuperFunciones.transformar(filtrados, new Funcion() {
            @Override
            public Integer aplicar(Integer valor) {
                return valor * valor;
            }
        });
        System.out.println(transformados);

        Consumidor impresion = new Consumidor() {
            @Override
            public void aceptar(Integer valor) {
                System.out.println(valor);
            }
        };

        //        4a- Mostrar cada uno de los números al cuadrado por pantalla
//                y retornar lista

        List<Integer> actuados = SuperFunciones.actuar(transformados, impresion);

        //                4b- Mostrar cada uno de los números al cuadrado por pantalla
        //                y no retornar nada
        SuperFunciones.consumir(transformados, impresion);

//                5- Obtener la suma de los cuadrados
        int total = SuperFunciones.reducir(actuados, 0, new FuncionBinaria() {
            @Override
            public Integer aplicar(Integer valor1, Integer valor2) {
                return valor1 + valor2;
            }
        });
        System.out.println("Suma de los valores: " + total);

    }

}
