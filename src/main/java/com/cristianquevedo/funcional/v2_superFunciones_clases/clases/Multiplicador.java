package main.java.com.cristianquevedo.funcional.v2_superFunciones_clases.clases;

import main.java.com.cristianquevedo.funcional.v2_superFunciones_clases.interfaces.FuncionBinaria;

public class Multiplicador implements FuncionBinaria {
    @Override
    public Integer aplicar(Integer valor1, Integer valor2) {
        return valor1 * valor2;
    }
}
