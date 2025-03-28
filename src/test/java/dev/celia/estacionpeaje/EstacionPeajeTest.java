package dev.celia.estacionpeaje;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import dev.celia.vehiculo.Camion;
import dev.celia.vehiculo.Coche;
import dev.celia.vehiculo.Moto;
import dev.celia.vehiculo.Vehiculo;
import dev.celia.estacionpeaje.EstacionPeaje;

public class EstacionPeajeTest {
    
    @Test
    void testRegistrarVehiculoCoche(){
        EstacionPeaje estacion = new EstacionPeaje("Peaje 2", "Gijón");
        Vehiculo coche = new Coche("1234ABC");
        estacion.registrarVehículo(coche);
        assertEquals(100.00, estacion.getTotalRecaudado());
    }

    @Test
    void testRegistrarVehiculoMoto(){
        EstacionPeaje estacion = new EstacionPeaje("Peaje 3", "León");
        Vehiculo moto = new Moto("1234DEF");
        estacion.registrarVehículo(moto);
        assertEquals(50.00, estacion.getTotalRecaudado());
    }
    
    @Test
    void testRegistrarVehiculoCamion(){
        EstacionPeaje estacion = new EstacionPeaje("Peaje 4", "Oviedo");
        Vehiculo camion = new Camion("1234GHI", 2);
        estacion.registrarVehículo(camion);
        assertEquals(100.00, estacion.getTotalRecaudado());
    }

    @Test
    void testRegistrarVehiculoCamionConCarga(){
        EstacionPeaje estacion = new EstacionPeaje("Peaje 5", "Avilés");
        estacion.registrarVehículo(new Camion("1234JKL", 3))
        estacion.registrarVehículo(new Moto("1234DEF"));
        estacion.registrarVehículo(new Coche("1234ABC"));
        assertEquals(150+50+100, estacion.getTotalRecaudado());
    }
}
