package main.java.com.cristianquevedo.funcional.v11_method_reference_avanzado;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

public class Flujo<T> {

    private final List<T> valores;
    public Flujo(List<T> valores) {
        this.valores = valores;
    }

    public static <T> Flujo<T> proveer(int size, Supplier<T> proveedor) {
        List<T> resultado = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            resultado.add(proveedor.get());
        }
        return new Flujo<>(resultado);
    }

    public Flujo<T> filtrar(Predicate<T> predicado) {
        List<T> resultado = new ArrayList<>();
        for (T valor : valores) {
            if (predicado.test(valor)) {
                resultado.add(valor);
            }
        }
        return new Flujo<>(resultado);
    }

    public <R> Flujo<R> transformar(Function<T,R> funcion) {
        List<R> resultado = new ArrayList<>();
        for (T valor : valores) {
            resultado.add(funcion.apply(valor));

        }
        return new Flujo<>(resultado);
    }

    public Flujo<T> actuar(Consumer<T> consumidor) {
        for (T valor : valores) {
            consumidor.accept(valor);
        }
        return new Flujo<>(valores);
    }

    //operacion terminal
    public void consumir(Consumer<T> consumidor) {
        for (T valor : valores) {
            consumidor.accept(valor);
        }
    }

    public Flujo<T> ordenar(Comparator<T> comparador) {
        List<T> listaOrdenada = new ArrayList<>(valores);
        listaOrdenada.sort(comparador);
        return new Flujo<>(listaOrdenada);
    }

    //operacion terminal
    public T reducir(T identidad,
                                  BinaryOperator<T> funcionBinaria) {
        T resultado = identidad;
        for (T valor : valores) {
            resultado = funcionBinaria.apply(resultado, valor);
        }
        return resultado;
    }

    @Override
    public String toString() {
        return valores.toString();
    }
}
