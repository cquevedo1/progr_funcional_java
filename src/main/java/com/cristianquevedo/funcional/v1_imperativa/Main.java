package main.java.com.cristianquevedo.funcional.v1_imperativa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        new Main();
    }
    public Main() {
//        Objetivos:
//                1- Crear una lista de enteros
        List<Integer> numeros = crearLista();
        System.out.println(numeros);
//                2- Quedarme solo con los pares
        List<Integer> pares = filtrarPares(numeros);
            System.out.println(pares);
//                3- Pasar cada número al cuadrado
        List<Integer> cuadrados = elevarAlCuadrado(pares);
        System.out.println(cuadrados);
//                4- Mostrar cada uno de los números al cuadrado por pantalla
        List<Integer>mostrados = mostrarLista(cuadrados);
//                5- Obtener la suma de los cuadrados
        int total = sumarLista(mostrados);
        System.out.println("Suma de cuadrados: " + total);

    }

    //Versión imperativa
    private List<Integer> crearLista() {
        //List.of construye una lista inmutable
        //es decir, cada operación que se realice va creando una nueva lista
        // y no modifica la lista original
        return List.of(0,1,2,3,5,8,13,21,34,55,89,144);
    }

    private List<Integer> filtrarPares(List<Integer> numeros) {
        List<Integer> pares = new ArrayList<>();
        //Se recorre la lista y se agregan a la lista pares
        // solo los números de la lista original que sean pares
        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                pares.add(numero);
            }
        }
        return pares;
    }

    private List<Integer> elevarAlCuadrado(List<Integer> numeros) {
        List<Integer> cuadrados = new ArrayList<>();
        for (Integer numero : numeros) {
            cuadrados.add(numero * numero);
        }
        return cuadrados;
    }

    private List<Integer> mostrarLista(List<Integer> numeros) {
        List<Integer> resultado = new ArrayList<>();
        for (Integer numero : numeros) {
            System.out.println(numero);
            resultado.add(numero);
        }
        return resultado;
    }

    private int sumarLista(List<Integer> numeros) {
        int resultado = 0;
        for (Integer numero : numeros) {
            resultado += numero;
        }
        return resultado;
    }

}
