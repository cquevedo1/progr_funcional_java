package main.java.com.cristianquevedo.funcional.v2_superFunciones_clases.clases;

import main.java.com.cristianquevedo.funcional.v2_superFunciones_clases.interfaces.Proveedor;

public class Naturales implements Proveedor {

    private static int nextInt = 1;

    @Override
    public Integer obtener() {
        return nextInt++;
    }
}
