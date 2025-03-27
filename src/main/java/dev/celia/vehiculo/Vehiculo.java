package dev.celia.vehiculo;

public abstract class Vehiculo {
    protected String placa;

    public Vehiculo(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public abstract double calcularPeaje();

}
