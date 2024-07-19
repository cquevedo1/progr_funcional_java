package main.java.com.cristianquevedo.funcional.v4_superFunciones_genericas;

import main.java.com.cristianquevedo.funcional.v4_superFunciones_genericas.interfaces.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

       private Main() {

//        Objetivos:
//                1- Crear una lista de enteros
        List<Integer> numeros = SuperFunciones.proveer(10, new Proveedor<>() {
            final Random rand = new Random();

            @Override
            public Integer obtener() {
                return rand.nextInt(10);
            }
        });
        System.out.println(numeros);

//                2- Quedarme solo con los pares (ahora con las
//                nuevas clases puedo filtrar también solo impares
        List<Integer> filtrados = SuperFunciones.filtrar(numeros, new Predicado<>() {
            @Override
            public boolean test(Integer valor) {
                return valor % 2 == 0;
            }
        });
        System.out.println(filtrados);

//                3a- Obtener el cuadrado de cada número
        List<Integer> transformados = SuperFunciones.transformar(filtrados, new OperadorUnario<>() {
            @Override
            public Integer aplicar(Integer valor) {
                return valor * valor;
            }
        });
        System.out.println(transformados);

//           3b- Obtener cada número convertido en cadena
        List<String> convertidosEnCadenas = SuperFunciones.transformar(filtrados, new Funcion<Integer, String>() {
            @Override
            public String aplicar(Integer valor) {
                return "Valor: " + valor;
            }
        });
           System.out.println(convertidosEnCadenas);

        //almaceno en una variable de tipo interfaz el valor de una función
        Consumidor<Integer> impresion = new Consumidor<>() {
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
        Integer total = SuperFunciones.reducir(actuados, 0, new OperadorBinario<>() {
            @Override
            public Integer aplicar(Integer valor1, Integer valor2) {
                return valor1 + valor2;
            }
        });
        System.out.println("Suma de los valores: " + total);

    }

}
