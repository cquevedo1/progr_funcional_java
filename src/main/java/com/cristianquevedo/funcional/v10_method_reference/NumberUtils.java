package main.java.com.cristianquevedo.funcional.v10_method_reference;

public class NumberUtils {
    public NumberUtils() {
    }

    static boolean esPrimo(int valor) {
        for (int i = 2; i < valor; i++) {
            if (valor % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int elevarAlCuadrado(int valor) {
        return valor * valor;
    }
}
