package main.java.com.cristianquevedo.funcional.v2_superFunciones_clases;

import main.java.com.cristianquevedo.funcional.v2_superFunciones_clases.clases.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    private Main() {
//        Objetivos:
//                1- Crear una lista de enteros
        List<Integer> numeros = SuperFunciones.proveer(10, new Aleatorio());
        System.out.println(numeros);
//                2- Quedarme solo con los pares (ahora con las
//                nuevas clases puedo filtrar también solo impares
        List<Integer> filtrados = SuperFunciones.filtrar(numeros, new SoloPares());
        System.out.println(filtrados);
//                3- Obtener el cuadrado de cada número
        List<Integer> transformados = SuperFunciones.transformar(filtrados, new AlCuadrado());
        System.out.println(transformados);
//                4a- Mostrar cada uno de los números al cuadrado por pantalla
//                y retornar lista
        List<Integer> actuados = SuperFunciones.actuar(transformados, new Impresion());
        //                4b- Mostrar cada uno de los números al cuadrado por pantalla
        //                y no retornar nada
        SuperFunciones.consumir(transformados, new Impresion());
//                5- Obtener la suma de los cuadrados
        int total = SuperFunciones.reducir(actuados, 0, new Sumador());
        System.out.println("Suma de los valores: " + total);

    }

}
