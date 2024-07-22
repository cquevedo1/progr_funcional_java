package main.java.com.cristianquevedo.funcional.v7_lambdas;

import main.java.com.cristianquevedo.funcional.v7_lambdas.interfaces.*;

import java.util.ArrayList;
import java.util.List;

public class Flujo<T> {

    private final List<T> valores;
    public Flujo(List<T> valores) {
        this.valores = valores;
    }

    public static <T> Flujo<T> proveer(int size, Proveedor<T> proveedor) {
        List<T> resultado = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            resultado.add(proveedor.obtener());
        }
        return new Flujo<>(resultado);
    }

    public Flujo<T> filtrar(Predicado<T> predicado) {
        List<T> resultado = new ArrayList<>();
        for (T valor : valores) {
            if (predicado.test(valor)) {
                resultado.add(valor);
            }
        }
        return new Flujo<>(resultado);
    }

    public <R> Flujo<R> transformar(Funcion<T,R> funcion) {
        List<R> resultado = new ArrayList<>();
        for (T valor : valores) {
            resultado.add(funcion.aplicar(valor));

        }
        return new Flujo<>(resultado);
    }

    public Flujo<T> actuar(Consumidor<T> consumidor) {
        for (T valor : valores) {
            consumidor.aceptar(valor);
        }
        return new Flujo<>(valores);
    }

    //operacion terminal
    public void consumir(Consumidor<T> consumidor) {
        for (T valor : valores) {
            consumidor.aceptar(valor);
        }
    }

    //operacion terminal
    public T reducir(T identidad,
                                  OperadorBinario<T> funcionBinaria) {
        T resultado = identidad;
        for (T valor : valores) {
            resultado = funcionBinaria.aplicar(resultado, valor);
        }
        return resultado;
    }

    @Override
    public String toString() {
        return valores.toString();
    }
}
