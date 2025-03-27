package dev.celia.vehiculo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MotoTest {
    @Test
    void testMotoPaga50() {

        Moto moto = new Moto("1234DEF");
        
        double peaje = moto.calcularPeaje();
        assertEquals(50, peaje);
        
    }

    @Test
    void testMotoGuardaPlaca() {   
            Moto moto = new Moto("1234ABC");
            assertEquals("1234ABC", moto.getPlaca());
        }

}
