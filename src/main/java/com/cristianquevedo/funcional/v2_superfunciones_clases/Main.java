package main.java.com.cristianquevedo.funcional.v2_superfunciones_clases;

import main.java.com.cristianquevedo.funcional.v2_superfunciones_clases.clases.*;

import java.util.ArrayList;
import java.util.List;

public class  Main {
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
        List<Integer> cuadrados = Superfunciones.transformar(filtrados,new AlCuadrado());
        System.out.println(cuadrados);
//                4- Mostrar cada uno de los números al cuadrado por pantalla
        List<Integer>mostrados = mostrarLista(cuadrados);
//                5- Obtener la suma de los cuadrados
        int total = sumarLista(mostrados);
        System.out.println("Suma de cuadrados: " + total);

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
