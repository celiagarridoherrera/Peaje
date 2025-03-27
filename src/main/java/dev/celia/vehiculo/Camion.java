package dev.celia.vehiculo;

public class Camion extends Vehiculo{

    private int ejes;
    public Camion(String placa, int ejes) {
        super(placa);
        this.ejes = ejes;
    }
    public int getEjes() {
        return ejes;
    }
    @Override
    public double calcularPeaje() {
        return 50.00 * ejes;
    }


}
