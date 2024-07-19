package main.java.com.cristianquevedo.funcional.v2_superFunciones_clases.clases;

import main.java.com.cristianquevedo.funcional.v2_superFunciones_clases.interfaces.Consumidor;

public class Impresion implements Consumidor {
    @Override
    public void aceptar(Integer valor) {
        System.out.println(valor);
    }
}
