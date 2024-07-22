package main.java.com.cristianquevedo.funcional.v7_lambdas.interfaces;

@FunctionalInterface
public interface Funcion <T, R>{
    R aplicar(T valor);
}
