package main.java.com.cristianquevedo.funcional.v2_superfunciones_clases.clases;

import main.java.com.cristianquevedo.funcional.v2_superfunciones_clases.interfaces.Funcion;

public class AlCuadrado implements Funcion {
    @Override
    public Integer aplicar(Integer valor) {
        return valor * valor;
    }
}
