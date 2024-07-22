package main.java.com.cristianquevedo.funcional.v7_lambdas.interfaces;

@FunctionalInterface
public interface Predicado <T>{
    boolean test(T valor);
}
