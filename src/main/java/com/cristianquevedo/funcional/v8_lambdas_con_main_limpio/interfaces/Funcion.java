package main.java.com.cristianquevedo.funcional.v8_lambdas_con_main_limpio.interfaces;

@FunctionalInterface
public interface Funcion <T, R>{
    R aplicar(T valor);
}
