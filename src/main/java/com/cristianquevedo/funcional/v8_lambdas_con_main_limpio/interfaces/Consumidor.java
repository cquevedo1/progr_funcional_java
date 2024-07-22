package main.java.com.cristianquevedo.funcional.v8_lambdas_con_main_limpio.interfaces;

@FunctionalInterface
public interface Consumidor <T>{
    void aceptar(T valor);
}
