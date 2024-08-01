package main.java.com.cristianquevedo.funcional.v14_streams;

public class Descripcion {

    private final int value;

    public Descripcion(Integer value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "V(" + value + ")";
    }
}
