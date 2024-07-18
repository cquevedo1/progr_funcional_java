package main.java.com.cristianquevedo.funcional.v2_superfunciones_clases.clases;

import main.java.com.cristianquevedo.funcional.v2_superfunciones_clases.interfaces.Proveedor;

import java.util.Random;

public class Naturales implements Proveedor {

    private static int nextInt = 1;

    @Override
    public Integer obtener() {
        return nextInt++;
    }
}
