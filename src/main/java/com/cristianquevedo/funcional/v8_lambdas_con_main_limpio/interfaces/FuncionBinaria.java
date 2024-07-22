package main.java.com.cristianquevedo.funcional.v8_lambdas_con_main_limpio.interfaces;

@FunctionalInterface
public interface FuncionBinaria <T,U,R> {
    R aplicar(T valor1, U valor2);
}
