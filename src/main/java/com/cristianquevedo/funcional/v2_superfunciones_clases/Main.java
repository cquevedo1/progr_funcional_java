package main.java.com.cristianquevedo.funcional.v2_superfunciones_clases;

import main.java.com.cristianquevedo.funcional.v2_superfunciones_clases.clases.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
//        Objetivos:
//                1- Crear una lista de enteros
        List<Integer> numeros = Superfunciones.proveer(10, new Naturales());
        System.out.println(numeros);
//                2- Quedarme solo con los pares (ahora con las
//                nuevas clases puedo filtrar también solo impares
        List<Integer> filtrados = Superfunciones.filtrar(numeros, new SoloPares());
        System.out.println(filtrados);
//                3- Obtener el cuadrado de cada número
        List<Integer> transformados = Superfunciones.transformar(filtrados, new AlCuadrado());
        System.out.println(transformados);
//                4a- Mostrar cada uno de los números al cuadrado por pantalla
//                y retornar lista
        List<Integer> actuados = Superfunciones.actuar(transformados, new Impresion());
        //                4b- Mostrar cada uno de los números al cuadrado por pantalla
        //                y no retornar nada
        Superfunciones.consumir(transformados, new Impresion());
//                5- Obtener la suma de los cuadrados
        int total = sumarLista(actuados);
        System.out.println("Suma de cuadrados: " + total);

    }


    private int sumarLista(List<Integer> numeros) {
        int resultado = 0;
        for (Integer numero : numeros) {
            resultado += numero;
        }
        return resultado;
    }

}
