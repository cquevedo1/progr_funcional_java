package main.java.com.cristianquevedo.funcional.v2_superFunciones_clases.clases;

import main.java.com.cristianquevedo.funcional.v2_superFunciones_clases.interfaces.Predicado;

public class SoloImpares implements Predicado {

    @Override
    public boolean test(Integer valor){

        return valor % 2 != 0;
    }
}
