package main.java.com.cristianquevedo.funcional.v8_lambdas_con_main_limpio.interfaces;

@FunctionalInterface
public interface Predicado <T>{
    boolean test(T valor);
}
