package dev.celia.estacionpeaje;

import java.util.ArrayList;
import java.util.List;

import dev.celia.vehiculo.Vehiculo;

public class EstacionPeaje {
    
    public String nombre;
    public String ciudad;
    public double totalRecaudado;
    public List<Vehiculo> vehiculos;
    public EstacionPeaje(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.totalRecaudado = 0.0;
        this.vehiculos = new ArrayList<>();
    }


    public void registrarVehiculo(Vehiculo vehiculo) {
        double peaje = vehiculo.calcularPeaje();
        totalRecaudado += peaje;
        vehiculos.add(vehiculo);
    }

    public double getTotalRecaudado() {
        return totalRecaudado;
    }

    public String generarResumen() {
        StringBuilder resumen = new StringBuilder();
        resumen.append("Estación: ").append(nombre).append("\n");
        resumen.append("Ciudad: ").append(ciudad).append("\n");
        resumen.append("Total Recaudado: ").append(totalRecaudado).append("\n");
        resumen.append("Vehículos: \n");
        for (Vehiculo v : vehiculos) {
            resumen.append("- ").append(v.getPlaca()).append("\n");
        }
        return resumen.toString();
    }

    public void mostrarResumen() {
        System.out.println(this.generarResumen());
    }
}


