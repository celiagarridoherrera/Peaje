package dev.celia.estacionpeaje;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

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
}
