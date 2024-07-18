package main.java.com.cristianquevedo.funcional.v2_superfunciones_clases.clases;

import main.java.com.cristianquevedo.funcional.v2_superfunciones_clases.interfaces.Proveedor;

import java.util.Random;

public class Aleatorio implements Proveedor {

    Random rand = new Random();

    @Override
    public Integer obtener() {
        return rand.nextInt(1000);
    }
}
